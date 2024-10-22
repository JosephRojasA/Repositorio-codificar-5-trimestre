import java.io.IOException;

public class condicional1_5 {
    public static void main(String[] args) throws IOException {
        char car1, car2;

        System.out.println("Introduzca el primer caracter: ");
        car1 = (char) System.in.read(); // lee el primer caracter
        System.in.read(); // consume el salto de línea

        System.out.println("Introduzca el segundo caracter: ");
        car2 = (char) System.in.read(); // lee el segundo caracter
        System.in.read(); // consume el salto de línea

        if (car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}

        

        /*System.out.println("escribe la cantidad de veces");
        num = sc.nextInt(); 
        
        for (int i = 1; i <= num; i++) {

        } */

   