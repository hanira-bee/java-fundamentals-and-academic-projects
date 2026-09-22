/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert3;
import java.util.*;
/**
 *
 * @author AcerPutri
 */
public class LatScan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int kd;
    String nb=" ";
    Scanner input=new Scanner(System.in);
    System.out.print("Masukkan kode barang[1...3]:");
    kd=input.nextInt();
    
    switch(kd)
    {
        case 1:
            nb="Alat Olahraga";
            break;
                
        case 2:
            nb="Alat elektronik";
            break;
                
        case 3:
            nb="Alat alat masak";
            break;
                
        default:
            nb="anda salah kode!";
            break;
    }
    System.out.println("\nNama Barang: "+nb);
    }
    
}
