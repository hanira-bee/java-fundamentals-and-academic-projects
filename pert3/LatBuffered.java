
package pert3;
import java.io.*;
/**
 *
 * @author AcerPutri
 */
public class LatBuffered {
    public static void main(String args[]) throws Exception
{
InputStreamReader keyreader = new InputStreamReader (System.in);
BufferedReader input = new BufferedReader (keyreader);

String kata1,kata2;

System.out.print("Masukkan Kata Pertama : ");
kata1 = input.readLine();
System.out.print("Masukkan Kata Kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String " +kata1 + " " + kata2);
        // TODO code application logic here
}
    
}
