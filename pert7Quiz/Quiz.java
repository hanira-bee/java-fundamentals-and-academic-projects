//Nama  : Putri Ramadhani
//NIM   : 17230496
//Kelas : 17.2A.24
//Matkul: PBO (Quiz)

package pert7Quiz;
import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String [] merk = new String [10];
        String [] namaproduct = new String [10];
        String [] ukuran = new String [10];
        String [] ukuranproduct = new String [10];
        int  i, data;
        double [] bayar = new double[10];
        double [] harga = new double [10]; 
        int [] jumbel = new int [10];
        String tanya = "";
        
        do{
            System.out.print("Masukkan jumlah data yang mau dimasukkan : ");
            data = input.nextInt();
            for (i=1;i<=data;i++)
            {
                System.out.println("\t\t\t\t DATA -"+i);
                System.out.println("Pilihan SUSU");
                System.out.println("=================================");
                System.out.println("1. Dancow");
                System.out.println("2. Bendera");
                System.out.println("3. Milo");
                System.out.println("=================================");
        
                System.out.print("Masukkan merk [D/B/M] : ");
                merk[i]=input.next().toUpperCase();
                if (merk[i] == "D" || merk[i] == "d"){
                    namaproduct[i] = "Dancow";
                }
                else if (merk[i] == "B" || merk[i] == "b"){
                    namaproduct[i] = "Bendera";
                }
                else if (merk[i] == "M" || merk[i] == "m"){
                    namaproduct[i] = "Milo";
                }
        
        
                System.out.println("\nUkuran:");
                System.out.println("1. Kecil");
                System.out.println("2. Sedang");
                System.out.println("3. Besar");
                System.out.print("Masukkan ukuran [k/s/b] : ");
                ukuran[i] =input.next().toLowerCase();
                if (ukuran[i] == "k"){
                    ukuranproduct[i] = "kecil";
                    harga[i] = 15000;
                }else if (ukuran[i] == "s"){
                    ukuranproduct[i] = "sedang";
                    harga[i] = 30000;
                }else if (ukuran[i] == "b"){
                    ukuranproduct[i] = "besar";
                    harga[i] = 45000;
                }
            
                System.out.print("Masukkan jumlah yang ingin dibeli : ");
                jumbel[i] = input.nextInt();
             
            }
            
                System.out.println("/n===========================================================================");
                System.out.println("| NO | Merk     | Ukuran    | Harga     | Jumlah    | Bayar         |");
                
                for (i=1;i<=data;i++)
                {
                    bayar[i] = jumbel[i]*harga[i];
                    System.out.println("| "+i+" | "+namaproduct[i]+"      | "+ukuranproduct[i]+"     | "+harga[i]+"     | "+jumbel[i]+"    | "+bayar[i]+"         |");
                }
                System.out.println("=============================================================================");
                System.out.print("Ingin ulang lagi [Y/T] : ");
                tanya = input.next();
        
            }
            while(tanya.equals("Y") || tanya.equals("y"));
    }
    
}
