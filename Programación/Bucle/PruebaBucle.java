package Programación.Bucle;
import java.util.Scanner;


public class PruebaBucle {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        String texto =" Hola que haces, como estas";
        System.out.println("Que palabras estas buscando");
        char condition = 'c'; 


        int posicion = 0; 
        while ( posicion < texto.length() && texto.charAt(posicion)!= condition ){
            System.out.println("Buscando...");
            posicion = posicion +1; 
        }
        if ( posicion < texto.length()){
            System.out.println("La posición es la "+  posicion);
        }else {
             System.out.println("No se encontro");
        }
       

        sc.close();
    }
}

