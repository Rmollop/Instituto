

import java.util.Scanner;

public class Texto_1 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
    
    

       System.out.println("¿Eres hombre? si o no");
       //leer minusculas
       String a = sc.nextLine();
       //para que acepte mayusculas
       String A = a.toUpperCase();


       //a.equals("palabra") para decir si hay esa palabra 
       if ( a.equals("si") || A.equals("SI")){
            System.out.println( "Eres hombre");

       }else System.out.println("No lo eres");
     

        sc.close();
    }
}