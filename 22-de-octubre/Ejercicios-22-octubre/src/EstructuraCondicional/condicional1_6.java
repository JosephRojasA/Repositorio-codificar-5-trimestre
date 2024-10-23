import java.io.*;
public class condicional1_6 {
    public static void main(String[] args) throws Exception {
        char car1;
    
        System.out.println("Introduzca carácter: ");
        car1 = (char)System.in.read();

        if(Character.isDigit(car1))
            System.out.println("Es un numero");
        else
            System.out.println("No es un número");

    }

}
