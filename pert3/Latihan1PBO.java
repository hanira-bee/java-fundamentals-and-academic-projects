
package pert3;
import java.util.Scanner;
/**
 *
 * @author AcerPutri
 */
public class Latihan1PBO {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int gaji;
    double besar_pajak, total_gaji;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan Gaji       : Rp. ");
    gaji=input.nextInt();
    System.out.println("=========================================");
    System.out.println("Besar pajak         : 10%");
    besar_pajak=gaji*0.1;
    total_gaji=gaji-besar_pajak;
    System.out.println("Jumlah PPN (Rp.)    : Rp. "+besar_pajak);
    System.out.println("Total gaji          : Rp. " +total_gaji);

}
    
}
