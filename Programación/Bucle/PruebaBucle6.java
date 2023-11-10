package Programación.Bucle;
//ver palabra mas larga

import java.util.Scanner;

public class PruebaBucle6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe");
        String texto = scanner.nextLine();

        //quitamos el espacio 
        String[] palabras = texto.split(" ");
        
        // Inicializar variables para la longitud máxima y la palabra de mayor longitud
        int longitudMaxima = 0;
        String palabraMayorLongitud = "";
        
        // Inicializar un índice para recorrer el arreglo de palabras
        int indice = 0;
        
        // Usar un bucle while para encontrar la palabra de mayor longitud
        while (indice < palabras.length) {
            String palabraActual = palabras[indice];
            int longitudActual = palabraActual.length();
            
            // Verificar si la longitud actual es mayor que la longitud máxima
            if (longitudActual > longitudMaxima) {
                longitudMaxima = longitudActual;
                palabraMayorLongitud = palabraActual;
            }
            
            // Incrementar el índice para pasar a la siguiente palabra
            indice++;
        }
        
        // Imprimir la palabra de mayor longitud
        System.out.println("La palabra de mayor longitud es: " + palabraMayorLongitud);
        scanner.close();
    }
        


    } 
    

//dado un texto separado por espacios hay que encontrar la palabra de mayor longitud 