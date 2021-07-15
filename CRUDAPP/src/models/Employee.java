/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Kenji
 */
public class Employee {
    private int id_employee;
    private String First_name;
    private String Last_name;
    private String email;
    private String phone_number;
    
    
    private double Salary;
    private double commission_pct;
    private int Manager_id;
    private int Department_id;
    private String hire_date;
    private String job_id;

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getCommission_pct() {
        return commission_pct;
    }

    public void setCommission_pct(double commission_pct) {
        this.commission_pct = commission_pct;
    }
    
   
   



    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

   

    public int getManager_id() {
        return Manager_id;
    }

    public void setManager_id(int Manager_id) {
        this.Manager_id = Manager_id;
    }

    public int getDepartment_id() {
        return Department_id;
    }

    public void setDepartment_id(int Department_id) {
        this.Department_id = Department_id;
    }

    
    
    
    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    


 

    @Override
    public String toString() {
        return "Employee{" + "id_employee=" + id_employee + 
                ", First_name=" + First_name + ", Last_name=" + Last_name +
                ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + 
                hire_date + ", job_id=" + job_id + ", Salary=" + Salary + ", commission_pct=" + 
                commission_pct + ", Manager_id=" + Manager_id + ", Department_id=" + Department_id + '}';
    }
    
    
    
}
