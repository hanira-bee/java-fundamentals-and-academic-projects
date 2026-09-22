/*NAMA  : PUTRI RAMADHANI
 *KELAS : 17.2A.24
 */
package pert5;
import java.util.*;
import java.time.LocalDate;

public class LatihanPert5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.now();
        
        int i,jumdat;
        double pendapatan=0;
        String nama;
        String [] kodbar = new String[10];
        String [] nabar = new String[10];
        int [] jumbar = new int[10];
        double [] harga = new double[10];
        double [] total = new double[10];
        String tanya="";
        
        System.out.println("\n\t\t\t PT.PERTAMA PRATAMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Nama Petugas    : ");
        nama = input.nextLine();
        System.out.println("Tanggal                 : "+newDate);
        
        do{
            System.out.print("\nJumlah Data yang akan dimasukkan    : ");
            jumdat = input.nextInt();
            System.out.println("--------------------------------------------------------------------");

            for(i=1;i<=jumdat;i++)
            {
                System.out.println("Data ke-"+i);
                System.out.print("Kode Barang [P001/V001/M001] : ");
                kodbar[i]=input.next().toUpperCase();
                if (kodbar[i].equalsIgnoreCase("P001")){
                    nabar[i]="Printer               ";
                    harga[i]=700000 ;
                }else if (kodbar[i].equalsIgnoreCase("V001")){
                    nabar[i]="VGA Card              ";
                    harga[i]=75000;
                }else if (kodbar[i].equalsIgnoreCase("M001")){
                    nabar[i]="MotherBoard           ";
                    harga[i]=950000 ;
                }else{
                    nabar[i]="Barang tidak Tersedia ";
                    harga[i]=0;
                    total[i]=0;
                }
                System.out.print("Jumlah                       : ");
                jumbar [i]=input.nextInt();
                System.out.println("-------------------------------------------------------------------");
            }
   
            System.out.println("\n\n\t\t\t\t\t\t PT.PERTAMA PRATAMA");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Nama Petugas                    : "+nama+"\t\t\t\t\t\t   Tanggal   : "+newDate);
            System.out.println("Jumlah Data yang dimasukan      : "+jumdat);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Data ke \t Kode Barang \t Nama Barang \t\t Harga Barang \t Jumlah Barang \t Total Harga");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            
            for(i=1;i<=jumdat;i++)
                
            {
                total[i]=harga[i]*jumbar[i];
                System.out.println("    "+i+"\t\t"+kodbar[i]+"\t    "+nabar[i]+"\tRp. "+harga[i]+"\t\t"+jumbar[i]+"\t\t\tRp. "+total[i]);
                pendapatan=pendapatan+total[i];
            }
            
            System.out.println("\nTotal Pendapatan Pada tanggal "+newDate+" adalah sebesar Rp. "+pendapatan);
            System.out.println("=============================================================================================================================");
            System.out.print("Mau input data lagi? [y/n] : ");
            tanya = input.next();
        }
        while(tanya.equals("y") || tanya.equals("Y"));
    }
}