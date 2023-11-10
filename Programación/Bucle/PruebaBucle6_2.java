package Programación.Bucle;
//buscar vocales

import java.util.Scanner;

public class PruebaBucle6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe....");
        String texto = scanner.nextLine();
       
       
       
        String palabramaslarga = "";
     
        int posicionActual = 0; 
        String palabramaslargaCandidata= ""; 
       

        while (posicionActual < texto.length()){
            if ( texto.charAt(posicionActual) == ' '){

                if (palabramaslarga.length() < palabramaslargaCandidata.length() ){
                    palabramaslarga = palabramaslargaCandidata;
                }
                 palabramaslargaCandidata = ""; 
                
            } else if (posicionActual == (texto.length() -1)){
                palabramaslargaCandidata = palabramaslargaCandidata + texto.charAt(posicionActual); 
                 if (palabramaslarga.length() < palabramaslargaCandidata.length() ){
                    palabramaslarga = palabramaslargaCandidata;
                }
            }
           else {

                palabramaslargaCandidata = palabramaslargaCandidata + texto.charAt(posicionActual); 
                
            }  
             posicionActual++;
        }
 
        System.out.println(palabramaslarga);

        scanner.close();


    } 
    
}
//dada una cadena introducida por pantalla mostrar el numero de vocales que tiene 