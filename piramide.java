import java.util.Scanner;

public class piramide {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
        
        System.out.println("Dime la altura en numero entero");
        int altura = sc.nextInt();

    

        for( int i = 1 ; i <=altura ; i++){
            //inversa
            for(int j=altura ; j >= i; j-- ){

                System.out.print(" ");
                
            }
              //derecha
            for(int k = 1; k<=i ; k++){
                
                System.out.print(k);
                
            }
            //restamos 1 a la i en cada vuelta para que no salga dobre 
             for (int l=i-1 ; l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
         
        }

        System.out.println("---------------------------------");
        System.out.println("Dime el numero");
        int n = sc.nextInt();
        System.out.println("Normal");
        n=n-1;
        for( int i = 0  ; i <= n; i++  ){
 
            for(int j=n ; j > i; j-- ){

                System.out.print(" ");
                
            }
               //este for da las vuetltas que de el primer bucle , asi vamos pintando lo que queremos las mismas veces que el bucle 1
             for(int j=0 ; j <= i; j++ ){
               
                 System.out.print("*");
                 
             }
             for(int j=1 ; j <= i; j++ ){
               
                 System.out.print("*");
                 
             }
           
             System.out.println();
              
        }
       
        
        

        sc.close();
    }

}