import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Condicional1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca primer carácter: ");
        char car1 = (char) reader.read(); // lee el primer carácter
        reader.readLine(); // limpiar el salto de línea

        System.out.print("Introduzca segundo carácter: ");
        char car2 = (char) reader.read(); // lee el segundo carácter
        reader.readLine(); // limpiar el salto de línea

        if (car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
