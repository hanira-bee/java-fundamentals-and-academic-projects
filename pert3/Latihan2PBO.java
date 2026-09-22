
package pert3;
import java.util.Scanner;
/**
 * @author AcerPutri
 */
public class Latihan2PBO {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nama, bentuk_tubuh;
    double bt, tb, bb, konversi_tb;
    
System.out.print("Masukkan nama anda : ");
nama = input.nextLine();
System.out.print("Masukkan berapa berat badan anda (kg) : ");
bb = input.nextDouble();
System.out.print("Masukkan berapa tinggi badan anda (cm) : ");
tb = input.nextDouble();

konversi_tb = tb / 100;
bt=bb/(konversi_tb*konversi_tb);
    if (bt<18.5){
        bentuk_tubuh = "Sangat Kurus";
    }else if(bt>=18.5 && bt<25){
        bentuk_tubuh = "Normal/sehat";
    }else if(bt>=25){
        bentuk_tubuh = "Gemuk";
    }else{
        bentuk_tubuh = "Kurang spesifik";
    }
    
System.out.println("================================================");
System.out.println("Nama pengguna : "+nama);
System.out.println("Nilai BT (bentuk tubuh) anda adalah : "+bt);
System.out.println("Anda termasuk berbadan "+bentuk_tubuh);
System.out.println("================================================");
    }
}
