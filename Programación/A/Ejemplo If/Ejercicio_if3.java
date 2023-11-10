
import java.util.Scanner;

public class Ejercicio_if3 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Escribe un numero entero"); //Al estar antes que el "int" sale primero 
       int numero1 = sc.nextInt(); //La variable "sc" le dije que escanee el teclado)
       
       System.out.println("Escribe un numero entero"); 
       int numero2 = sc.nextInt();

      
       if ( numero1 > numero2){
        System.out.println(numero2 +" Es menor que " + numero1 );
       } else if ( numero1 < numero2  ) {
        System.out.println(numero1 + " es menor que " + numero2); 

       } else {
        System.out.println(numero1 + " y " + numero2 + " son iguales ");
       }

       sc.close();

    }
    

}

