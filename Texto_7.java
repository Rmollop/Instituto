
import java.util.Scanner;



public class Texto_7 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
 
        System.out.println("Escribe ... ");
        char caracter = sc.nextLine().charAt(0); 

        if ( Character.isDigit(caracter)){
            System.out.println("Es un numero");
        } else if (Character.isWhitespace(caracter)){
            System.out.println("Es un espacio");
        } else if (Character.isLetter(caracter)){
            System.out.print("Caracteres ");
        if (Character.isUpperCase(caracter)) {
                System.out.print("en mayuscula");
            }
                
         } else System.out.println("No es ni una letra, ni un numero y tampoco un caracter");

        sc.close();

    }
           
    }

