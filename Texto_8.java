
import java.util.Scanner;



public class Texto_8 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
 
        System.out.println("Escribe un numero desde 1 hasta 127 ");
        int codigo = sc.nextInt();

        if (codigo >=0 && codigo <= 127  ){
            char letra = (char) codigo; 
            System.out.println("La letra es: " + letra);
        }else System.out.println("El valor es demasiado grande");  

        sc.close();

    }
           
    }

