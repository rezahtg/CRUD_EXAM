/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import models.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenji
 */
public class EmployeeDAO {
    
    private Connection connection;
    
    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Employee> getEmployees() {
        List<Employee> emplo = new ArrayList<Employee>();
        String query = "SELECT * FROM Employees order by employee_id";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee e = new Employee();
                e.setId_employee(resultSet.getInt(1));
                e.setFirst_name(resultSet.getString(2));
                e.setLast_name(resultSet.getString(3));
                e.setEmail(resultSet.getString(4));
                e.setPhone_number(resultSet.getString(5));
                e.setHire_date(resultSet.getString(6));
                e.setJob_id(resultSet.getString(7));
                e.setSalary(resultSet.getDouble(8));
                e.setCommission_pct(resultSet.getDouble(9));
                e.setManager_id(resultSet.getInt(10));
                e.setDepartment_id(resultSet.getInt(11));
                
                
                emplo.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emplo;
    }
    
    
    public boolean Update(Employee emp) {
        boolean result = false;
        String query = "Update Employees SET first_name = ?, last_name = ?, email = ?, phone_number = ?,"
                + "job_id = ?, salary = ?, manager_id = ?, department_id = ?  Where employee_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            
            preparedStatement.setString(1, emp.getFirst_name());
            preparedStatement.setString(2, emp.getLast_name());
            preparedStatement.setString(3, emp.getEmail());
            preparedStatement.setString(4, emp.getPhone_number());
            
            
           // preparedStatement.setString(6, emp.getHire_date());
            preparedStatement.setString(5, emp.getJob_id());
            preparedStatement.setDouble(6, emp.getSalary());
         //   preparedStatement.setDouble(7, emp.getCommission_pct());
            preparedStatement.setInt(7, emp.getManager_id());
            preparedStatement.setInt(8, emp.getDepartment_id());
            
            preparedStatement.setInt(9, emp.getId_employee());
       
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    
    
    public boolean insert(Employee emp) {
        boolean result = false;
        String query = "INSERT INTO Employees("
                + "employee_id, "
                + "first_name,"
                + "last_name,"
                + "email,"
                + "phone_number,"
                + "hire_date,"
                + "job_id,"
                + "salary,"
                + "commission_pct,"
                + "manager_id,"
                + "department_id) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setInt(1, emp.getId_employee());
            preparedStatement.setString(2, emp.getFirst_name());
            preparedStatement.setString(3, emp.getLast_name());
            preparedStatement.setString(4, emp.getEmail());
            preparedStatement.setString(5, emp.getPhone_number());
            
            preparedStatement.setString(6, emp.getHire_date());
            preparedStatement.setString(7, emp.getJob_id());
            preparedStatement.setDouble(8, emp.getSalary());
            preparedStatement.setDouble(9, emp.getCommission_pct());
            preparedStatement.setInt(10, emp.getManager_id());
            preparedStatement.setInt(11, emp.getDepartment_id());
            
           
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    
    public boolean Delete(Employee emp) {
        boolean result = false;
        String query = "Delete From Employees Where employee_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, emp.getId_employee());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    
    
}
