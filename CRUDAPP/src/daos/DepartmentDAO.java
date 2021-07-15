/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import models.Department;
import models.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenji
 */
public class DepartmentDAO {
    private Connection connection;
    
    public DepartmentDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Department> getDepartment() {
        List<Department> dep = new ArrayList<Department>();
        String query = "SELECT * FROM Departments";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Department e = new Department();
                e.setDepartment_id(resultSet.getInt(1));
                e.setDepartment_name(resultSet.getString(2));
                e.setManager_id(resultSet.getInt(3));
                e.setLocation_id(resultSet.getInt(4));
           
                dep.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dep;
    }
    
    
    public boolean Update(Department dep) {
        boolean result = false;
        String query = "UPDATE DEPARTMENTS SET department_name=?, manager_id=?, location_id = ? WHERE department_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            
            preparedStatement.setString(1, dep.getDepartment_name());
            preparedStatement.setInt(2, dep.getManager_id());
            preparedStatement.setInt(3, dep.getLocation_id());
            preparedStatement.setInt(4, dep.getDepartment_id());
            
            

            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    
    public boolean insert(Department dep) {
        boolean result = false;
        String query = "INSERT INTO DEPARTMENTS(department_id, department_name,manager_id,location_id) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setInt(1, dep.getDepartment_id());
            preparedStatement.setString(2, dep.getDepartment_name());
            preparedStatement.setInt(3, dep.getManager_id());
            preparedStatement.setInt(4, dep.getLocation_id());
           
            
            
            
           
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    
    public boolean Delete(Department dep) {
        boolean result = false;
        String query = "Delete From Departments Where department_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, dep.getDepartment_id());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
