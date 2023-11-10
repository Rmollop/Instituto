//buscar vocaless

import java.util.Scanner;

public class PruebaBucleFacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe....");
        int numero = scanner.nextInt(); 
        
        String asterisco = "*"; 
        String Noc = "@"; 
        String Noc2 = "$";
        int contador = 0; 
        
         
        
        while (  contador < numero) {
          if ( (contador+1)%5==0 ){  
                System.out.println(Noc2);}

           if ( (contador)%2==0){
                 System.out.println(asterisco);
           } 
           if ( (contador)%3==0){
            System.out.println(Noc);

           }
            

        
             contador++;
        } 
        
       
        scanner.close();


    } 
    
}
//dada una cadena introducida por pantalla mostrar el numero de vocales que tiene 