/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert10;

/**
 *
 * @author AcerPutri
 */
public class Barang {
    public String kd,nm;
    public int jml;
    public double hrg,ttl,ub,uk;
    
    public void setKd(String val){
        kd=val;
    }
    public String getKd(){
        return kd;
    }
     public void setSeleksiKd(){
         if(kd.equalsIgnoreCase("B001")){
             nm="Pensil";
             hrg=3000;
         }else if (kd.equalsIgnoreCase("B002")){
             nm="Buku";
             hrg=5000;
         }else if(kd.equalsIgnoreCase("B003")){
             nm="Penggaris";
             hrg=1000;
         }else if(kd.equalsIgnoreCase("B004")){
             nm="penghapus";
             hrg=500;
         }else{
             nm="";
             hrg=0;
         }
     }

    String getNm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double getHrg() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
