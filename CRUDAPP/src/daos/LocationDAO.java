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
import models.Location;

/**
 *
 * @author rezar
 */
public class LocationDAO {
    private Connection connection;
    
    public LocationDAO (Connection connection){
        this.connection = connection;
    }
    
    //Membuat data dari database kedalam list array.
    
    public List<Location> getAll() {
        List<Location> locations = new ArrayList<Location>();
        String query = "SELECT * FROM LOCATIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Location loc = new Location();
                loc.setLocation_id(resultSet.getInt(1));
                loc.setStreet(resultSet.getString(2));
                loc.setPostal_code(resultSet.getString(3));
                loc.setCity(resultSet.getString(4));
                loc.setState(resultSet.getString(5));
                loc.setCountry_id(resultSet.getString(6));
                locations.add(loc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return locations;
    }
    
    // Melakukan insert data kedalam database
    public boolean insert(Location location){
        boolean result = false;
        String query = "INSERT INTO LOCATIONS(LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setInt(1, location.getLocation_id());
            preparedstatement.setString(2, location.getStreet());
            preparedstatement.setString(3, location.getPostal_code());
            preparedstatement.setString(4, location.getCity());
            preparedstatement.setString(5, location.getState());
            preparedstatement.setString(6, location.getCountry_id());
            preparedstatement.executeQuery();
            result = true;
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    } 
    
    //Menghapus data dari database kedalam list array.
    
    public boolean delete(Location location) {
        boolean result = false;
        String query = "DELETE FROM LOCATIONS WHERE LOCATION_ID = ?";
        try {
            PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setInt(1, location.getLocation_id());
            preparedstatement.executeUpdate();
            result = true;
        
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    //Mengupdate Data
    public boolean update(Location location){
        boolean result = false;
        String query = "UPDATE LOCATIONS SET STREET_ADDRESS = ?, POSTAL_CODE = ?, CITY = ?, STATE_PROVINCE = ?, COUNTRY_ID = ? WHERE LOCATION_ID = ?";
        try{
             PreparedStatement preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, location.getStreet());
            preparedstatement.setString(2, location.getPostal_code());
            preparedstatement.setString(3, location.getCity());
            preparedstatement.setString(4, location.getState());
            preparedstatement.setString(5, location.getCountry_id());
            preparedstatement.setInt(6, location.getLocation_id());
            preparedstatement.executeQuery();
            result = true;
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
}
