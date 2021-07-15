/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.CountryDAO;
import daos.LocationDAO;
import models.Country;
import models.Location;
import static tools.CountryTable.countdao;
import static tools.CountryTable.scanner;

/**
 *
 * @author rezar
 */
public class LocationTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static DB_Connections connection = new DB_Connections();
    public static CountryDAO countdao = new CountryDAO(connection.getConnection());
    public static LocationDAO locdao = new LocationDAO(connection.getConnection());
    
    public static void showLocation(){    
         // Menampilkan data dari tabel country
        for (Location location : locdao.getAll()) {
            System.out.println(location.getLocation_id() + " - " + location.getStreet() + " - " + location.getPostal_code() + " - " + location.getCity() + " - " + location.getState() + " - " + location.getCountry_id()); 
        }
    }
    
    public static void insertloc(){
        //Deklarasi Set variable
        int l_id;
        String street;
        String postal;
        String city;
        String state;
        String l_country;
        
        //Input data into variable
        System.out.print("Masukkan Location ID : ");
        l_id = scanner.nextInt();
        System.out.print("Masukkan Nama Jalan : ");
        scanner.nextLine();
        street = scanner.nextLine();
        System.out.print("Masukkan Kode Pos : ");
        postal = scanner.nextLine();
        System.out.print("Masukkan Nama Kota : ");
        city = scanner.nextLine();
        System.out.print("Masukkan Nama Provinsi : ");
        state = scanner.nextLine();
        System.out.print("Masukkan Region ID : ");
        l_country = scanner.nextLine();
        

        
        // Set data on variable to database
          Location location = new Location();
          location.setLocation_id(l_id);          
          location.setStreet(street);
          location.setPostal_code(postal);
          location.setCity(city);
          location.setState(state);
          location.setCountry_id(l_country);
          
       
       // Expression success or fail
            if (locdao.insert(location))
            {
                System.out.println("Data Baru ditambahkan");
            }else{
                System.out.println("Data gagal ditambahkan");
            }
    }
    
    public static void deleteLoc(){
         
        int l_id;
        
        System.out.println("Masukkan Location ID : ");
        l_id = scanner.nextInt();
        
        Location location = new Location();
        location.setLocation_id(l_id);
        
        
        //Menghapus data inputan table location
        if (locdao.delete(location)){
            System.out.println("Data Berhasil dihapus");
        } else{
            System.out.println("Data gagal dihapus");
        }
     }
    
    public static void updateLoc(){
        
        //Deklarasi Set variable
        int l_id;
        String street;
        String postal;
        String city;
        String state;
        String l_country;
        
        //Input data into variable
        System.out.print("Masukkan Location ID Yang Akan Diubah : ");
        l_id = scanner.nextInt();
        System.out.print("Ubah Nama Jalan : ");
        scanner.nextLine();
        street = scanner.nextLine();
        System.out.print("Ubah Kode Pos : ");
        postal = scanner.nextLine();
        System.out.print("Ubah Nama Kota : ");
        city = scanner.nextLine();
        System.out.print("Ubah Nama Provinsi : ");
        state = scanner.nextLine();
        System.out.print("Ubah Region ID : ");
        l_country = scanner.nextLine();
        

        
        // Set data on variable to database
          Location location = new Location();          
          location.setStreet(street);
          location.setPostal_code(postal);
          location.setCity(city);
          location.setState(state);
          location.setCountry_id(l_country);
          location.setLocation_id(l_id);
       
       // Expression success or fail
        if (locdao.update(location)){
            System.out.println("Data Berhasil dihapus");
        } else{
            System.out.println("Data gagal dihapus");
        }
    }
}
