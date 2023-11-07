import java.util.Scanner;

public class Texto_10 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("Escribe texto ...");
       String texto = sc.nextLine();
       char textosinespacio = ' ';
       StringBuilder builder = new StringBuilder(texto); 
       builder.deleteCharAt(textosinespacio); 
       String textomodificado = builder.toString();

       char punto = '.'; 
     

       String corte = textomodificado.substring(0,punto); 

       String corte2 = texto.substring(punto,punto);


       
       System.out.println(corte + "/" + corte2);


       System.out.println( "El texto " + texto + " tiene " +  corte.length());



        sc.close();
    }
}
