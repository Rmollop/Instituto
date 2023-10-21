import java.util.Scanner;

public class Aprobabilidad {
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


        //para poner el % de acierto que quiero 
        final int porcentaje = 80; 
       boolean diferenciadegoles = true; 

      // va al lado i<5 
        while (i<max || diferenciadegoles ){

            System.out.println("(Equipo 1) -> Te toca tirar. ¿Donde quieres pegarle?");
            System.out.println("1 IZQ - 2 CEN - 3 DER ");
            int tirar = sc.nextInt();

            //elegir un numero del 1 al 100
            int numeroaleatorio = ((int)Math.floor(Math.random() * 100)) + 20;

            // numero aleatorio entre 1 y 3 
            int numeroaleatoriotiro = ((int)Math.floor(Math.random() * 4)) + 1;


           

            //si el numeroaleatorio es mayor a 80 pues fallaste 
            if ( numeroaleatorio > porcentaje ){
                System.out.println("(Equipo 1) -Fallaste");
                
              
                equipo1 = equipo1 + "X" ;


            //si tirar es igual a numeroaleatorio quiere decir que el equipo 2 paro el penalti   
            }else if (tirar == numeroaleatoriotiro){
                    System.out.println("Paro el penaltie");

                   
                     equipo1 = equipo1 + "X" ;
                     
            }else { System.out.println("GOOOOOOOOO!"); 
                //suma un gol por vuelta 
                    golEquipo1++;  

                    
                
                    equipo1 = equipo1 + "O" ; 
                   
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
            
            int numeroaleatorio2 = ((int)Math.floor(Math.random() * 100)) + 20;
            int numeroaleatorio2parar = ((int)Math.floor(Math.random() * 4)) + 1;



           //si numero es mayor de 80 pues el equipo 2 fallo 
            if ( numeroaleatorio2 > porcentaje){
                System.out.println("(Equipo 2)- Fallo el penaltie");  
            
                 equipo2 = equipo2 + "X";

            //si parar (equipo 1) es igual a numero aleatorio 2 quiere decir que el equipo 1 paro el penaltie 
            }else if  ( parar == numeroaleatorio2parar){;
                //suma un gol por vuelta 
                System.out.println("Equipo 1 paro penaltie");
                    golEquipo2++;  
                    
                    equipo2 = equipo2 +"O";   
                    
            }else {
                System.out.println("Paro el penaltie");
               
                equipo2 = equipo2 + "X";
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
         System.out.println( " Resultado: (Equipo 1) :" + golEquipo1+ equipo1 + " | (Equipo 2) : " + golEquipo2 + equipo2);
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

