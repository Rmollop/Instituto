import java.util.Scanner;
public class reloj {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe numero");
        int numero = sc.nextInt();
        int resultado = (numero/2) + 1;
        if(numero % 2 != 0 && numero >=3){


            for (int n = 1; n<= resultado; n++){

                for(int i = n ; i>=1; i--){

                    System.out.print("o");

                }
                for (int j = n; j+1<=resultado; j++){

                    System.out.print("*");

                }
                System.out.print("*");
                for (int j = n; j+1<=resultado; j++){

                    System.out.print("*");

                }
                System.out.println();
            }
            for (int n = resultado -1; n>=1; n--){

                for(int i = n; i>=1; i--){

                    System.out.print("o");

                }
                for (int j = n; j+1<=resultado; j++){

                    System.out.print("*");

                }
                for (int j = n; j+1<=resultado; j++){

                    System.out.print("*");

                }
                
                System.out.print("*");
                System.out.println();
                
                
            }
            
        }
        else {
            System.out.println("Numero incorrecto");
        }

        sc.close();

    }
    
}
