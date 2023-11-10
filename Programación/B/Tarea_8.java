


import java.util.Scanner;


public class Tarea_8 {

    
    

    public static void main(String[] args ){
       Scanner sc; 
      
       sc = new Scanner(System.in);


       System.out.println("¿Tienes dinero? Responde 1 para decir SI o 0 para decir NO "); 
       int dinero = sc.nextInt(); 
       

       System.out.println("¿Tienes reserva?  Responde 1 para decir SI o 0 para decir NO" ); 
       int reserva = sc.nextInt(); 

       System.out.println("¿Tienes pasaporte? Responde 1 para decir SI o 0 para decir NO"); 
       int pasaporte = sc.nextInt(); 
      


       if (dinero == 1 || (reserva == 1 && pasaporte == 1 ) ) {
           System.out.println("Nos vamos");
           
           
          System.out.println("¿Donde quiere ir el hijo mayor?   Responde 1 para decir (montaña) o 0 para decir (Playa)"); 
           int mayor = sc.nextInt(); 

          System.out.println("¿Donde quiere ir el hijo mediano ? Responde 1 para decir (montaña) o 0 para decir (Playa)"); 
          int mediano = sc.nextInt(); 


          System.out.println("¿Donde quiere ir el hijo menor? Responde 1 para decir (montaña) o 0 para decir (Playa)"); 
          int menor = sc.nextInt(); 



          if (mayor == 0 && mediano == 0 && menor == 0 )   {
               System.out.println("Nos vamos a la montaña");
          }else {
               System.out.println("Vamos a la playa");
          }


       }else if (reserva == 1 && pasaporte == 1 ){
          System.out.println("Nos vamos");
       }

       else {
          System.out.println("No nos vamos de vacaciones");
       }

       System.out.println("Adios ");

     sc.close();
}

}
