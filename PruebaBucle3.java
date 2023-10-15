import java.util.Scanner;

public class PruebaBucle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "Rafa";
        String nombrem = nombre.toUpperCase();
        String entradaUsuario = "";
        String entradausuariom = "";
        
        //equals para comparar 
        while (!entradaUsuario.equalsIgnoreCase(nombre)) {
            System.out.println("Escribe tu nombre:");
            entradaUsuario = scanner.nextLine();
            entradausuariom = nombrem.toUpperCase(); 
        
        } 
        System.out.println("Grandeee que sabes que te llamas " + entradausuariom);

        scanner.close();


    } 
    
}
