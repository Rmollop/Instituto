import java.util.Scanner;

public class ocho {
     public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("Dime la tabla que quieres");
       int numero = sc.nextInt(); 
       //usas el blucle para que en cada vuelta multiplique la vuelta en la que este por el numero introducido 
       int i=0; 
       while (i<=10){
        int resultado = numero * i; 
        System.out.println(resultado);
        i ++;
            
       }
       
        
        
        
        
        

        sc.close();
    }
}
