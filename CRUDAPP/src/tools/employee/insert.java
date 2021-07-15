/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.employee;

import daos.EmployeeDAO;

import tools.DB_Connections;



/**
 *
 * @author Kenji
 */
public class insert {
    
    
        DB_Connections connect = new DB_Connections();
        
        EmployeeDAO empDAO = new EmployeeDAO(connect.getConnection());
    
    
        Employee em = new Employee();
        
        em.setId_employee(207);
  
        em.setFirst_name("ddddd");
    
        em.setLast_name("sssssss");
        em.setEmail("asda@gmail.com");
        em.setPhone_number("19139");
        em.setHire_date("10/Mar/2003");
       
        em.setJob_id("AD_VP");
        em.setSalary(1001);
        em.setCommission_pct(0.2);
        em.setManager_id(124);
        em.setDepartment_id(60);
       
        if (empDAO.insert(em)) {
            System.out.println("Input Data Berhasil");
        }        em.setCommission_pct(0.2);
    
    
    
}
