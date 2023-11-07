import java.util.Scanner;



public class Tarea_14Copia {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        System.out.println("Dime el valor de (a)");
        Double a = sc.nextDouble();

        System.out.println("Dime el valor de (b)");
        Double b = sc.nextDouble();

        System.out.println("Dime el valor de (c)");
        Double c = sc.nextDouble();
        
       
        Double partearribaA =  ((b*b) -4 * a * c);
        Double partearribaB = // no se como leches se hace raiz cuadrada 
         


        if ( partearribaB < 0 ){
           
            Double positivo = -b + partearribaB; 
            Double x = positivo / (2*a);

            Double y = a * (x * x) + (b * x) +c ; 
            
            

            System.out.println("El valor de y es igual a " + y);

        } else if ( partearribaB > 0 ){
           
            Double negativo = -b - partearribaB; 
            Double xx = negativo / (2*a);

            Double yy = a * (xx * xx) + (b * xx) +c ;
            System.out.println("El valor de y es igual a " + yy); 
        } else { System.out.println("No hay resultado posible");

        }
        
        sc.close();
    }
}