
import java.util.Scanner;

public class Tarea_6_5 {

    
    public static void main(String[] args ){
        
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       
       System.out.println("Escribe cuantos kilos de manzanas se han vendido"); //Al estar antes que el "int" sale primero 
       float manzanas = sc.nextFloat(); //La variable "sc" le dije que escanee el teclado)



       System.out.println("Escribe cuantos kilos se peras se han vendido"); 
       float peras = sc.nextFloat();

       //ingresos
       double a = ( 2.35 ); 
       double b = ( 1.95 ); 
       double multiplicacionManzanas = manzanas * a ; 
       double multiplicacionPeras = peras *  b; 
       double ingresos = multiplicacionManzanas + multiplicacionPeras; 
       System.out.println("Ingresos:  " + ingresos);
       
       //Factura de la luz 
       double fruta = (manzanas + peras) * 0.60;
       System.out.println("Factura de la luz: "  + fruta);

       //Beneficio

       
       double Beneficio = ingresos - fruta; 
       System.out.println("Beneficio " + Beneficio);


       sc.close();

    }
    
}

