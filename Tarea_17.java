import java.util.Scanner;

public class Tarea_17{
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        System.out.println("Valor de R");
        double r = sc.nextDouble();
        
        
        System.out.println("Valor de H");
        double h = sc.nextDouble();
        
        //poniendo float si luego en el numero pongo f minuscula le digo que es flotante
        float pi = 3.14f;

        Double v = 0.33 * pi * r * r * h; 

        System.out.println("El valor de V es " + v  );

        sc.close();
    } 
}
