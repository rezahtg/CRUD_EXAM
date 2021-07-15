/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import daos.CountryDAO;
import daos.LocationDAO;
import models.Country;
import models.Location;
import tools.DB_Connections;
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

                    DB_Connections connection = new DB_Connections();
//        System.out.println(connection.getConnection());
        
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        // Menampilkan data dari tabel country
//        for (Country country : countdao.getAll()) {
//            System.out.println(country.getCountry_id() + " - " + country.getCountry_name() + " - " + country.getRegion_id()); 
//        }


          // memasukkan data inputan pada table location
//          Location location = new Location();
//          location.setStreet("Jl.Kramat 6");
//          location.setPostal_code("E8V1A");
//          location.setCity("Karos");
//          location.setState("Medans");
//          location.setCountry_id("US");
//          location.setLocation_id(666);
//
//       
//        if (locdao.insert(location))
//        {
//            System.out.println("Data Baru ditambahkan");
//        }else{
//            System.out.println("Data gagal ditambahkan");
//        }

       
//        
//        // Menghapus data inputan table country
//        if (countdao.delete(country)){
//            System.out.println("Data Berhasil dihapus");
//        } else{
//            System.out.println("Data gagal dihapus");
//        }

        // Menghapus data inputan table location
//        if (locdao.delete(location)){
//            System.out.println("Data Berhasil dihapus");
//        } else{
//            System.out.println("Data gagal dihapus");
//        }

            // Mengupdate data table country
//          if (locdao.update(location)){
//            System.out.println("Data Berhasil diupdate");
//          } else{
//            System.out.println("Data Gagal diupdate");
//          }

        // Mengupdate data table country
//          if (countdao.update(country)){
//            System.out.println("Data Berhasil diupdate");
//          } else{
//            System.out.println("Data Gagal diupdate");
//          }
        
//        for (Country count : countdao.getAll()) {
//            System.out.println(count.getCountry_id() + " - " + count.getCountry_name() + " - " + count.getRegion_id()); 
//        }

            // Menampilkan data dari tabel location
//         for (Location loc : locdao.getAll()) {
//            System.out.println(loc.getLocation_id() + " - " + loc.getStreet() + " - " + loc.getPostal_code() + " - " + loc.getCity() + " - " + loc.getState() + " - " + loc.getCountry_id()); 
//        }
        Header();
 
        
    }
    
    public static void Header(){
        System.out.println("||=====================================================||");
        System.out.println("||                                                     ||");
        System.out.println("||           Aplikasi Karyawan Sederahana              ||");
        System.out.println("||   ini merupakan aplikasi CRUD karyawan sederhana    ||");
        System.out.println("||=====================================================||");
    }
    
    public static void showCountry(){
        ShowCountryTable showcountry = new ShowCountryTable();
        
        showcountry.showCountry();
    }
    
    public static void insertCountry(){
        InsertCountryTable insertcountry = new InsertCountryTable();
        
        insertcountry.insertCount();
        showCountry();
    }
    
//    public static String input(String info){
//        System.out.print(info +" : ");
//        String data = scanner.nextLine();
//        System.out.println("Anda berada di menu " + data);
//        return data;
//    }
    
}
