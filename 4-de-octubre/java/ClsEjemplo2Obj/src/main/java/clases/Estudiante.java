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

    public String getNombre() {
        return nombre;
    }

    public float getNotaParcial1() {
        return notaParcial1;
    }

    public float getNotaParcial2() {
        return notaParcial2;
    }

    public float obtenerNotaFinal() {
        return notaFinal;
    }
    
    public void calcularNotaFinal() {
        notaFinal = (notaParcial1 + notaParcial2 )/2;
    }
    
    public String obtenerMensaje(){
        if (notaFinal > 3){
            return "el estudiante: " +nombre+ " Aprobo";
        } else {
            return "el estudiante: " +nombre+ " Reprobo";
            
        }
    }

    public void setNotaParcial1(float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNotaParcial2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
