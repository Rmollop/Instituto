import java.util.Scanner;

public class Texto_10 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("Escribe texto ...");
       String texto = sc.nextLine();
       String TEXTO = texto.toUpperCase()
     
       String[] corte = texto.split(". " );

    

       System.out.println( "El texto " + texto + " tiene " +  corte.length);



        sc.close();
    }
}
