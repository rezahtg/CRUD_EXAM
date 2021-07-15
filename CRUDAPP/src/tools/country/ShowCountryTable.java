/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.country;

import daos.CountryDAO;
import daos.LocationDAO;
import models.Country;
import models.Location;
import tools.DB_Connections;

/**
 *
 * @author rezar
 */
public class ShowCountryTable {
        public static void showCountry(){
        DB_Connections connection = new DB_Connections();
        CountryDAO countdao = new CountryDAO(connection.getConnection());
        LocationDAO locdao = new LocationDAO(connection.getConnection());
        
                // Menampilkan data dari tabel country
        for (Country country : countdao.getAll()) {
            System.out.println(country.getCountry_id() + " - " + country.getCountry_name() + " - " + country.getRegion_id()); 
        }
        
//        for (Location location : locdao.getAll()) {
//            System.out.println(location.getLocation_id() + " - " + location.getStreet() + " - " + location.getPostal_code() + " - " + location.getCity() + " - " + location.getState() + " - " + location.getCountry_id()); 
//        }
    }
}
