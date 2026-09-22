/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert5;
import java.util.*;

class ArrayPlg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,jd;
        String [] nm = new String[10];
        String [] kp = new String[10];
        String [] almt = new String[10];
        String tanya="";
        
        do{
        System.out.print("Masukkan jumlah data: ");
        jd=input.nextInt();
        for(i=1;i<=jd;i++)
        {
            System.out.println("Data ke- "+i);
            System.out.print("kode pelanggan: ");
            kp[i]=input.next();
            System.out.print("nama pelanggan: ");
            nm[i]=input.next();
            System.out.print("alamat pelanggan: ");
            almt[i]=input.next();
        }
        System.out.println("\n\n    DATA PELANGGAN PT.SENTOSA JAYA ");
        System.out.println("    JL Sagu No.27A Kebagusan Jakarta Selatan ");
        System.out.println("==================================================");
        //System.out.println("No\t Kode Pelanggan \t Nama Pelanggan \t\t Alamat");
        //System.out.println("==================================================");
        for (i=1;i<=jd;i++)
        {
            System.out.println("Data ke- "+i);
            System.out.println("Kode Pelanggan: "+kp[i]);
            System.out.println("nama pelanggan: "+nm[i]);
            System.out.println("Alamat pelanggan: "+almt[i]);
            System.out.println("========================================================");
            //System.out.println(i+"\t\t"+kp[i]+"\t\t\t\t\t"+nm[i]+"\t\t\t\t\t"+almt[i];
            
        }
        //System.out.println("==============================================================");
        System.out.print("Mau input data lagi: ");
        tanya=input.next();
        }
        while(tanya.equals("Y")||tanya.equals("y"));
    }
    
}
