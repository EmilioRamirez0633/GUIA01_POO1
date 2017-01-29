/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class ClasEjerc2 {
    File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String linea,inic = "";

    public void setInic(String inic) {
        this.inic = inic;
    }
    public String leerFichero()
    {
         try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("nombres.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         
         while((linea=br.readLine())!=null)
         {
            System.out.println(linea);
            inic = inic + linea.charAt(0);
         }
         JOptionPane.showMessageDialog(null, inic);
            
      }
      catch(Exception e){
         e.printStackTrace();
      }
         return inic;
    }
}
