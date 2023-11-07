import java.util.Scanner;

public class Anumerosecretodospersonas {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

       boolean i = false;
       boolean uno = true; 
       boolean dos = true;
       int intentospartida1= 1; 
       int intentospartida2= 1; 
        
       
       while(i==false){
        int numeroaleatoriouno = ((int)Math.floor(Math.random() * 100)) + 1;
        int numeroaleatoriodos = ((int)Math.floor(Math.random() * 100)) + 1;
         
      

        //numero de intentos 10 
        System.out.println("Jugador 1, ¿Como te llamas?");
        String nombreuno = sc.nextLine();
        
        System.out.println("Jugador 2, ¿Cual es tu nombre?");
        String nombredos = sc.nextLine();
        System.out.println("Solo teneis 10 intentos cada uno.");
        System.out.println("Escribe un numero entre el 1 y 100, el programa te dira si es mayor o menor.");
         System.out.println("Recuerda que puedes salir en cualquier momento pulsando 0.");
         
            while( uno ){

                System.out.println("Jugador 1, " + nombreuno);
                int numero = sc.nextInt();
                

                if ( numero == 0){
                    uno=false;

                }else{ 
                
                    if( intentospartida1 > 10){
                        System.out.println("Demasiados intentos, el numero era:" + numeroaleatoriouno);
                        uno=false;
                    }else{

                        if( numero == numeroaleatoriouno){
                            System.out.println("Ole tu polla gorda " + nombreuno + ", el numero es: " +  numeroaleatoriouno);
                            System.out.println("Numero de intentos realizados: " + intentospartida1);
                            uno=false;

                        }else if ( numeroaleatoriouno > numero){
                            System.out.println("Mayor");
                            intentospartida1 = intentospartida1 +1;
                        }else {
                            System.out.println("Menor");
                            intentospartida1 = intentospartida1 +1;
                        }

                    } 


                }

        }

        
            while( dos){

                System.out.println("Jugador 2, " + nombredos);
                int numerodos = sc.nextInt();

                if( numerodos == 0){
                    dos=false;

                }else{
                    if ( intentospartida2 > 10){
                        System.out.println("Demasiados intentos, el numero era:" + numeroaleatoriodos);
                        dos=false;
                    }else{

                        if ( numerodos == numeroaleatoriodos){
                            System.out.println("Ole tu polla gorda "+ nombredos+", el numero es: " + numeroaleatoriodos);
                            System.out.println("Numero de intentos realizados: " + intentospartida2);
                            dos=false;
                        

                        } else if ( numeroaleatoriodos > numerodos){
                            System.out.println("Mayor");
                            intentospartida2 = intentospartida2 +1;
                        } else {
                            System.out.println("Menor");
                            intentospartida2 = intentospartida2 +1;
                        }


                    }

            }

    }
    System.out.println("____________________________________________");
    System.out.println(" ");
    System.out.println("          RESULTADOS          ");
    if ( intentospartida1 < 10 && intentospartida2 <10){
            System.out.println(nombreuno + " lo hizo en: " + intentospartida1 + " intentos.");
            System.out.println(nombredos + " lo hizo en: " + intentospartida2 + " intentos.");
            if ( intentospartida1 > intentospartida2){
                System.out.println(nombredos + " Ganó");

            }else if ( intentospartida1 == intentospartida2){
                System.out.println("Empate tecnico.");
            }else {
                System.out.println(nombreuno + " Ganó");
            }
        }else if ( intentospartida1 < 10 && intentospartida2 > 10) {
            System.out.println("El jugador 1 (" + nombreuno + ") lo hizo en " + intentospartida1 + "intetos por lo que gano.");
            System.out.println("El Jugador 2 (" + nombredos + ") realizó " + intentospartida2 + "intentos por lo que es mayor del limite de intentos permitidos y por ende perdio." );

        }else if ( intentospartida1 > 10 && intentospartida2 < 10){
            System.out.println("El jugador 2 (" + nombredos + ") lo hizo en " + intentospartida2 + "intentos por lo que gano. ");
            System.out.println("El Jugador 1 (" + nombreuno + ") realizó " + intentospartida1 + "intetos por lo que es mayor del limite de intentos permitidos y por ende perdio." );
        }else {
            System.out.println("Jugador 1 (" + nombreuno + ") realizó " + intentospartida1 +" intentos"  );
            System.out.println("Jugador 2 (" + nombredos + ") realizó " + intentospartida2 +" intentos"  );
            System.out.println("Los dos lo hicieron en más de 10 intentos por lo que ambos perdieron.");


        }
    System.out.println("____________________________________________");

     i=true;
    sc.close();
}
}
}
