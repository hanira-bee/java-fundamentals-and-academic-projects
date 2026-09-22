/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert3;
import java.util.Scanner;
/**
 *
 * @author AcerPutri
 */
public class IfElseAksi {

    public static void main(String[] args) {
        
    IfElseClass ifclass=new IfElseClass();
    
    ifclass.setInputData();
    ifclass.getKeterangan();
      System.out.println("Hasil Akhir");
      System.out.println("===================================");
      System.out.println("Nama Siswa                : "+ifclass.nama);
      System.out.println("Nilai Akhir yg di dapat   : "+ifclass.nilAkhir);
      System.out.println("Keterangan                : "+ifclass.getKeterangan());
      System.out.println("===================================");
      
        // TODO code application logic here
    }
    
}
