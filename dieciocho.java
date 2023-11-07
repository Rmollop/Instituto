import java.util.Scanner;

public class dieciocho {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
       System.out.println("Primer numero");
       int primero = sc.nextInt();
       System.out.println("Segundo numero"); 
       int segundo = sc.nextInt();
       
       System.out.println("Realizado con bucle for");
       for( int i = primero ; i<=segundo ; i+=7){

            System.out.println( i);

       }
       
       System.out.println("Realizado con bucle while");
      System.out.println("___________");
       int i = primero;
        while( i <= segundo){
            System.out.println(i);
           i+=7;
        }
        

        sc.close();
    }
}
