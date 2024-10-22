import java.util.*;
public class Condicional1_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("cuando escriba 100 se sale");
      
        
    //    for(int i = 1; i < num; i++){
    
    int N = 0;
            while (N <= 100) {
                   
        
        System.out.println(" Numero Entero\n");
        N = sc.nextInt();
        if(N%10==0)
            System.out.print(" es multiplo de 10");
            
            else
            System.out.print(" No es multiplo de 10");
            }
    }
    }



