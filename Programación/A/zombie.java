package Programación.A;
import java.util.Scanner;

public class zombie {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        int numerozombies = ((int)Math.floor(Math.random() * 6)) + 5;
        System.out.println("Rick contra "+numerozombies+" zombies");
        System.out.println("Rick tiene 4 vidas");

        int porcentajecansancio = 90;
        int vidas=4;
        int contadornumero = 1;

        while ( vidas > 0 && numerozombies >= 1){
            if ( numerozombies<1){
                numerozombies=0;
               
            }
            System.out.println("Combate Nº"+contadornumero);
            final int porcentajedaño = ((int)Math.floor(Math.random() * 100)) + 10;
            if ( porcentajedaño <= porcentajecansancio  ){
                System.out.println("Rick acuchilla a un zombie");
                if ( numerozombies>1){
                    numerozombies--;
                System.out.println("Quedan: "+ numerozombies+ " zombies restantes");
                }else {
                    System.out.println("Todos los zombies muertos");
                    vidas=0;
                }
                
                
                
            }else {
                System.out.println("---Rick fue mordido por un zombie---");
                porcentajecansancio=porcentajecansancio-5;
                if (vidas<=0){
                    System.out.println("---Rick murio---");
                    vidas=0;
                    

                }else{
                    vidas=vidas-1;
                    System.out.println("Rick tiene "+vidas+ " vidas");
                    if (vidas==0){
                        System.out.println("Rick murio");
                    }
                }
            }

            
            contadornumero++;
        } 
      
        sc.close();
    }
}
