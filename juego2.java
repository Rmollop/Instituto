import java.util.Scanner;

public class juego2 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);   
        int i=0; 
        //para no poner break
        int max =2; 
       
        while(i<max){
           
            int numero = ((int)Math.floor(Math.random() * 10)) + 1;
            if ( numero>7){
                System.out.println("perdiste");
            }if (numero < 7){
                System.out.println("Tienes un: " + numero);
                System.out.println("¿Quieres mas cartas? 1 para si y 2 para no" );
                int mas = sc.nextInt();
                if ( mas == 1){
                    int numero2 = ((int)Math.floor(Math.random() * 10)) + 1;
                    System.out.println("Tu numero es: "+numero2);
                    int numerossuma = numero + numero2; 
                    System.out.println(numero2 +"+" +numero + " es igual a: " + numerossuma);
                    if ( numerossuma > 7){
                        System.out.println("perdiste");
                        i=max;
                    }
                    if (numerossuma <7){
                        System.out.println("ganaste");
                        i=max; 
                    }
                    
                    
                 }else{ System.out.println("perdiste");i=max;}

                



            }else { System.out.println("perdiste");}
            
        }
        
     sc.close();
    }
  

       
    }
    

