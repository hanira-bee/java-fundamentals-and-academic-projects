/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert4;

/**
 *
 * @author AcerPutri
 */
public class InisialisasiArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i,j;
        int[][]nil_akhir = {{150, 159, 230},{100,125,150},{210,125,156}};
        
        System.out.println("Data yang diinput ke elemen array\n");
        //menampilkan data dari elemen array
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                System.out.print("nilai akhir index ["+i+"] ["+j+"] = ");
                System.out.println(" = " +nil_akhir[i][j]);
                }
            }
        // TODO code application logic here
    }
    
}
