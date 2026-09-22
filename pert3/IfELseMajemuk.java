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
public class IfELseMajemuk {
    public static void main(String[] args) {
    int pendapatan;
    double jasa, komisi, total;
Scanner input = new Scanner (System.in);
System.out.print("Masukkan Pendapatan Sales Rp. ");
pendapatan = input.nextInt();

if (pendapatan >= 0 && pendapatan <= 200000){
jasa=10000;
komisi=0.1*pendapatan;
}
else if (pendapatan<=500000){
jasa=20000;
komisi=0.15*pendapatan;
}
else{
jasa=30000;
komisi=0.2*pendapatan;
}

total=komisi+jasa;
System.out.println("\nUang Jasa Rp. " +(int) jasa);
System.out.println("Uang Komisi Rp. " + (int) komisi);
System.out.println("=======================================");
System.out.println("Uang total Rp. "+(int) total);
        // TODO code application logic here
}
    
}
