/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.jobs;

import daos.JobDAO;
import java.util.Scanner;
import models.Job;
import tools.DB_Connections;

/**
 *
 * @author haikal
 */
public class JobTable {
    
    public static DB_Connections connection = new DB_Connections();
    public static JobDAO jdao = new JobDAO(connection.getConnection());
    
    public static Scanner inpJob = new Scanner(System.in);
    public static String id_job, title_job, min_temp, max_temp;
    public static int min_salary, max_salary;
    
    public static void insertJobs() {
    
    Job insertJob = new Job();
    System.out.print("Masukkan ID Job : ");
    id_job = inpJob.nextLine();        
    insertJob.setIdJob(id_job);
    System.out.print("Masukkan Title Job : ");
    title_job = inpJob.nextLine();
    insertJob.setTitleJob(title_job);
    System.out.print("Masukkan Min Salary : ");
    min_temp = inpJob.nextLine();
    min_salary = Integer.parseInt(min_temp);
    insertJob.setJob_minSalary(min_salary);
    System.out.print("Masukkan Max Salary : ");
    max_temp = inpJob.nextLine();
    max_salary = Integer.parseInt(max_temp);
    insertJob.setJob_maxSalary(max_salary);
    if (jdao.insert(insertJob)) {
        System.out.println("INSERT BERHASIL");
    }
  }
    
    public static void updateJobs() {
        
    Job updateJob = new Job();
    System.out.print("Masukkan ID Job yang ingin di ubah : ");
    id_job = inpJob.nextLine();        
    updateJob.setIdJob(id_job);
    System.out.print("Masukkan Title Job baru : ");
    title_job = inpJob.nextLine();
    updateJob.setTitleJob(title_job);
    System.out.print("Masukkan Min Salary baru : ");
    min_temp = inpJob.nextLine();
    min_salary = Integer.parseInt(min_temp);
    updateJob.setJob_minSalary(min_salary);
    System.out.print("Masukkan Max Salary baru : ");
    max_temp = inpJob.nextLine();
    max_salary = Integer.parseInt(max_temp);
    updateJob.setJob_maxSalary(max_salary);
    if (jdao.update(updateJob)) {
        System.out.println("UPDATE BERHASIL");
    }    
  }
    
    public static void deleteJobs() {
        
    Job deleteJob = new Job();
    System.out.print("Masukkan ID Job : ");
    id_job = inpJob.nextLine();        
    deleteJob.setIdJob(id_job);
    if (jdao.delete(deleteJob)) {
        System.out.println("DELETE BERHASIL");
    }
  }
    
    public static void showJobs() {
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(String.format("|%-5s|%-12s|%-35s|%-12s|%-12s|","NO", "Job ID","Job Title", "Min Salary", "Max Salary"));
    System.out.println("----------------------------------------------------------------------------------");
    int no = 1;
    for (Job j : jdao.getAJobs()) {
    System.out.println(String.format("|%-5s|%-12s|%-35s|%-12s|%-12s|",no,j.getIdJob(),j.getTitleJob(),j.getJob_minSalary(),j.getJob_maxSalary()));
    no++;
    }    
    System.out.println("----------------------------------------------------------------------------------");
  }  
}
