/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class ClasEjerc3 {
    List<Integer> listado = new ArrayList<>();
    int numero,tres=0;
    public List<Integer> getListado() {
        return listado;
    }

    public void setListado(List<Integer> listado) {
        this.listado = listado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void valorRepetido()
    {
        try
       {          
           listado.add(numero);
           tres =0;
           for(int ini:listado)
           {
              if(numero == ini)
              {
                  tres++;
              }
              if(tres == 3)
              {
                  JOptionPane.showMessageDialog(null, "El numero: " + numero + " Se repitio por 3ra vez");
                  tres = 0;
                  listado.clear();
              }
              
           }
           
           
       }
       catch(Exception e)
       {
           
       }
    }
}
