import java.util.Scanner;

public class Texto_5 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

    
     System.out.println("Escribe texto"); 
       String texto = sc.nextLine().toUpperCase();
       char caracterARemover = ' '; 
       StringBuilder builder = new StringBuilder(texto); 
       builder.deleteCharAt(caracterARemover);
       String textomodificado = builder.toString();
       

    
       System.out.println("Que palabra quieres contar");
       String texto2 = sc.nextLine();
       int palabracontar = textomodificado.indexOf(texto2, caracterARemover); 

        


       System.out.println("La palabra " +  texto2 + " aparecio" + palabracontar);

        sc.close();
    }

   
}