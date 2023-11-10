import java.util.Scanner;

public class Texto_11 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        String cadenainterna = "0123456789"; 
         
       
        System.out.println("Escribe un numero del 0 al 9...");
        int numero = sc.nextInt(); 
    
        if ( numero < 9 || numero > 0){
            char cadena = cadenainterna.charAt(numero);
            System.out.println("El numero " + numero + " equivale a la cadena " + cadena);
 
        }else {
            System.out.println("Numero demasiado alto/ba");
        }
      
        
        
        

        sc.close();
    }
}
