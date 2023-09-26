import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Tarea_11 {
    public static void main (String [] args){

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Marca la nota del primer examen");
        Double notaprierexamen = sc.nextDouble();

       

        System.out.println("Que nota quieres sacar en el trimestre");
        Double notaquiero = sc.nextDouble();

        //2,8 - 8 = 5,2 / 0,60 = 8,66     2,8 (nota primera * 0,40) 8 es la nota que quiero y lo divido por 0,60 
        Double notadeseada = (notaquiero -( notaprierexamen * 0.40) ) / 0.60; 


        if ( notadeseada > 10 ){
            System.out.println("Que va a querer tu eso pichita necesitas ( " + notadeseada + " )  anda que vaya estudiante");

        }else {
        System.out.println("Para sacar un (" + notaquiero + ") tienes que sacar un (" + notadeseada + ")" );
     


        }


        sc.close();
    }
} 




