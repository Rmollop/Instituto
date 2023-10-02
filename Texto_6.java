import java.util.Scanner;

public class Texto_6 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        System.out.println("En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite");
    
        System.out.println("¿Quien estaba en la casa de juan? Escribe un nombre ");
        String a = sc.nextLine();
        String A = a.toUpperCase();

        System.out.println("¿Quien estaba en la casa de juan? Escribe un nombre  ");
        String b = sc.nextLine();
        String B = a.toUpperCase();

       
        System.out.println("¿Quien estaba en la casa de juan? Escribe un nombre ");
        String c = sc.nextLine();
        String C = a.toUpperCase();




       if ( a.equals("pedro") || A.equals("PEDRO")) {
        
        System.out.println("Pedro estaba ");
       } else System.out.println( a +" No estaba");

       

        if ( b.equals("luis") || B.equals("LUIS")) {
        
        System.out.println("Luis estaba ");
       } else System.out.println(  b + " No estaba");



        if ( c.equals("mario") || C.equals("MARIO")) {
        
        System.out.println("Mario estaba ");
       } else System.out.println( c + " No estaba");




       sc.close();

    }    
    
}
        
  
        

       
    

