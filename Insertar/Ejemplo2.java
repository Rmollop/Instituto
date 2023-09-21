//importamos la utilidad scanner para que java sepa lo que quieres hacer 
import java.util.Scanner;

public class Ejemplo2 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Vamos a sumar, escribe un numero entero"); //Al estar antes que el "int" sale primero 
       int numero1 = sc.nextInt(); //La variable "sc" le dije que escanee el teclado)
       
       System.out.println("Escribe otro numero entero"); 
       int numero2 = sc.nextInt();

       System.out.println("Escribe un numero entero más"); 
       int numero3 = sc.nextInt();

       int suma = numero1 + numero2 + numero3;

       System.out.println("El resultado es " + suma);

       System.out.println("Vamos a rectar, escriba un numero entero:"); 
       int numero4 = sc.nextInt();

       System.out.println("Escribe otro numero entero"); 
       int numero5 = sc.nextInt();

       int resta = numero4 - numero5; 

       System.out.println("El resultado es " + resta);

        
    
       System.out.println("Adios pichita");
       sc.close();

    }
    

}