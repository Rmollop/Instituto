//buscar vocaless

import java.util.Scanner;

public class PruebaBucle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe....");
        String texto = scanner.nextLine();
        int posicion = 0; 
        int contador = 0; 
        
         
        
        while (  contador < texto.length()) {
          if (texto.charAt(contador ) == 'a' || texto.charAt(contador ) == 'e' ||  texto.charAt(contador ) == 'i' || texto.charAt(contador ) == 'o' || texto.charAt(contador ) == 'u') {

          }
 


             contador++;
        } 
        
        System.out.println("Hay " + contador + "vocales en " + texto);
        scanner.close();


    } 
    
}
//dada una cadena introducida por pantalla mostrar el numero de vocales que tiene 