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
    
    public static DB_Connections connection = new DB_Connections();
    public static RegionDAO rdao = new RegionDAO(connection.getConnection());
    
    public static Scanner inpReg = new Scanner(System.in);
    public static String nama_region, id_region, idReg_temp;
    public static int id_region2;
    
    public static void insertRegion() {        
    
    Region inReg = new Region();
    System.out.print("Masukkan ID Region = ");
    id_region = inpReg.nextLine();
    id_region2 = Integer.parseInt(id_region);                
    inReg.setIdReg(id_region2);
    System.out.print("Masukkan Nama Region = ");
    nama_region = inpReg.nextLine();
    inReg.setNameReg(nama_region);
    System.out.println("\nID Region :"+nama_region);
    System.out.println("\nRegion :"+id_region);
        
        
    if (rdao.insert(inReg)) {
       System.out.println("BERHASIL INSERT");
    }
    
}
    public static void updateRegion() {

    Region reg = new Region();
    System.out.print("Masukkan ID Region yang ingin di ubah = ");
    id_region = inpReg.nextLine();
    id_region2 = Integer.parseInt(id_region);                
    reg.setIdReg(id_region2);              
    System.out.print("Masukkan Nama Region baru = ");
    nama_region = inpReg.nextLine();
    reg.setNameReg(nama_region);
    System.out.println("ID Region :"+id_region2);
    System.out.println("Region :"+nama_region);
        
       
    if (rdao.update(reg)) {
        System.out.println("UPDATE SUKSES");
    }
}
    
    public static void deleteRegion() {
    
    Region delReg = new Region();
    System.out.print("Masukkan ID Region = ");
    id_region2 = inpReg.nextInt();
    delReg.setIdReg(id_region2);
    System.out.println("\nID Region :"+id_region2);

    if (rdao.delete(delReg)) {
        System.out.println("DELETE SUKSES");
    }
}
    
    public static void showRegion() {
   
        System.out.println("---------------------------------------------------------------------");
        System.out.println(String.format("|%-5s|%-30s|%-30s|","NO", "          Region Name", "           Region ID"));
        System.out.println("---------------------------------------------------------------------");
        int no = 1;
    for (Region r : rdao.getAll()) {
        System.out.println(String.format("|%-5s|%-30s|%30s|",no,r.getNameReg(),r.getIdReg()));
        no++;
    }      
        System.out.println("---------------------------------------------------------------------");

    }   
    
    public static void selectRegion(){
    System.out.print("Masukkan ID Region = ");
    id_region2 = inpReg.nextInt();
    
    Region selReg = new Region();
    selReg.setIdReg(id_region2);
   
    System.out.println("---------------------------------------------------------------");
        System.out.println(String.format("|%-30s|%-30s|", "          Region Name", "           Region ID"));
        System.out.println("---------------------------------------------------------------");
    for (Region r : rdao.getSelect(id_region2)) {
        System.out.println(String.format("|%-30s|%30s|",r.getNameReg(),r.getIdReg()));
    }      
        System.out.println("---------------------------------------------------------------");  
    }
}

