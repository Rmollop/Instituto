package Programación.A;
import java.util.Scanner;

public class Apenalties {
     public static void main (String [] args){
        Scanner sc; 
        sc = new Scanner(System.in);
        int golEquipo1 = 0; 
        int golEquipo2= 0; 
        String equipo1 = " ";
        String equipo2= " "; 
        int i=0;
        int max = 5;
       // boolean desempate = false; 
       int lanzamientoequipo1 = 0; 
        int  lanzamientoequipo2 = 0; 
    
       boolean diferenciadegoles = true; 

      // va al lado i<5 
        while (i<max || diferenciadegoles ){

            System.out.println("(Equipo 1) -> Te toca tirar. ¿Donde quieres pegarle?");
            System.out.println("1 IZQ - 2 CEN - 3 DER ");
            int tirar = sc.nextInt();

            // numero aleatorio entre 1 y 3 
            int numeroaleatorio = ((int)Math.floor(Math.random() * 4)) + 1;
            //si tirar es igual a numeroaleatorio quiere decir que el equipo 2 paro el penalti 
            if ( tirar == numeroaleatorio){
                System.out.println("(Equipo 2)--Paro el penalti");  
                equipo1 = equipo1 + "X";
                
                }else { System.out.println("GOOOOOOOOO!"); 
                //suma un gol por vuelta 
                    golEquipo1++;  
                    equipo1 = equipo1 + "O"; 
                   
                }

            //en caso de que gol equipo 1 sea menor que golequipo 2 pues le restamos y si es mayor o igual a 5 pues le resto lanzamientoequipo 1
                lanzamientoequipo1++;
            if ( golEquipo1 > golEquipo2 ){
                     diferenciadegoles=  golEquipo1 - golEquipo2 >= 5 - lanzamientoequipo1;
            }else {
                diferenciadegoles=  golEquipo2 - golEquipo1 >= 5 - lanzamientoequipo1;
            }

            System.out.println("(Equipo 1) -> Te toca parar. ¿Donde quieres tirarte?");
            System.out.println("1 IZQ - 2 CEN - 3 DER ");
            int parar = sc.nextInt();
            int numeroaleatorio2 = ((int)Math.floor(Math.random() * 4)) + 1;
            //si parar (equipo 1) es igual a numero aleatorio 2 quiere decir que el equipo 1 paro el penaltie 
            if ( parar == numeroaleatorio2){
                System.out.println("(Equipo 1) -> Has parado el penalti");  
                 equipo2 = equipo2 + "X";

                }else { System.out.println("(Equipo 2)->Marco GOL");
                //suma un gol por vuelta 
                    golEquipo2++;  
                    equipo2 = equipo2 +"O";   
                    
                }
               lanzamientoequipo2++;
            if ( golEquipo1 > golEquipo2 ){
                     diferenciadegoles=  golEquipo1 - golEquipo2 <= 5 - lanzamientoequipo2;
             }else {
                diferenciadegoles=  golEquipo2 - golEquipo1 <= 5 - lanzamientoequipo2;
            }
            
                // si es la ultima vuelta y los dos equipos llevan los 
                //mismos goles pues resto uno al while para que vuelvan a tirar hasta que uno de estos dos fallen 
            if ( i == 4 && golEquipo1 == golEquipo2 ){
                i--;
            }           
             i++;
         System.out.println( " Resultado: (Equipo 1) :" + golEquipo1+ equipo1 +  " | (Equipo 2) : " + golEquipo2 + equipo2);
        }
        //si uno lleva mas goles que el otro equipo pues gano ese equipo.
       if ( golEquipo1 < golEquipo2){
        System.out.println("!!!Ganador Equipo 2!!!");

       }else if ( golEquipo1  > golEquipo2){
        System.out.println("!!!Ganador Equipo 1!!!");
       }
        sc.close();
    }
}

