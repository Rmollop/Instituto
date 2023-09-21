//importamos la utilidad scanner para que java sepa lo que quieres hacer 
import java.util.Scanner;

public class ejemplo1 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Escribe un numero entero"); //Al estar antes que el "int" sale primero 
       int numero1 = sc.nextInt(); //La variable "sc" le dije que escanee el teclado)
       
       System.out.println("Escribe un numero entero"); 
       int numero2 = sc.nextInt();

       System.out.println("Escribe un numero entero"); 
       int numero3 = sc.nextInt();

        int suma = numero1 + numero2 + numero3; //variable para identificar la suma 

       System.out.println("El resultado es " + suma); //usando esa variable suma sacamos el resultado de los dos numeros 
       System.out.println("Adios");
       
        sc.close();

    }
    

}

