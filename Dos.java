import java.util.Scanner;

public class Dos {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        int numero = 100;
        int i=0;
        while(i<numero){
            if((i)%5==0){
                System.out.println(i);
            }
            i++;
        }
        
        
        
        

        sc.close();
    }
    
}

// multiplo de 5 entre 0 y 100 