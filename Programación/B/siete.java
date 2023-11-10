import java.util.Scanner;

public class siete {
     public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       int clave = 1234; 
       
       int i = 0; 
       while(i<4){
            System.out.println("Dime la clave: ");
            int intentoclave = sc.nextInt();
        
            if (intentoclave== clave){  
                System.out.println("Estas dentro");
                //romper bucle
                break;

             } else if (intentoclave!=clave ){
                    System.out.println("Clave incorrecta");
                    
                    
            } 
        }
             
        sc.close();
           
       }
        
        
        
        
        

    }

