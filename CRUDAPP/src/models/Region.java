/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author haikal
 */
public class Region {
    private int idReg; //  DB_REGION ID
    private String nameReg; //  DB_REGION name

    public int getIdReg() {
        return idReg;
    }

    public void setIdReg(int idReg) {
        this.idReg = idReg;
    }

    public String getNameReg() {
        return nameReg;
    }

    public void setNameReg(String nameReg) {
        this.nameReg = nameReg;
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + idReg + ", name=" + nameReg + '}';
    }    
}