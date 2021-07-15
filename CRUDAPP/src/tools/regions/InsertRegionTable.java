/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.regions;

import daos.RegionDAO;
import java.util.Scanner;
import models.Region;
import tools.DB_Connections;

/**
 *
 * @author haikal
 */
public class InsertRegionTable {
    public static void insertRegion() {        
    DB_Connections connection = new DB_Connections();
    RegionDAO rdao = new RegionDAO(connection.getConnection());
    
    Scanner insReg = new Scanner(System.in);
    String nama_region, id_region;
    int id_region2;
    System.out.println("Masukkan ID Region = ");
    id_region = insReg.nextLine();
    id_region2 = Integer.parseInt(id_region);                
    System.out.println("Masukkan Nama Region = ");
    nama_region = insReg.nextLine();
    System.out.println("\nID Region :"+nama_region);
    System.out.println("\nRegion :"+id_region);
        
    Region region = new Region();
    region.setIdReg(id_region2);
    region.setNameReg(nama_region);
        
    if (rdao.insert(region)) {
       System.out.println("BERHASIL INSERT");
    }
    
}
    
}
