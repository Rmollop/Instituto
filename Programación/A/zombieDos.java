package Programación.A;
import java.util.Scanner;

public class zombieDos {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
       int salir2 = 0;
       int humanos = 0;
        int zombie = 0;
        int vecermordido = 0;

       
        do {
        salir2++; 
           
     
        int numeroZombies = ((int)Math.floor(Math.random() * 6)) + 5;
        int vidas = 3;
        int probabilidad = ((int)Math.floor(Math.random() * 100)) + 10;
        int probabilidadPorcentaje= 90;
        boolean salir = true; 
        int numeroCombate = 1;
        int bala = 1;

         if (vecermordido == 5){
            System.out.println("Rick fue mordido 5 veces y se quito 1 vida por desangramiento");
            vidas--;
            vecermordido=0;

        }
        
        while (salir) {
            if ( vidas == 1 && bala == 1 && humanos !=3) {
            System.out.println("Rick puede morir porque solo tiene 1 vida");
            System.out.println("¿Quieres disparar? 0 para si 1 para no");
            int interaccion = sc.nextInt();

            if (interaccion == 0) {
                System.out.println("Rick murio.");
                bala--;
                humanos++;
            } else {
                System.out.println("Rick se salvo");
            }
        }

       
            System.out.println("Rick tiene que luchar contra: " + numeroZombies);
            System.out.println("Rick tiene: " + vidas + " vidas.");
            System.out.println("Combate número: "+numeroCombate );
            sc.nextLine();
            if (probabilidad >= probabilidadPorcentaje){
                System.out.println("Rick fue mordido por un zombie");
                vecermordido++;
                vidas--;
                
            }else {
                System.out.println("Rick mató un zombie");
                numeroZombies--;

                
            }
           
            if ( vidas <= 0){
                System.out.println("Rick murio a manos de los zombies en la ronda Nº: " +numeroCombate);
                zombie++;
                System.out.println("Humano tiene una puntuación de: "+ humanos);
                System.out.println("Zombie tiene una puntuación de: "+ zombie);
                
                salir=false;
                
            }else if ( numeroZombies<=0){
                System.out.println("Rick mato a todos los zombies en la ronda numero: " + numeroCombate);
                humanos++;
                System.out.println("Humano tiene una puntuación de: "+ humanos);
                System.out.println("Zombie tiene una puntuación de: "+ zombie );
                
                salir=false;
            }
            
                
            
            
            numeroCombate++;
            probabilidadPorcentaje=probabilidadPorcentaje-5;
        }
        System.out.println("Puntuación: Humanos->"+humanos+ " Zombies->"+zombie);
       

       if ( humanos<3 && zombie >=3){

            System.out.println("Ganador ZOMBIES");
            salir2=4;
       }else if ( humanos>=3 && zombie <3){
            System.out.println("Ganador HUMANOS");
            salir2=4;
        }



      
    } while (salir2 <=3);
      sc.close();
    } 
    
        
    }
