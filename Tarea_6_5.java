
import java.util.Scanner;

public class Tarea_6_5 {

    
    public static void main(String[] args ){
        
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       
       System.out.println("Escribe cuantos kilos de manzanas se han vendido"); //Al estar antes que el "int" sale primero 
       float manzanas = sc.nextFloat(); //La variable "sc" le dije que escanee el teclado)



       System.out.println("Escribe cuantos kilos se peras se han vendido"); 
       float peras = sc.nextFloat();

       //creamos la variable "kilosmananas" y "kilosperas" que son el precio por cada kilo de manzanas y peras.
       float kilomanzana = ( 2.35f ); 
       float kilopera = ( 1.95f ); 

       //usamos la variable "multiplicacionManzanas" y "multiplicacionPeras" para multiplicar por el valor de los kilos  que entran desde las variables "manzanas" y "peras". 
       float multiplicacionManzanas = manzanas * kilomanzana ; 
       float multiplicacionPeras = peras *  kilopera; 
       float ingresos = multiplicacionManzanas + multiplicacionPeras; 
       System.out.println("Ingresos:  " + ingresos);
       
       //creamos la variable fruta para sumar todos los kilos de frutas y así clacular el consumo en luz 
       float fruta = (manzanas + peras) * 0.60f;
       System.out.println("Factura de la luz: "  + fruta);

       //Beneficio

       
       float Beneficio = ingresos - fruta; 
       System.out.println("Beneficio " + Beneficio);


       sc.close();

    }
    
}

