/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert2;

/**
 *
 * @author AcerPutri
 */
public class OptPembanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        boolean aa,bb,cc,dd,ee,ff;
        
        a = 5; b = 6; c = 3; d = 9; e = 8; f = 2;
        
        aa = a== b;
        bb = b> c;
        cc = c< d;
        dd = d>= e;
        ee = e<= f;
        ff = b!= a;
        
        System.out.println("Apakah "+a+"== "+ b +"? jawabannya "+ aa);
        System.out.println("Apakah "+b+"> "+ c +"? jawabannya "+ bb);
        System.out.println("Apakah "+c+"< "+ d +"? jawabannya "+ cc);
        System.out.println("Apakah "+d+">= "+ e +"? jawabanny "+ dd);
        System.out.println("Apakah "+e+"=< "+ f +"? jawabannya "+ ee);
        System.out.println("Apakah "+b+"!= "+ a +"? jawabannya "+ ff);
        // TODO code application logic here
    }
    
}
