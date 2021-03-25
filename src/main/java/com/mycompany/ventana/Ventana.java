/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ventana;

import static java.awt.Color.BLUE;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        this.setSize(500,500);//Establecems el tamano, se puede ejecutar sin this.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Hola");// 
       // this.setLocation(100,200);//Estabecemos donde apece la ventana
       // this.setBounds(100, 200, 500, 500);// Mueve y ademas pones el tamano de la ventana, es setLocation y set Size
        this.setLocationRelativeTo(null);//Establecemos la ventana al centro
        this.getContentPane().setBackground(BLUE);
    }
}
