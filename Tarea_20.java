import java.util.Scanner;

public class Tarea_20 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        System.out.println("Cuanto sacaste en el 1º Trimestre");
        int trimestre1 = sc.nextInt(); 

        System.out.println("Cuanto sacaste en el 2º Trimestre");
        int trimestre2 = sc.nextInt(); 


        System.out.println("Cuanto sacaste en el 3º Trimestre");
        int trimestre3 = sc.nextInt(); 

        System.out.println("¿ De cuanto es tu renta?");
        double renta = sc.nextDouble();

        int notamedia = (trimestre1 + trimestre2 + trimestre3) / 3; 

        if ( notamedia >= 8 && renta <= 20000 ){ 

            System.out.println("Tu nota media es igual a " + notamedia + " por lo que tienes derecho a beca");

        }else if ( notamedia >= 5 && renta < 4000 ){ 

             System.out.println("Tu nota media es igual a " + notamedia + " y tu renta es " + renta +" por lo que tienes derecho a beca");


        }else System.out.println("No tienes derecho a beca");
        sc.close();
    }
}

