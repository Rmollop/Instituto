import java.util.Scanner;

public class practicaexamen {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        String usuario = "usuario";
        int contraseña = 1234;


        System.out.println("Para entrar necesitas un usuario y una contraseña");
        

        int max = 1;
        do {
        max++;
        System.out.println("Cual es tu nombre de usuario:");
        String respuesta = sc.nextLine();

        if (respuesta.equals(usuario)) {
                System.out.println("Usuario correcto");
                System.out.println("Dime la contraseña:");
                int contraseñacontestacion = sc.nextInt();
                if (contraseña == contraseñacontestacion) {
                    System.out.println("Contraseña correcta,bienbenido Rafa");
                    max=4;

                    
                } else {
                    System.out.println("Contraseña incorrecta por favor vuelva a intentarlo");

                    int maxdos = 0;
                    int intetos = 3;
                    do {
                        maxdos++;

                        System.out.println("Cual es tu contraseña: ");
                        int contraseñados = sc.nextInt();

                        if ( contraseñados == contraseña){
                            System.out.println("Contraseña correcta");
                            maxdos=4;
                            max=4;
                            

                        } else{
                            System.out.println("Contraseña incorrecta te quedan " + intetos + " intentos");
                            intetos--;
                        }
                        
                    } while ( maxdos <=3);
                    
                    
                }
            
        } else {
            System.out.println("Usuario incorrecto");
            
        }



        } while (max<=3);
        
        
        
        
        

        sc.close();
    }
}
