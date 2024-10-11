/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.clsejemplo2obj;

 import clases.Estudiante;
 import javax.swing.JOptionPane;
 git 
 /**
  *
  * @author APRENDIZ
  */
 public class ClsEjemplo2Obj {
 
     public static void main(String[] args) {
         
         Estudiante est;
         for (int i = 1; i <= 3; i++) {
             String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
             float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
             float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
 
             est = new Estudiante(nombre);
             est.setNotaParcial1(nota1);  // Nota parcial 1
             est.setNotaParcial2(nota2);  // Nota parcial 2
             est.calcularNotaFinal();     // Calcular la nota final
 
             JOptionPane.showMessageDialog(null, "El estudiante " + est.getNombre() + 
                 "\nObtuvo una nota final de " + est.obtenerNotaFinal() + 
                 ". Por consiguiente, " + est.obtenerMensaje());
         }
 
         // Ejemplo adicional de creación de estudiantes
         /*Estudiante estudiante = new Estudiante("pepe");
         estudiante.setNotaParcial1((float)1.5); // Usando 'f' para indicar que es un float
         estudiante.setNotaParcial2((float)4.0);
         estudiante.calcularNotaFinal();     
 
         JOptionPane.showMessageDialog(null, "El estudiante " + estudiante.getNombre() + 
             " obtuvo la nota final: " + estudiante.obtenerNotaFinal() + 
             ". Por consiguiente " + estudiante.obtenerMensaje());
 
         Estudiante est2 = new Estudiante("carlos drodiges", Float.parseFloat("3"), Float.parseFloat("4.5"));
         est2.calcularNotaFinal();
         
         JOptionPane.showMessageDialog(null, "El estudiante " + est2.getNombre() + 
             " obtuvo la nota final: " + est2.obtenerNotaFinal() + 
             ". Por consiguiente " + est2.obtenerMensaje()); */
     }
 }