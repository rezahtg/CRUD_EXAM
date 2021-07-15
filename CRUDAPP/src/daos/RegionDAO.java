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
import models.Region;

/**
 *
 * @author haikal
 */
public class RegionDAO {
     private Connection connection;

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Region> getAll() {
        List<Region> regions = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Region r = new Region();
                r.setIdReg(resultSet.getInt(1));
                r.setNameReg(resultSet.getString(2));
                regions.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;
    } 
    public boolean insert(Region region) {
        boolean result = false;
        String query = "INSERT INTO REGIONS(region_name,region_id) VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getNameReg());
            preparedStatement.setInt(2, region.getIdReg());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    public boolean delete(Region delReg) {
        boolean result = false;
        String query = "DELETE FROM REGIONS WHERE region_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, delReg.getIdReg());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    public boolean update(Region reg) {
        boolean result = false;
        String query = "UPDATE REGIONS set region_name=? WHERE region_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, reg.getNameReg());
            preparedStatement.setInt(2, reg.getIdReg());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
