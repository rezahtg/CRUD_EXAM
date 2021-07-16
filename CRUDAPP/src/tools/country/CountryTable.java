/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.country;

import daos.CountryDAO;
import models.Country;
import tools.DB_Connections;

/**
 *
 * @author rezar
 */
public class CountryTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static DB_Connections connection = new DB_Connections();
    public static CountryDAO countdao = new CountryDAO(connection.getConnection());
    
    public static void showCountry(){    
         // Menampilkan data dari tabel country
        System.out.println("-------------------------------------------------------------------");
        System.out.println(String.format("|%-5s|%-12s|%-30s|%-10s|","NO", "Country ID","          Country Name", "Region ID"));
        System.out.println("-------------------------------------------------------------------");
        int no = 1;
        for (Country country : countdao.getAll()) {
            System.out.println(String.format("|%-5s|%-12s|%-30s|%-10s|",no,country.getCountry_id() ,country.getCountry_name() ,country.getRegion_id()));
            no++;
        }
        System.out.println("-------------------------------------------------------------------");
    }
    
    public static void insertCount(){
        //Deklarasi Set variable
        String c_id;
        String c_name;
        int c_reg;
        
        //Input data into variable
        System.out.print("Masukkan Country ID : ");
        c_id = scanner.nextLine();
        System.out.print("Masukkan Country Name : ");
        c_name = scanner.nextLine();
        System.out.print("Masukkan Region ID : ");
        c_reg = scanner.nextInt();
        
        // Set data on variable to database
        Country country = new Country();
        country.setCountry_id(c_id);
        country.setCountry_name(c_name);
        country.setRegion_id(c_reg);
       
       // Expression success or fail
        if (countdao.insert(country))
        {
            System.out.println("Data Baru ditambahkan");
        }else{
            System.out.println("Data gagal ditambahkan");
        }
    }
    
    public static void deleteCount(){
         
        String c_id;
        
        System.out.print("Masukkan Country ID : ");
        c_id = scanner.nextLine();
        
        Country country = new Country();
        country.setCountry_id(c_id);
        
        // Menghapus data inputan table country
        if (countdao.delete(country)){
            System.out.println("Data Berhasil dihapus");
        } else{
            System.out.println("Data gagal dihapus");
        }
     }
    
    public static void updateCount(){
        
        //Deklarasi Set variable
        String co_id;
        String co_name;
        int co_reg;
        
        //Input data into variable
        System.out.print("Masukkan ID Country yang ingin di ubah : ");
        co_id = scanner.nextLine();
        System.out.print("Ubah Data Country Name baru : ");
        co_name = scanner.nextLine();
        System.out.print("Ubah Data Region ID : ");
        co_reg = scanner.nextInt();
        
        // Set data on variable to database
        Country country = new Country();
        country.setCountry_name(co_name);
        country.setRegion_id(co_reg);
        country.setCountry_id(co_id);
       
       // Expression success or fail
        if (countdao.update(country))
        {
            System.out.println("Data Baru ditambahkan");
        }else{
            System.out.println("Data gagal ditambahkan");
        }
    }
}
