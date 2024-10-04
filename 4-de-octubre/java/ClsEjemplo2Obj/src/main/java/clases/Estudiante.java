/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author APRENDIZ
 */
public class Estudiante {
    private String nombre;
    private float notaParcial1, notaParcial2, notaFinal;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float np1, float np2) {
        this.nombre = nombre;
        this.notaParcial1 = np1;
        this.notaParcial2 = np2;
    }
    
    
}
