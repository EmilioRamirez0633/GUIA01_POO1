/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clas;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class ClasEjerc1 {
    int repetir=0;

    public int getRepetir() {
        return repetir;
    }

    public void setRepetir(int repetir) {
        this.repetir = repetir;
    }
    String nombre,iniciales="";

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String Iniciales()
    {
         try
        {
        if(repetir == 0)
        {
            iniciales = iniciales + String.valueOf(nombre.charAt(0));
            
        }
        else{
            if(repetir == 1)
            {
                iniciales = iniciales + String.valueOf(nombre.charAt(0));
                
            }
            else
            {
                if(repetir == 2)
                {
                    iniciales = iniciales + String.valueOf(nombre.charAt(0));
                    nombre = "";
                    repetir = -1;
                }
            }
        }
        repetir++;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Limitese a ingresar solo texto");
        }
                 return iniciales;
    }
}
