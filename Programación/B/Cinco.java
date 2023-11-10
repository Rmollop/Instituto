import java.util.Scanner;

public class Cinco {
     public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
       int numero= 320;
     
        while(numero >= 160){
           
          System.out.println(numero);
        numero = numero - 20;
          
         
        }
        
        
        
        

        sc.close();
    }
}
//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle  while 
