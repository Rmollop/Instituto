import java.util.Scanner;

public class Texto_9 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        System.out.println("En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite");
    
        System.out.println("¿Quien más estaba en casa de juan? Esribe ...");
        String a = sc.nextLine();
       
        System.out.println("En la casa de juan estaban: Juan , pedro , luis ,"+ a +" y mario");


       sc.close();

    }    
    
}
        
  
        

       
    

