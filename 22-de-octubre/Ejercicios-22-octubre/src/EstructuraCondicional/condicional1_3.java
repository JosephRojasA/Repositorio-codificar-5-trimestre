// Ejercicio 3
/*
 * 
 * 
*/
import java.io.*;
import java.util.*;
public class condicional1_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        char car;
       
        
         System.out.println("Introduzca un carácter: ");
        car = (char)System.in.read(); // para leer solo un caracter

        if (Character.isUpperCase(car))
        System.out.println("Es una letra en mayuscula");
        else
        System.out.println("No es una letra Mayuscula");   
        

        
    }
}
