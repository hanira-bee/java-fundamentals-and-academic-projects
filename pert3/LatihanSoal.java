

import java.util.Scanner;

public class LatihanSoal {
    public static void main(String[] args) {
        int gaji;
        double besar_pajak, total_gaji;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji : Rp.");
        gaji = input.nextInt();

        System.out.println("Besar Pajak     : 10% ");
        besar_pajak = gaji * 0.1;
        total_gaji = gaji - besar_pajak;

        System.out.println("\nJumlah PPN (Rp.)    : Rp." + besar_pajak);
        System.out.println("Total gaji          : Rp." + total_gaji);
    }
}