

import java.util.Scanner;

public class Texto_2 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
    
        System.out.println("Introduce un texto...");
        String texto = sc.nextLine();
        //cuenta cuantos caracteres hay en texto y lo guarda en cuentatexto
        int cuentatexto = texto.length(); 
    
        System.out.println("Introduce un numero...");
        int numero = sc.nextInt();

        if ( cuentatexto > numero ){
            //das un numero y te devuelve la letra que haya (empieza por 0)
            char a = texto.charAt(numero -1 );
            System.out.println(" La letra que pertenece al caracter " + numero +" es la letra "+ a);

        }else System.out.println("Numero demasiado alto");
        
        sc.close();

}
}