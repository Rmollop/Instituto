import java.util.Scanner;

public class edad {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       int i=0;
       int maximonumero= 0;
       int minnumero=0;
       
       
        do{
        i++;
        
        System.out.println("Dime un numero");
        int numero = sc.nextInt();
        
        
            if(numero>=maximonumero){
                maximonumero=numero;
              
            }else if(numero < minnumero && numero != 0){
                minnumero=numero;
            }

            
             

        }while(i<5);

        System.out.println("El numero mas grande es: "+maximonumero);
        System.out.println(minnumero);
        
        
        
        

        sc.close();
    }
}
//pregutnar varias veces el numero y sacar el mas grande y mas chico 