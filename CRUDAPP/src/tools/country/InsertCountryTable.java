/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.country;

import static CRUDAPP.scanner;
import daos.CountryDAO;
import models.Country;
import tools.DB_Connections;

/**
 *
 * @author rezar
 */
public class InsertCountryTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void insertCount(){
        
        String c_id;
        String c_name;
        int c_reg;
        
        DB_Connections connection = new DB_Connections();
//        System.out.println(connection.getConnection());
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        System.out.println("Masukkan Country ID : ");
        c_id = scanner.nextLine();
        System.out.println("Masukkan Country ID : ");
        
         // memasukkan data inputan pada table country
        Country country = new Country();
        country.setCountry_id(c_id);
        country.setCountry_name(c_name);
        country.setRegion_id(c_reg);
       
       
        if (countdao.insert(country))
        {
            System.out.println("Data Baru ditambahkan");
        }else{
            System.out.println("Data gagal ditambahkan");
        }
    }

}
