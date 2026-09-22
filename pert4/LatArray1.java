/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert4;
import java.util.Scanner;
/**
 *
 * @author AcerPutri
 */
public class LatArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int i;
    int[] nil_akhir;
    //deklarasi variabel array
    nil_akhir = new int[6]; //membuat objek array
    Scanner input=new Scanner(System.in);
        for(i=0;i<6;i++)
        {
            System.out.print("Masukkan Array ke "+ i +" = ");
            nil_akhir[i] = input.nextInt();
        }
    System.out.println("\nData yang diinput ke elemen array \n");
    for(i=0;i<6;i++)
    {
    System.out.print("Nilai Akhir Index "+i);
    System.out.println(" = "+nil_akhir[i]);
         }
       }
    
}
