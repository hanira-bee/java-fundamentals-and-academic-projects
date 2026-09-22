/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert3;

import java.util.Scanner;

/**
 *
 * @author AcerPutri
 *         /*
 */
public class LatIfElse {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String keterangan, nama;
    int nilai;

    System.out.print("Masukkan Nama Siswa: ");
    nama = input.nextLine();
    System.out.print("Masukkan Nilai akhir : ");
    nilai = input.nextInt();
        if (nilai > 70) {
            keterangan = "lulus";
        }else{
            keterangan = "Gagal";
        }
        System.out.println("Hasil Akhir");
        System.out.println("========================================= ");
        System.out.println("Nama Siswa                  : " + nama);
        System.out.println("Nilai Akhir yang di dapat   : " + nilai);
        System.out.println("keterangan                  : " + keterangan);
        System.out.println("=========================================");
    }

}
