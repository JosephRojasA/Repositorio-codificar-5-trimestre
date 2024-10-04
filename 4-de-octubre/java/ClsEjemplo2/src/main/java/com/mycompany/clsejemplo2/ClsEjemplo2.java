/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clsejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class ClsEjemplo2 {

    
    
    public static void main(String[] args) {
        for(int est= 0; est <= 2; est++){
            String nombre =JOptionPane.showInputDialog(null,"ingrese el nombre del estudiante");
            Float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota del estudiante"));
            Float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 2 del estudiante"));
        }
    }
}
