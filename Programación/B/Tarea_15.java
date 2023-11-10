import java.util.Scanner;

public class Tarea_15    {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
        
        System.out.println("Cuantas Hormigas capturaste");
        int Hormigas = sc.nextInt(); 

        System.out.println("Cuantas Arañas capturaste");
        int Arañas = sc.nextInt();

        System.out.println("Cuantas Cochinitas capturaste");
        int Cochinitas = sc.nextInt();
        
        int HormigasPatas = Hormigas * 6;
        int ArañasPatas = Arañas * 8;
        int CochinitasPatas = Cochinitas * 14; 


        int totalpatas = HormigasPatas + ArañasPatas + CochinitasPatas; 
        int totalanimaes = Hormigas + Arañas + Cochinitas; 

        System.out.println("Hemos capturado en total " + totalanimaes +" y tienen un total de " + totalpatas +"  patas");

        sc.close();
    }
}
