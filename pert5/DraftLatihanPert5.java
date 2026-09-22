/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert5;
import java.util.*;
import java.time.LocalDate;

public class DraftLatihanPert5 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int i, jumdat,jb;
        String [] kb=new String[2];
        String [] nb=new String[2];
        double [] harga=new double[2];
        //int [] jb=new int[1];
        //int [] jumdat=new int[2]
        double [] total=new double[2];
        //String [] kb=new String[10];
        //double total=0;
        String tanya="";
        LocalDate date = LocalDate.now();
        LocalDate newDate  = date.plusDays(7);
        
        System.out.println("\n                 PT.PERTAMA ''PRATAMA''");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Petugas     : ");
        nama = input.nextLine();
        //System.out.print("Tanggal                   : ");
        //tgl = input.nextDouble();
        System.out.println("Tanggal                   : "+newDate);
        
        
        do{
            System.out.print("\nJumlah Data yang akan dimasukkan  : ");
            jumdat = input.nextInt();
            for(i=1;i<=jumdat;i++)
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Ke- "+i);
                System.out.print("Kode Barang [P001/V001/M001]  : ");
                kb[i]=input.nextLine().toUpperCase();
                switch (kb[i])
                {
                    case "P001":
                        nb[i]="Printer";
                        harga[i]=700000;
                        break;
                
                    case "V001":
                        nb[i]="VGA Card";
                        harga[i]=75000;
                        break;
                        
                    case "M001":
                        System.out.println("MotherBoard");
                        harga[i]=950000;
                        break;
                    //default:
                    //    System.out.println("Kode barang tidak valid!");
                    //    break;
                        //i--; //mengulangi pengisian data
                        //continue;
                }
                /*
                if (kb[i] == "p001" || kb[i] == "P001"){
                    nb[i]="Printer";
                    harga[i]=700000;
                }
                else if (kb [i]== "v001" || kb [i]== "V001"){
                    nb[i]="VGA Card";
                    harga[i]=75000;
                }
                else if(kb[i] == "m001" || kb[i] == "M001"){
                    nb[i]="MotherBoard";
                    harga[i]=950000;
                }
                else{
                    nb[i]="Barang habis/tidak ada";
                    harga[i]=0;
                }
                */
            }
                System.out.print("Jumlah                        : ");
                jb=input.nextInt();
                System.out.print("----------------------------------------------------------------");

                total[i] += (harga[i]*jb);
            
            System.out.println("\n\n                 PT. PERTAMA ''PRATAMA''");
            System.out.println("Nama Petugas                    : "+nama);
            System.out.println("Jumlah Data yang di masukan     : "+jumdat);
            System.out.println("Tanggal                         : "+newDate);
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Data ke     Kode Barang             Nama Barang          Harga Barang    Jumlah Barang   Total Harga");
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println(i+"\t\t"+jumdat+"\t\t"+kb[i]+"\t\t\t\t"+nb[i]+"\t"+harga[i]+"\t"+jb+"\t"+total[i]);
            //System.out.println("Data Ke"+jumdat);
            
        
        
        }
        while(tanya.equals("Y") || tanya.equals("y"));
    }
    
}
