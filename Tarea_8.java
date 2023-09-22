

import java.text.StringCharacterIterator;
import java.util.Scanner;


public class Tarea_8 {

    
    

    public static void main(String[] args ){
       Scanner sc; 
      
       sc = new Scanner(System.in);


       System.out.println("¿Tienes dinero? Responde con si/no"); 
       String dinero = sc.nextLine(); 
       
       
       if ( dinero.equalsIgnoreCase("si")){
            System.out.println("Siguiente pregunta ");
        
       } else if ( dinero.equalsIgnoreCase("no")) {
            System.out.println("Pobre");
          
            
       } else{
          System.out.println("Solo si/no por favor");
       }

       

    
      sc.close();
     
    }
    

}
