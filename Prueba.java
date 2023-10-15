import java.net.Socket;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Prueba {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

      
        System.out.println("Cual es tu numero");
        int numero = sc.nextInt(); 
      
           
          int i = numero; 

        while ( i>=0){
            System.out.println("Numero: " + i);
            i--;
        }
       

        sc.close();
    }
}

