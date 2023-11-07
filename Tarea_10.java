
    import java.util.Scanner;

public class Tarea_10 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        System.out.println("¿Trabajas de noche?: Escribe 0 para horario diurno y 1 para horario nocturno");
        int horario = sc.nextInt();
        
        if (  horario == 1){

            System.out.println("¿Cuantas horas trabajas al dia?");
            double horasdia = sc.nextDouble();
            double cobrohorasnocturno = horasdia * 25;
            System.out.println("Te pertenecen " + cobrohorasnocturno+" Euros");
        
        } else 
        
        System.out.println("¿Cuantas horas trabajas al dia?");
        double horasdia = sc.nextDouble();
        double cobrohorasdiurno = horasdia * 12; 
        System.out.println("Te pertenecen " + cobrohorasdiurno+" Euros");
        

        sc.close();
    }
}


