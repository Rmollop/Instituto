import java.util.Scanner;

public class Tarea_9 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int numero = sc.nextInt();

        if ( numero % 2 == 0){

            System.out.println("Numero par");
        } else 
            System.out.println("Numero Inpar");
        
        
        
        
        

        sc.close();
    }
}
