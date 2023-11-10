import java.util.Scanner;

public class juego {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);   
        int i=0; 

        int enteroAjustado = ((int)Math.floor(Math.random() * 3)) + 1;
        

        
        while(i<2){
            System.out.println("Dime un numero entre 1 y 3");
            int intento = sc.nextInt();
        if( intento == enteroAjustado){
            System.out.println("Correcto, el numero es: " + enteroAjustado);
            break;
        }else {
         
            System.out.println("Incorrecto, vuelva a itentarlo") ;
        }
        i++;
    
    }
  

        sc.close();
    }
    
}

