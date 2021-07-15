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
public class DeleteCountryTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
     public static void deleteCount(){
         
        String c_id;
        DB_Connections connection = new DB_Connections();
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        
        System.out.println("Masukkan Country ID : ");
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
}
