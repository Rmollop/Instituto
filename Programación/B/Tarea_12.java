import java.util.Scanner;


public class Tarea_12 {
    public static void main (String [] args){

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Si esta lloviendo escribe 1 si nó está lloviendo escribe 0 ");
        int lluvia = sc.nextInt(); 

        System.out.println("¿Terminaste la tarea? 1 Para si 0 para no");
        int tarea = sc.nextInt();

        System.out.println("¿Vas a ir a la biblioteca? 1 para si 0 para no");
        int biblioteca = sc.nextInt();


        if ( lluvia == 1 && biblioteca == 0 ){
            System.out.println("No puedes salir a la calle ya que está lloviendo");

        } else if ( lluvia == 0 && biblioteca == 0 && tarea == 0 ){
            System.out.println("No puedes salir a la calle porque no terminaste tu tarea");

        } else if ( lluvia == 1 && tarea == 0 && biblioteca == 1){
            System.out.println("Si puedes ir a la biblioteca"); 

        } else if ( lluvia == 0 && tarea == 0 && biblioteca == 1){
            System.out.println("Puedes ir a la biblioteca");

        }else System.out.println("Puedes salir a la calle ");







        sc.close();
    }
} 
