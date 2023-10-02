import java.util.Scanner;

public class Texto_5 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

    
     System.out.println("Escribe texto"); 
       String texto = sc.nextLine(); 

    
       System.out.println("Que palabra quieres contar");
       String texto2 = sc.nextLine();

       

       int contar = texto.lastIndexOf(texto2); 


       System.out.println(contar);

        sc.close();
    }

   
}