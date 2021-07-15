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
public class UpdateCountryTable {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void updateCount(){
        
        //Deklarasi Set variable
        String co_id;
        String co_name;
        int co_reg;
        
        //Connection Database
        DB_Connections connection = new DB_Connections();
//        System.out.println(connection.getConnection());
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        
        //Input data into variable
        System.out.print("Masukkan ID Country yang ingin di ubah : ");
        co_id = scanner.nextLine();
        System.out.print("Ubah Data Country Name baru : ");
        co_name = scanner.nextLine();
        System.out.print("Ubah Data Region Name : ");
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
