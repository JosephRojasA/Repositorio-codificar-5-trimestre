import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Condicional1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca primer carácter: ");
        char car1 = (char) reader.read(); // lee el primer carácter
        reader.readLine(); // limpiar el salto de línea

        System.out.print("Introduzca segundo carácter: ");
        char car2 = (char) reader.read(); // lee el segundo carácter
        reader.readLine(); // limpiar el salto de línea

        // Crear objetos Character
        Character c1 = new Character(car1);
        Character c2 = new Character(car2);

        if (c1.equals(c2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}

