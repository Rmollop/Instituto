import java.util.Scanner;

public class Texto_4 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

    
     System.out.println("Escribe texto"); 
       String texto = sc.nextLine(); 

       System.out.println("Letra que quieres reemplazar"); 
       String letra = sc.nextLine(); 

       System.out.println("Letra por la que quieres reemplazar"); 
       String letra2 = sc.nextLine(); 
    
        //cambia letra por letra2 
       String cambiar = texto.replace(letra,letra2); 

       System.out.println(cambiar);


  

        sc.close();
    }
}
