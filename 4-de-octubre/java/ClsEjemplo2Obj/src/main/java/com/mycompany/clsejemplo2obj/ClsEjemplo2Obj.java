/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clsejemplo2obj;

import clases.Estudiante;

/**
 *
 * @author APRENDIZ
 */
public class ClsEjemplo2Obj {

    public static void main(String[] args) {
    Estudiante estudiante = new Estudiante ( "Juan");
    estudiante.setNotaParcial1((float)3.5);
    estudiante.setNotaParcial2((float)3.5);
    estudiante.calcularNotaFinal((float)3.5);
    }
}
