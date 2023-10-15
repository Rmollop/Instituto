import java.util.Scanner;


public class PruebaBucle2 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       
     
        String texto = "Hola uqe haceaa "; 
        char texto2 ='a'; 


        int contadorA= 0; 
        int posicion = 0; 
        while (posicion< texto.length()){
           if ( texto.charAt(posicion) == texto2){
                contadorA = contadorA +1 ; 
                //contadorA++; 
                System.out.println("Encontrada");
           }
           posicion = posicion +1; 
           //posicion++; 
        }
        System.out.println("Se han encontrado: " + contadorA );

        sc.close();
    }
}

//Lee de teclado un texto y devuelve por pantalla la cantidad de caracteres tiene dicho texto.