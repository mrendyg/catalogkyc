
package com.andyg.catalogkyc;

import com.andyg.catalogkyc.gi.menuseleccionmodelo;
import javax.swing.JFrame;


public class Catalogkyc {

    public static void main(String[] args) {
        JFrame menu = new JFrame("Catalogo KYC");
        
        menuseleccionmodelo menuseleccion = new menuseleccionmodelo();
        
        menu.add(menuseleccion);
        
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.pack();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
           
    }
}
