import java.util.*;

public class condicional1_7 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double dividendo, divisor;
                System.out.print("Introduzca el dividendo: ");
                dividendo = sc.nextDouble();
                System.out.print("Introduzca el divisor: ");
                divisor = sc.nextDouble();
                if (divisor == 0)
                        System.out.println("No se puede dividir por cero");
                else {
                        System.out.println(dividendo + " / " + divisor + " = " + dividendo / divisor);
                        System.out.printf("%.2f / %.2f = %.2f %n", dividendo, divisor, dividendo / divisor);
                }
        }
}

/*
 * System.out.println("escribe la cantidad de veces");
 * num = sc.nextInt();
 * 
 * for (int i = 1; i <= num; i++) {
 * 
 * }
 */
