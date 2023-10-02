import java.util.Scanner;

public class Texto_5prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        
        System.out.print("Ingresa la palabra que deseas contar: ");
        String palabraContar = scanner.next();

        // Dividir el texto en palabras usando el espacio en blanco como separador
        String[] palabras = texto.split(" ");

        // Inicializar un contador para la palabra específica
        int contador = 0;

        // Recorrer cada palabra en el texto y comparar con la palabra a contar
        for (String palabra : palabras) {
            // Utilizamos equalsIgnoreCase para que no sea sensible a mayúsculas/minúsculas
            if (palabra.equalsIgnoreCase(palabraContar)) {
                contador++;
            }
        }

        
        System.out.println("La palabra '" + palabraContar + "' aparece " + contador + " veces en el texto.");


        scanner.close();
    }
}
