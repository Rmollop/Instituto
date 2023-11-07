import java.util.Scanner;

public class factorial {

    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        System.out.println("Dime un numero positivo");
        int numero = sc.nextInt();
        
        
        int resultado = 1;
        
        for(int i=1;i<=numero;i++){
            resultado = resultado*i;
            System.out.println(resultado);
           

        }

     
        
        sc.close();
    }
}
