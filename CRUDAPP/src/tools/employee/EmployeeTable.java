/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.employee;

import daos.EmployeeDAO;
import models.Employee;
import tools.DB_Connections;

/**
 *
 * @author Kenji
 */
public class EmployeeTable {
    
  
    public static DB_Connections connect = new DB_Connections();

    public static EmployeeDAO empDAO = new EmployeeDAO(connect.getConnection());
    
    
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
   
    
    public static void InsertEmp()
    {

        String firstName_emp, id_emp,lastName_emp, email_emp, phoneNumber_emp, hireDate_emp, jobId_emp
                ,salary_emp,commissionPct_emp, managerId_emp,departmentId_emp;
        int id_emp2,salary_emp2, managerId_emp2, departmentId_emp2;
        double commissionPct_emp2;
        
        
        System.out.print("Masukkan ID Employee = ");
        id_emp = scanner.nextLine();
        id_emp2 = Integer.parseInt(id_emp);                
        System.out.print("Masukkan First Name = ");
        firstName_emp = scanner.nextLine();
        
        System.out.print("Masukkan Last Name = ");
        lastName_emp = scanner.nextLine();
        
        System.out.print("Masukkan Email= ");
        email_emp = scanner.nextLine();
        
        System.out.print("Masukkan Phone Number = ");
        phoneNumber_emp = scanner.nextLine();
     
        
        System.out.print("Masukkan Hire Date(11/Mar/2003) = ");
        hireDate_emp = scanner.nextLine();
        
        System.out.print("Masukkan Job Id = ");
        jobId_emp = scanner.nextLine();
        
        System.out.print("Masukkan Salary = ");
        salary_emp = scanner.nextLine();
        salary_emp2 = Integer.parseInt(salary_emp);
        
        System.out.print("Masukkan Commission PCT (0.2) = ");
        commissionPct_emp = scanner.nextLine();
        commissionPct_emp2 = Double.parseDouble(commissionPct_emp);
        
        System.out.print("Masukkan Manager Id = ");
        managerId_emp = scanner.nextLine();
        managerId_emp2 = Integer.parseInt(managerId_emp);
        
        
        System.out.print("Masukkan Department Id = ");
        departmentId_emp = scanner.nextLine();
        departmentId_emp2 = Integer.parseInt(departmentId_emp);
    
    
        //Insert Employee

        Employee em = new Employee();
        em.setId_employee(id_emp2);
  
        em.setFirst_name(firstName_emp);
    
        em.setLast_name(lastName_emp);
        em.setEmail(email_emp);
        em.setPhone_number(phoneNumber_emp);
        em.setHire_date(hireDate_emp);
       
        em.setJob_id(jobId_emp);
        em.setSalary(salary_emp2);
        em.setCommission_pct(commissionPct_emp2);
        em.setManager_id(managerId_emp2);
        em.setDepartment_id(departmentId_emp2);
       
        if (empDAO.insert(em)) {
            System.out.println("Input Data Berhasil");
        }       


    }
    
    
    public static void UpdateEmp()
    {
    
        
        String firstName_emp, id_emp,lastName_emp, email_emp, phoneNumber_emp, hireDate_emp, jobId_emp
                ,salary_emp,commissionPct_emp, managerId_emp,departmentId_emp;
        int id_emp2,salary_emp2, managerId_emp2, departmentId_emp2;
        double commissionPct_emp2;
        
        
        System.out.print("Masukkan ID Employee = ");
        id_emp = scanner.nextLine();
        id_emp2 = Integer.parseInt(id_emp);                
        System.out.print("Masukkan First Name = ");
        firstName_emp = scanner.nextLine();
        
        System.out.print("Masukkan Last Name = ");
        lastName_emp = scanner.nextLine();
        
        System.out.print("Masukkan Email= ");
        email_emp = scanner.nextLine();
        
        System.out.print("Masukkan Phone Number = ");
        phoneNumber_emp = scanner.nextLine();
     
        
        System.out.print("Masukkan Hire Date(11/Mar/2003) = ");
        hireDate_emp = scanner.nextLine();
        
        System.out.print("Masukkan Job Id = ");
        jobId_emp = scanner.nextLine();
        
        System.out.print("Masukkan Salary = ");
        salary_emp = scanner.nextLine();
        salary_emp2 = Integer.parseInt(salary_emp);
        
        System.out.print("Masukkan Commission PCT (0.2) = ");
        commissionPct_emp = scanner.nextLine();
        commissionPct_emp2 = Double.parseDouble(commissionPct_emp);
        
        System.out.print("Masukkan Manager Id = ");
        managerId_emp = scanner.nextLine();
        managerId_emp2 = Integer.parseInt(managerId_emp);
        
        
        System.out.print("Masukkan Department Id = ");
        departmentId_emp = scanner.nextLine();
        departmentId_emp2 = Integer.parseInt(departmentId_emp);
        
        
        // Update

        Employee em = new Employee();
        
        em.setId_employee(id_emp2);
  
        em.setFirst_name(firstName_emp);
    
        em.setLast_name(lastName_emp);
        em.setEmail(email_emp);
        em.setPhone_number(phoneNumber_emp);
        em.setHire_date(hireDate_emp);
       
        em.setJob_id(jobId_emp);
        em.setSalary(salary_emp2);
        em.setCommission_pct(commissionPct_emp2);
        em.setManager_id(managerId_emp2);
        em.setDepartment_id(departmentId_emp2);
       
        if (empDAO.Update(em)) {
            System.out.println("Update Data Berhasil");
        }       
      

    }
    public static void DeleteEmp()
    {
        
        
        int id_emp2;
        
        System.out.print("Masukkan ID Employee = ");
        id_emp2 = scanner.nextInt();
         
        
        //Delete Employee

        Employee em = new Employee();
        em.setId_employee(id_emp2);
       
     
        
        if(empDAO.Delete(em))
        {
            System.out.println("Delete Data Berhasil");
        }
    }
    
    
    public static void ShowEmp()
            
    {
//        int i = 1;
//                for (Employee emplo : empDAO.getEmployees()) {
//                    
//                    
//            System.out.println(i+" || "+emplo.getId_employee() + " || " + emplo.getFirst_name()+
//                    " || "+ emplo.getLast_name()+
//                    " || "+emplo.getEmail() + " || " + emplo.getPhone_number()+
//                    " || " + emplo.getJob_id() + " || " + emplo.getSalary() +
//                    " || " + emplo.getCommission_pct() + " || " + emplo.getManager_id() +
//                    " || " + emplo.getDepartment_id() + " || " + emplo.getHire_date());
//            i++;
//        }

        
        
        
                
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("|%-5s|%-15s|%15s|%-20s|%-24s|%-19s|%-12s|%-12s|%-15s|%-12s|%-15s|%-25s|", "NO","Employee Id", "First Name",
                "Last Name","Email","Phone Number","Job Id","Salary",
                "Commission PCT","Manager ID","Department ID", "Hire Date"));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       
        int no = 1;
        
        for (Employee emplo : empDAO.getEmployees()) {
        System.out.println(String.format("|%-5s|%-15s|%-15s|%-20s|%-24s|%-19s|%-12s|%-12s|%-15s|%-12s|%-15s|%-25s|",no,emplo.getId_employee(),emplo.getFirst_name(),
                emplo.getLast_name(),emplo.getEmail(),emplo.getPhone_number(),emplo.getJob_id(),emplo.getSalary(),emplo.getCommission_pct(),
                emplo.getManager_id(),emplo.getDepartment_id(),emplo.getHire_date()));
        
        no++;
    }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        
    }
    
}
