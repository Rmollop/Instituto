//importamos la utilidad scanner para que java sepa lo que quieres hacer 
import java.util.Scanner;

public class Tarea_6 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Escribe un numero para calcular la potencia del cubo "); //Al estar antes que el "int" sale primero 
       float numero1 = sc.nextFloat(); //La variable "sc" le dije que escanee el teclado)
       
    

       float multiplicacion =  numero1 * numero1 * numero1; 

       System.out.println("El resultado es " + multiplicacion); //usando esa variable suma sacamos el resultado de los dos numeros 
       System.out.println("Adios");
       
       
        sc.close();

    }
    

}

