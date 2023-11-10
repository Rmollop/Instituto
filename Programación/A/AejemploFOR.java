package Programación.A;
import java.util.Scanner;

public class AejemploFOR {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("Dime el numero");
       int n = sc.nextInt();
       System.out.println("Normal");
       //int 1 empieza por 1 y luego si i es menor de n pues sigue y pues i++ para que sume. Esto imprime * las veces que diga por teclado
       for( int i = 1  ; i <= n; i++  ){

              //este for da las vuetltas que de el primer bucle , asi vamos pintando lo que queremos las mismas veces que el bucle 1
            for(int j=1 ; j <= i; j++ ){
              
                System.out.print("*");
                
            }System.out.println();
             
       }
   System.out.println("-----------------------");
   System.out.println("Inverso");
        for( int i = 1 ; i <=n; i++  ){

            //decimos que j = n en vez de decirle que empieze por 1 asi da n vueltas y solo ponemos que cuando j sea mayor que i pues y j-- para que vaya hacia detras 
            for(int j=n ; j >= i; j-- ){

                System.out.print("*");
                
            }
        System.out.println();  
           
      
       }
   
        
        

        sc.close();
    }
}
