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
            Float notaFinal = (nota1 + nota2) / 2;
            JOptionPane.showMessageDialog(null,"informacion del estudiante\n nombre:" 
            +nombre+"\nNota final: " +notaFinal);
        
       if(notaFinal >= 3){
            
            JOptionPane.showMessageDialog(null, "El estudiante aprueba el cuerso");
        } else{
            JOptionPane.showMessageDialog(null, "El estudiante reaprueba el cuerso");
        } }
        /*
        \n salto de linea
        simpre preferible colocar null
        JOptionPane ingresar datos
        
        (nota1 + nota2) / 2; entre parentesis
        
            
        */
        
        
    }
}
