import java.util.Scanner;

public class Texto_3 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("Escribe texto ...");
       String texto = sc.nextLine();
     
       System.out.println("Dime por donde quieres cortal el texto..."); 
       int primercorte = sc.nextInt(); 
       sc.nextLine();
       

       //corta la palabra desde 0 hasta primercorte 
       String corte = texto.substring(0,primercorte);

       //desde ese corte hasya que acabe la frase
       String corte2 = texto.substring(primercorte);


       
       System.out.println(corte + "/" + corte2);
        

        sc.close();
    }
}
