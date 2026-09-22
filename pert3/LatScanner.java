
package pert3;
import java.util.Scanner;
/**
 *
 * @author AcerPutri
 */
public class LatScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);

    String nama;
    int n2;
    double n1, n3;
    
    System.out.print("Masukkan Nama Anda : ");
    nama = input.nextLine();
    System.out.print("Masukkan Nilai 1 : ");
    n1 = input.nextDouble ();
    System.out.print("Masukkan Nilai 2 : ");
    n2 = input.nextInt();
    
    n3 = n1 + n2;
    System.out.println("\nNama anda : " +nama);
    System.out.println("Nilai anda : " +n3);
// TODO code application logic here
    }
    
}
