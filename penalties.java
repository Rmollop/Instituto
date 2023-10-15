import java.util.Scanner;

public class penalties {
     public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
        
        char gol = 'O'; 
        int golEquipo1 = 0; 
        int golEquipo2= 0; 
        int i=0;
         //int max = 10; 
        while (i<5){
            System.out.println(" (Equipo 1)--Te toca tirar. ¿Donde quieres pegarle?");
            System.out.println("1 IZQ - 2 CEN - 3 DER");
            int tirar = sc.nextInt();
            int numeroaleatorio = ((int)Math.floor(Math.random() * 4)) + 1;
            if ( tirar == numeroaleatorio){
                System.out.println("(Equipo 2)--Paro el penalti");

            }else { System.out.println("GOOOOOOOOO!"); 
                golEquipo1++; 
               
            }

            System.out.println("(Equipo 1)--Te toca parar. ¿Donde quieres tirarte?");
            System.out.println("1 IZQ - 2 CEN - 3 DER");
            int parar = sc.nextInt();
            int numeroaleatorio2 = ((int)Math.floor(Math.random() * 4)) + 1;
            if ( parar == numeroaleatorio2){
                System.out.println("(Equipo 1)--Has parado el penalti");
                

            }else { System.out.println("(Equipo 2)--Marco GOL");
                golEquipo2++; 
               
                
            }
              System.out.println( "Resultado: (Equipo 1) :" + golEquipo1+" | (Equipo 2) : " + golEquipo2);

            
              if ( golEquipo1 == golEquipo2 ){
                i--;

            }
            i++;

          

        }
       

    

        

        
        
        

        sc.close();
    }
}
