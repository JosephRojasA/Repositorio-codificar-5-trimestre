/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clsejemplo2obj;

import clases.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class ClsEjemplo2Obj {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("pepe");
        estudiante.setNotaParcial1((float)1.5); // Usando 'f' para indicar que es un float
        estudiante.setNotaParcial2((float)4.0);
        estudiante.calcularNotaFinal();     

        JOptionPane.showMessageDialog(null, "El estudiante " + estudiante.getNombre() + 
            " obtuvo la nota final: " + estudiante.obtenerNotaFinal() + 
            ". Por consiguiente " + estudiante.obtenerMensaje());

        // Corrección en la creación del segundo estudiante
        Estudiante est2 = new Estudiante("carlos drodiges", Float.parseFloat("3"), Float.parseFloat("4.5"));
                    
        est2.calcularNotaFinal();
        
        JOptionPane.showMessageDialog(null, "El estudiante " + est2.getNombre() + 
            " obtuvo la nota final: " + est2.obtenerNotaFinal() + 
            ". Por consiguiente " + est2.obtenerMensaje());
    }
}
