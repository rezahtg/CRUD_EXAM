/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import tools.LocationTable;
import tools.country.DeleteCountryTable;
import tools.country.InsertCountryTable;
import tools.country.ShowCountryTable;


/**
 *
 * @author rezar
 */



public class CRUDAPP {
    /**
     * @param args the command line arguments
     */
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        
        Header();
        LocationTable.showLocation();
        LocationTable.updateLoc();
        LocationTable.showLocation();
    }
    
    public static void Header(){
        System.out.println("||=====================================================||");
        System.out.println("||                                                     ||");
        System.out.println("||           Aplikasi Karyawan Sederahana              ||");
        System.out.println("||   ini merupakan aplikasi CRUD karyawan sederhana    ||");
        System.out.println("||=====================================================||");
    }
    /**
     * Tabel Country
     */
    public static void showCountry(){
        ShowCountryTable.showCountry();
    }
    
    public static void insertCountry(){
        InsertCountryTable.insertCount();
        showCountry();
    }
    
    public static void deleteCountry(){
        showCountry();
        DeleteCountryTable.deleteCount();
        showCountry();
    }
    
    
    
    /**
     * Table Regions
     */
    
    public static void insertRegion() {

    }
    
}
