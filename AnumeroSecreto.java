import java.util.Scanner;

public class AnumeroSecreto {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        
        int numeroaleatorio = ((int)Math.floor(Math.random() * 100)) + 1;
        int intentospartida1= 0; 
        
        boolean i = true; 

        //numero de intentos 10 
       

        while( i ){

         
            System.out.println("Puedes salir en cualquier momento pulsando 0");
            System.out.println("Escribe un numero entre el 1 y 100: ");
            int numero = sc.nextInt();

            if ( numero == 0){
                i=false;

            }else{ 
            
                if ( intentospartida1 > 10){
                    i=false;
                }else

                    if ( numero == numeroaleatorio){
                        System.out.println("Ole tu polla gorda que es: " + numeroaleatorio);
                        System.out.println("Numero de intentos realizados: " + intentospartida1);
                        i=false;

                    } else if ( numeroaleatorio > numero){
                        System.out.println("Mayor");
                        intentospartida1 = intentospartida1 +1;
                        
                    } else {
                        System.out.println("Menor");
                        intentospartida1 = intentospartida1 +1;
                        
                    }
                }



            }
            sc.close();
        }
        
        
        

        
    }
    

