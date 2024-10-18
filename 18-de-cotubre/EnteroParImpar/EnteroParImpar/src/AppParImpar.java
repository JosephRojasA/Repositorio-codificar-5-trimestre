import java.util.Scanner;

public class AppParImpar {
    public static void main(String[] args) throws Exception {

        int i = 0;
        int num = 0; 
        for (i = num; i <= 5; i ++) {
            Scanner sc = new Scanner(System.in);
        
            System.out.println("ingrese un numero: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("El numero es par ");
            } else {
    
                System.out.println("el numero es impar");
            }
        }
        
    }
}
