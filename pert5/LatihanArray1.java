/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert5;
import java.util.*;
import java.io.*;

public class LatihanArray1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int i, jumdat, jml, tgl;
        double total = 0;
        //nm = new String[10];
        String [] nm = new String[10];
        
        //String [] tgl = new String[10];
        String [] kb = new String[10];
        String tanya ="";
        //String [] jumdat = new String[10];
       
            
            
            do{
                System.out.print("\n Jumlah Data yang akan dimasukan    : ");
                jumdat=input.nextInt();
                for(i=1;i<=jumdat;i++)
                {                
                    
                    
                    System.out.println("Data ke- "+i);
                    System.out.print("Kode Barang   : ");
                    kb[i]=input.next();
                    System.out.print("Jumlah        : ");
                    jml=input.nextInt();
                    
                }
                //for(i=1;i<=nm;i++)
                System.out.println("\n\n            PT.PERTAMA PRATAMA ");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.print("Masukkan Nama Petugas : ");nm[i]=input.next();
                System.out.print("Tanggal               : ");tgl=input.nextInt();
                

        System.out.println("\n\n                        PT. PERTAMA PRAMATA ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Petugas                    : "+nm[i]);
        System.out.println("Jumlah Data yang dimasukan      : "+jumdat);
        System.out.println("Tanggal                         : "+tgl);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Data ke     Kode Barang     Nama Barang     Harga Barang    Jumlah Barang   Total Harga");
        System.out.println();
                }
           //System.out.println("--------------------------------------------------");
            while (tanya.equals("Y")|| tanya.equals("y"));
        
    }
    
}
