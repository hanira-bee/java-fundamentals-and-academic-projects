/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6;
import javax.swing.*;
import java.awt.*;

public class Latihan3 extends JFrame {
    JPanel jp =  new JPanel();
    JTextField jt = new JTextField();
    JLabel jl=new JLabel("contoh label");
    
    public Latihan3(){
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jt.setBounds(120,20,80,25);
    }
    
    public static void main(String[]args){
        Latihan3 demo2 = new Latihan3();
        
        demo2.setTitle("form dengan label dan textfield");
        demo2.setSize(300,300);
        demo2.setVisible(true);
        
    }
    
}
