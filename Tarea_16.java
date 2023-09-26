 import java.util.Scanner;


public class Tarea_16 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       System.out.println("¿Cuantos niños son?");
       int niños = sc.nextInt();

       System.out.println("¿Cuantos adultos son?");
       int adultos = sc.nextInt();

       Double niñospago = niños * 15.50; 
       int adultospago = adultos * 20; 

       double total = niñospago + adultospago; 

       

       if (  total <= 100){
            double descuento = total *0.05; 
            double totalcondescuento = total - descuento; 
            System.out.println( "Compraste " + niños + " entradas para niños y " + adultos + " para adultos ,por lo que tienes que pagar  " + totalcondescuento + " Euros");

       } else {
            System.out.println( "Compraste " + niños + " entradas para niños y " + adultos + " para adultos,por lo que tienes que pagar  " + total + " Euros");
       }

        
        
        
        
        

        sc.close();
    }
}

