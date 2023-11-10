import java.util.Scanner;

public class Texto_5MAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        
        System.out.print("Ingresa la palabra que deseas contar: ");
        String palabraContar = scanner.next();

        String[] palabras = texto.split(" ");
        int contador = 0;

        
        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(palabraContar)) {
                contador++;
            }
        }

        
        System.out.println("La palabra '" + palabraContar + "' aparece " + contador + " veces en el texto.");


        scanner.close();
    }
}
