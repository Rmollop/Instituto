import java.util.Scanner;

public class zombiedosprueba {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
    
        int vidas = 4;
        int Zombies = ((int) Math.floor(Math.random() * 6)) + 5;
        int contadorRondas = 1;
        int probabilidadInicial = 90;
        int Cansancio = 5;
        int datosRick = 0;
        int datosZombie = 0;
        int combates = 1;
        int bala = 1;
        int mordisco = 0;
        boolean entrada = false;

        System.out.println("Rick peleará contra " + Zombies + " zombies");

        while (vidas > 0 && combates <= Zombies){

            int porcentaje = ((int) Math.floor(Math.random() * 99)) + 10;

            System.out.println("COMBATE Nº " + combates);
                    
            System.out.println("Ronda Nº " + contadorRondas);


            if (probabilidadInicial > porcentaje){
                datosRick++;
                System.out.println("Rick acuchilla al zombie");
                System.out.println("Rick tiene " + vidas + " vidas");
                System.out.println("Rick tiene " + datosRick + " puntos");
                System.out.println("Zombie tiene " + datosZombie + " puntos");
                System.out.println("Presiona Enter para continuar...");
                scan.nextLine();
                probabilidadInicial = probabilidadInicial - Cansancio;
                contadorRondas ++;

            }

            else{
                datosZombie++;
                mordisco++;
                System.out.println("El zombie muerde a Rick");
                System.out.println("Rick tiene " + vidas + " vidas");
                System.out.println("Rick tiene " + datosRick + " puntos");
                System.out.println("Zombie tiene " + datosZombie + " puntos");
                System.out.println("Presiona Enter para continuar...");
                scan.nextLine();
                contadorRondas ++;
            }

            if ( datosZombie == 2 && bala == 1 && datosRick !=3) {
                System.out.println("Rick puede morir");
                System.out.println("¿Quieres usar la Magnum y disparar? (0) SI (1) NO");
                int respuesta = scan.nextInt();

                if (respuesta == 0) {
                    System.out.println("Has decido usar la bala, acabas de matar a un zombie.");
                    bala -=1;
                    datosRick++;
                } else {
                    System.out.println("No pasa nada, no se usa la bala");
                }
            }

            if (datosRick == 3 || datosZombie == 3) {
                entrada = true;
            }

            if (mordisco == 5) {
                System.out.println("Te han mordido 5 veces, te estás desangrando ");
                scan.nextLine();
                mordisco = 0;
                vidas --;
            }

            while (entrada) {

                if (datosRick ==3) {
                    System.out.println("El ganador es Rick con " + datosRick + " puntos" );
                    datosRick = 0;
                    datosZombie= 0;
                    contadorRondas = 1;
                    combates ++;
                    entrada = false;

                } else if (datosZombie == 3) {
                    System.out.println("El ganador es Zombie con " + datosZombie + " puntos" );
                    vidas --;
                    datosZombie= 0;
                    datosRick = 0;
                    contadorRondas = 1;
                    entrada = false;
                } 
            entrada = false;

        }

            
        }

       
        if (vidas == 0) {
            System.out.println("Rick ha sido mortalmente mordido");
        }
        else{
            System.out.println("Rick ha acuchillado a todos los zombies");
        }

        scan.close();
    } 
}


