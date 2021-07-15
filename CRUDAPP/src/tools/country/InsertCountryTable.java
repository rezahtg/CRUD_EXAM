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
public class InsertCountryTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void insertCount(){
        //Deklarasi Set variable
        String c_id;
        String c_name;
        int c_reg;
        
        //Connection Database
        DB_Connections connection = new DB_Connections();
//        System.out.println(connection.getConnection());
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        
        //Input data into variable
        System.out.println("Masukkan Country ID : ");
        c_id = scanner.nextLine();
        System.out.println("Masukkan Country Name : ");
        c_name = scanner.nextLine();
        System.out.println("Masukkan Region Name : ");
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

}
