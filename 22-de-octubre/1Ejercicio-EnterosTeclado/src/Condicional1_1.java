import java.util.*;
public class Condicional1_1 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int N, num;
      int i = 0;
        System.out.println("ingrese la cantidad de veces");
      num = sc.nextInt();
      for (i = 1; i <= num; i++  ){

      System.out.println("introduzca el Numero entero: ");
      N = sc.nextInt();
      if(N%2==0)
        System.out.println("par");
        else
        System.out.println("Impar");

      }

    }
}
