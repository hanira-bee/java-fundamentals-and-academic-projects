
package pert4;
import java.util.Scanner;
/**
 *
 * @author AcerPutri
 */
public class LatihanPBO3 {
    public static void main(String[] args) {
    int panjang, lebar, pilih;
    double luas, keliling;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("MENGHITUNG LUAS DAN KELILING PERSEGI PANJANG");
    System.out.print("\nMasukkan Panjang : ");
    panjang = input.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar = input.nextInt();
    
    System.out.println("=========================");
    System.out.println("1. Luas");
    System.out.println("2. Keliling");
    System.out.println("=========================");
    System.out.print("Masukkan pilihan anda [1/2] : ");
    pilih = input.nextInt();
    switch (pilih){
        case 1:
            luas = panjang * lebar;
            System.out.println("Luas Persegi Panjang adalah "+luas);
            break;
        case 2:
            keliling = (panjang+lebar)*2;
            System.out.println("Keliling Persegi Panjang adalah "+keliling);
            break;
 
        }
    
    }
}
   