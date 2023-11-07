
//importamos la utilidad scanner para que java sepa lo que quieres hacer 
import java.util.Scanner;

public class Tarea_7 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Escribe el radio "); //Al estar antes que el "int" sale primero 
       float radio = sc.nextFloat(); //La variable "sc" le dije que escanee el teclado)
       
       double pi = 3.14;
       double longitud = (pi * pi) * radio; 
       double area = pi * (radio * radio); 
       
       System.out.println("El resultado de la longitud es  " + longitud); 
       System.out.println( "El resultado del area Área es " + area);
       
       
       
        sc.close();

    }
    

}
