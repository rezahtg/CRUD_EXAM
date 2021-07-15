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
public class RegionTable {
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
        
    Region inReg = new Region();
    inReg.setIdReg(id_region2);
    inReg.setNameReg(nama_region);
        
    if (rdao.insert(inReg)) {
       System.out.println("BERHASIL INSERT");
    }
    
}
    public static void updateRegion() {
    DB_Connections connection = new DB_Connections();
    RegionDAO rdao = new RegionDAO(connection.getConnection());

    Region reg = new Region();
    Scanner updReg = new Scanner(System.in);
    String nama_region, id_region;
    int id_region2;
    System.out.println("Masukkan ID Region = ");
    id_region = updReg.nextLine();
    id_region2 = Integer.parseInt(id_region);                
    reg.setIdReg(id_region2);              
    System.out.println("Masukkan Nama Region = ");
    nama_region = updReg.nextLine();
    reg.setNameReg(nama_region);
    System.out.println("ID Region :"+id_region2);
    System.out.println("Region :"+nama_region);
        
       
    if (rdao.update(reg)) {
        System.out.println("UPDATE SUKSES");
    }
}
    
    public static void deleteRegion() {
    DB_Connections connection = new DB_Connections();
    RegionDAO rdao = new RegionDAO(connection.getConnection());

    Scanner deltReg = new Scanner(System.in);
    int id_region2;
    System.out.println("Masukkan ID Region = ");
    id_region2 = deltReg.nextInt();
    System.out.println("\nID Region :"+id_region2);

    Region delReg = new Region();
    delReg.setIdReg(id_region2);
    if (rdao.delete(delReg)) {
        System.out.println("DELETE SUKSES");
    }
}
    
    public static void showRegion() {
    DB_Connections connection = new DB_Connections();
    RegionDAO rdao = new RegionDAO(connection.getConnection());

    for (Region r : rdao.getAll()) {
        System.out.println(r.getIdReg()+" - "+r.getNameReg());
    }      
}
    
}
