import java.util.Scanner;

public class Texto_6 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        String texto =  "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite"; 

        System.out.println("Quien esta en la casa de Juan ");
        String nombre = sc.nextLine(); 

        boolean esta = texto.contains(nombre); 

        if (esta){

            System.out.println("Si está");

        }

        sc.close();
    }
}
