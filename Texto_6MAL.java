import java.util.Scanner;

public class Texto_6 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        System.out.println("En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite");
        
        System.out.println("¿Está pedro? Si o no ");
        String a = sc.nextLine();
        String A = a.toUpperCase();

      

       




       if ( A.equals("SI") ||a.equals("si") ) {


        System.out.println( "Pedro estaba ");
       }
    
     else if  ( A.equals("NO") ||a.equals("no")){
        System.out.println("Pedro no estaba");

    }
         
    
    
    


       
        
    
        
        
        
        

        sc.close();
    }
    }
