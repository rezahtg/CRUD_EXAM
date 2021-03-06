/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import tools.country.CountryTable;
import tools.department.DepartmentTable;
import tools.employee.EmployeeTable;
import tools.jobs.JobTable;
import tools.location.LocationTable;
import tools.regions.RegionTable;

/**
 *
 * @author rezar
 */
public class viewCRUD {

    public static String menu;
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void viewsCRUD(){
        header();
    }
    
    public static void header(){
        System.out.println("");
        System.out.println("||===============================================================================================================||");
        System.out.println("||                                                                                                               ||");
        System.out.println("||                                       APLIKASI CRUD HR SCHEME                                                 ||");
        System.out.println("||                               ini merupakan aplikasi CRUD HR SCHEME sederhana                                 ||");
        System.out.println("||                                                                                                               ||");
        System.out.println("||===============================================================================================================||");
        System.out.println("|| Menu: 1. Show Data: \t|| 2. Insert Data \t|| 3. Update Data \t|| 4. Delete Data \t|| 5.Search Data ||");
        System.out.println("||===============================================================================================================||");
        System.out.println("");
        System.out.print("Pilih Menu (0.Exit): ");
        menu = scanner.nextLine();
      
        
        if (menu.equals("1")) {
            menuShow();
            
        }else if(menu.equals("2")){
            menuInsert();
        }else if(menu.equals("3")){
            menuUpdate();
        }else if(menu.equals("4")){
            menuDelete();
        }else if(menu.equals("5")){
            menuSelect();
        }
        else if(menu.equals("0")){
           //exit
           System.exit(0);
        }else {
            System.out.println("Perintah Tidak dikenali");
        }
    }
    
    public static void footer(){
        System.out.println("");
        System.out.println("Yay, Perintah Selesai!");
        System.out.print("Mulai Lagi?(y/n)");
        menu = scanner.nextLine();
        if (menu.equals("y")) {
            header();
        }else if(menu.equals("n")){
            //
            System.exit(0);
        }
        System.out.println("");
    }
    
    public static void menuShow(){
        System.out.println("Show Table:");
        System.out.println("1. Employee");
        System.out.println("2. Departments");
        System.out.println("3. Jobs");
        System.out.println("4. Locations");
        System.out.println("5. Country");
        System.out.println("6. Regions");
        System.out.print("Pilih Table (0.Exit, 9.Back):");
        menu = scanner.nextLine();
        if (menu.equals("1")) {
            EmployeeTable.ShowEmp();
        }else if(menu.equals("2")){
            DepartmentTable.showdept();
        }else if(menu.equals("3")){
            JobTable.showJobs();
        }else if(menu.equals("4")){
            LocationTable.showLocation();
        }else if(menu.equals("5")){
            CountryTable.showCountry();
        }else if(menu.equals("6")){
            RegionTable.showRegion();
        }else if(menu.equals("9")){
            header();
        }else if(menu.equals("0")){
            //exit
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak dikenali");
        }
        footer();
    }
    
    public static void menuInsert(){
       System.out.println("Insert Table:");
        System.out.println("1. Employee");
        System.out.println("2. Departments");
        System.out.println("3. Jobs");
        System.out.println("4. Locations");
        System.out.println("5. Country");
        System.out.println("6. Regions");
        System.out.print("Pilih Table:");
        menu = scanner.nextLine();
        if (menu.equals("1")) {
            EmployeeTable.ShowEmp();
            EmployeeTable.InsertEmp();
            EmployeeTable.ShowEmp();
        }else if(menu.equals("2")){
            DepartmentTable.showdept();
            DepartmentTable.insertdept();
            DepartmentTable.showdept();
        }else if(menu.equals("3")){
            JobTable.showJobs();
            JobTable.insertJobs();
            JobTable.showJobs();
        }else if(menu.equals("4")){
            LocationTable.showLocation();
            LocationTable.insertloc();
            LocationTable.showLocation();
        }else if(menu.equals("5")){
            CountryTable.showCountry();
            CountryTable.insertCount();
             CountryTable.showCountry();
        }else if(menu.equals("6")){
            RegionTable.showRegion();
            RegionTable.insertRegion();
            RegionTable.showRegion();
        }else if(menu.equals("9")){
            header();
        }else if(menu.equals("0")){
            //exit
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak dikenali");
        }
        footer();
    }
    
    public static void menuUpdate(){
        System.out.println("Update Table:");
        System.out.println("1. Employee");
        System.out.println("2. Departments");
        System.out.println("3. Jobs");
        System.out.println("4. Locations");
        System.out.println("5. Country");
        System.out.println("6. Regions");
        System.out.println("----------");
        System.out.println("9. Kembali");
        System.out.println("0. Berhenti");
        System.out.print("Pilih Table:");
        menu = scanner.nextLine();
        if (menu.equals("1")) {
            EmployeeTable.ShowEmp();
            EmployeeTable.UpdateEmp();
            EmployeeTable.ShowEmp();
        }else if(menu.equals("2")){
            DepartmentTable.showdept();
            DepartmentTable.updatedept();
            DepartmentTable.showdept();
        }else if(menu.equals("3")){
            JobTable.showJobs();
            JobTable.updateJobs();
            JobTable.showJobs();
        }else if(menu.equals("4")){
            LocationTable.showLocation();
            LocationTable.updateLoc();
            LocationTable.showLocation();
        }else if(menu.equals("5")){
            CountryTable.showCountry();
            CountryTable.updateCount();
             CountryTable.showCountry();
        }else if(menu.equals("6")){
            RegionTable.showRegion();
            RegionTable.updateRegion();
            RegionTable.showRegion();
        }else if(menu.equals("9")){
            header();
        }else if(menu.equals("0")){
            //exit
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak dikenali");
        }
        footer();
    }
    
    public static void menuDelete(){
        System.out.println("Update Table:");
        System.out.println("1. Employee");
        System.out.println("2. Departments");
        System.out.println("3. Jobs");
        System.out.println("4. Locations");
        System.out.println("5. Country");
        System.out.println("6. Regions");
        System.out.print("Pilih Table:");
        menu = scanner.nextLine();
        if (menu.equals("1")) {
            EmployeeTable.ShowEmp();
            EmployeeTable.DeleteEmp();
            EmployeeTable.ShowEmp();
        }else if(menu.equals("2")){
            DepartmentTable.showdept();
            DepartmentTable.deletedept();
            DepartmentTable.showdept();
        }else if(menu.equals("3")){
            JobTable.showJobs();
            JobTable.deleteJobs();
            JobTable.showJobs();
        }else if(menu.equals("4")){
            LocationTable.showLocation();
            LocationTable.deleteLoc();
            LocationTable.showLocation();
        }else if(menu.equals("5")){
            CountryTable.showCountry();
            CountryTable.deleteCount();
             CountryTable.showCountry();
        }else if(menu.equals("6")){
            RegionTable.showRegion();
            RegionTable.deleteRegion();
            RegionTable.showRegion();
        }else if(menu.equals("9")){
            header();
        }else if(menu.equals("0")){
            //exit
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak dikenali");
        }
        footer();
    }
    
    public static void menuSelect(){
        System.out.println("Select From Table:");
        System.out.println("1. Employee");
        System.out.println("2. Departments");
        System.out.println("3. Jobs");
        System.out.println("4. Locations");
        System.out.println("5. Country");
        System.out.println("6. Regions");
        System.out.print("Pilih Table:");
        menu = scanner.nextLine();
        if (menu.equals("1")) {
            EmployeeTable.ShowEmp();
            EmployeeTable.selectEmp();
        }else if(menu.equals("2")){
            DepartmentTable.selectDept();
        }else if(menu.equals("3")){
            JobTable.selectJobs();
        }else if(menu.equals("4")){
            LocationTable.selectLocation();
        }else if(menu.equals("5")){
            CountryTable.selectCountry();
        }else if(menu.equals("6")){
            RegionTable.selectRegion();
        }else if(menu.equals("9")){
            header();
        }else if(menu.equals("0")){
            //exit
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak dikenali");
        }
        footer();
    }
    
}
