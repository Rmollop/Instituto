import java.util.Scanner;

public class Pruebaequal {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        System.out.println("escribe si o no ");
        String respuesta = sc.nextLine();

        if ( respuesta.equals("si")){
            System.out.println("Respondieste si");
        }else  {
            System.out.println("Respondiste no ");
        }
        
        
        
        

        sc.close();
    }
}
