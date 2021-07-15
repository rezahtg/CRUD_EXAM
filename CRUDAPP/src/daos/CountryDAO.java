/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Country;

/**
 *
 * @author rezar
 */
public class CountryDAO {
    private Connection connection;
    
    public CountryDAO (Connection connection){
        this.connection = connection;
    }
    
    //Membuat data dari database kedalam list array.
    
    public List<Country> getAll() {
        List<Country> countries = new ArrayList<Country>();
        String query = "SELECT * FROM COUNTRIES";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country c = new Country();
                c.setCountry_id(resultSet.getString(1));
                c.setCountry_name(resultSet.getString(2));
                c.setRegion_id(resultSet.getInt(3));
                countries.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countries;
    }
    
    // Melakukan insert data kedalam database
    public boolean insert(Country country){
        boolean result = false;
        String query = "INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES (?,?,?)";
        try{
            PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, country.getCountry_id());
            preparedstatement.setString(2, country.getCountry_name());
            preparedstatement.setInt(3, country.getRegion_id());
            preparedstatement.executeQuery();
            result = true;
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    } 
    
    //Menghapus data dari database kedalam list array.
    
    public boolean delete(Country country) {
        boolean result = false;
        String query = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?";
        try {
            PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, country.getCountry_id());
            preparedstatement.executeUpdate();
            result = true;
        
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    //Mengupdate Data
    public boolean update(Country country){
        boolean result = false;
        String query = "UPDATE COUNTRIES SET COUNTRY_NAME = ?, REGION_ID = ? WHERE COUNTRY_ID = ?";
        try{
             PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, country.getCountry_name());
            preparedstatement.setInt(2, country.getRegion_id());
            preparedstatement.setString(3, country.getCountry_id());
            preparedstatement.executeQuery();
            result = true;
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
}
