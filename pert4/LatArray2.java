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
public class LatArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int i,j;
    int[][]data_jual;
    data_jual=new int[3][3];
    Scanner input=new Scanner(System.in);
        for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                System.out.print("Masukkan data jual ke["+i+"]["+j+"] = ");
                data_jual[i][j] = input.nextInt();
                }
            System.out.println();
            }
    System.out.println("\nData jual yang bilangan ke elemen array\n");
    for(i=0;i<3;i++)
    {
    for(j=0;j<3;j++)
    {
    System.out.print("Nilai data jual ["+i+"] ["+j+"]");
    System.out.println(" = " +data_jual[i][j]);
    }
    System.out.println();
    }
   }
    
}
