
    
    import java.util.Scanner;

public class Tarea_14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los valores de a, b y c
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Pedir al usuario que ingrese el valor de x
        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        // Calcular el valor de y usando la función cuadrática
        double y = a *( x*x ) + (b *x) +c; 

        // Mostrar el resultado
        System.out.println("El valor de y para x = " + x + " es: " + y);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


