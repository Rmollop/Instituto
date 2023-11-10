package Programación.Bucle;
//letra orden inverso

import java.util.Scanner;

public class PruebaBucle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe..");
        String texto = scanner.nextLine();

        //con el length -1 lo que haces es ir hacia detras para contar la cadena 
        int contador = texto.length() -1; 

        //inversa "" es que no tiene ahora mismo nada 
        String inversa = "";
        
        
        // contador >= de 0 seguimos haciendo el while pero una vez que ya termina el texto pues para 
        while (contador >= 0 ){
            //con el inversa + charat colocamos los caracteres
            inversa = inversa + texto.charAt(contador); 
            contador--;


        }
       
        System.out.println("El texto es: " + inversa);
     
        scanner.close();
 

    } 
    
}
// palabras al reve

