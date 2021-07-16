/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.department;

import daos.DepartmentDAO;
import models.Department;
import oracle.net.aso.i;
import tools.DB_Connections;

/**
 *
 * @author Kenji
 */
public class DepartmentTable {
    
    public static DB_Connections connect = new DB_Connections();
    public static DepartmentDAO depDAO = new DepartmentDAO(connect.getConnection());
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    
    
    public static void insertdept()
    {
        
        String Id_dept, Name_dept, managerId_depet,locationId_dept;
        int Id_dept2,managerId_depet2,locationId_dept2;
        
        System.out.print("Masukkan ID Department = ");
        Id_dept = scanner.nextLine();
        Id_dept2 = Integer.parseInt(Id_dept);                
        System.out.print("Masukkan  Name Department = ");
        Name_dept = scanner.nextLine();
        
        System.out.print("Masukkan Manager ID  = ");
        managerId_depet = scanner.nextLine();
        managerId_depet2 = Integer.parseInt(managerId_depet); 
        
        System.out.print("Masukkan Location Id = ");
        locationId_dept = scanner.nextLine();
        locationId_dept2 = Integer.parseInt(locationId_dept); 
        
        //Insert Department


        Department dep = new Department();
        dep.setDepartment_id(Id_dept2);
  
        dep.setDepartment_name(Name_dept);
    
        dep.setManager_id(managerId_depet2);
        dep.setLocation_id(locationId_dept2);
       
       
        if (depDAO.insert(dep)) {
            System.out.println("Insert Data Berhasil");
        }    
    }
    public static void updatedept()
    {
        
        String Id_dept, Name_dept, managerId_depet,locationId_dept;
        int Id_dept2,managerId_depet2,locationId_dept2;
        
        System.out.print("Masukkan ID Department = ");
        Id_dept = scanner.nextLine();
        Id_dept2 = Integer.parseInt(Id_dept);                
        System.out.print("Masukkan  Name Department = ");
        Name_dept = scanner.nextLine();
        
        System.out.print("Masukkan Manager ID  = ");
        managerId_depet = scanner.nextLine();
        managerId_depet2 = Integer.parseInt(managerId_depet); 
        
        System.out.print("Masukkan Location Id = ");
        locationId_dept = scanner.nextLine();
        locationId_dept2 = Integer.parseInt(locationId_dept); 
        
        // Update Department

        Department dep = new Department();
        
        dep.setDepartment_id(Id_dept2);
        dep.setDepartment_name(Name_dept);
        dep.setManager_id(managerId_depet2);
        dep.setLocation_id(locationId_dept2);

        if (depDAO.Update(dep)) {
            System.out.println("Update Data Berhasil");
        }       
      
    }
    public static void deletedept()
    {
        String Id_dept;
        int Id_dept2;
        
        System.out.print("Masukkan ID Department = ");
        Id_dept = scanner.nextLine();
        Id_dept2 = Integer.parseInt(Id_dept);  
        //Delete row from departments

        Department dep = new Department();
        dep.setDepartment_id(Id_dept2);
     
        if(depDAO.Delete(dep))
        {
            System.out.println("Delete Data Berhasil");
        }
    }
    public static void showdept()
    {
      
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(String.format("|%-5s|%-10s|%-23s|%-12s|%-12s|","NO", "Dept. ID","Dept. Name", "Manager ID", "Location ID"));
    System.out.println("-------------------------------------------------------------------------");
    int no = 1;
    for (Department dep : depDAO.getDepartment()) {
        System.out.println(String.format("|%-5s|%-10s|%-23s|%-12s|%-12s|",no,dep.getDepartment_id(), dep.getDepartment_name(), dep.getManager_id(), dep.getLocation_id()));
        no++;
    }
    System.out.println("-------------------------------------------------------------------------");
        
    }
   
    
    
}
