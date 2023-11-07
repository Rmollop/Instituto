
    import java.util.Scanner;

public class Tarea_13 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
  
        System.out.println("¿Eres socio? 1 para si 0 para no" );
        int vip = sc.nextInt();

        System.out.println("¿Tienes las cuotas al dia? 1 para si 0 para no ");
        int cuotas = sc.nextInt();

        if ( vip == 1 && cuotas == 1){
            System.out.println("Eres vip");
        }else if ( vip == 1 && cuotas == 0){
            System.out.println("Pagas las cuotas perro");
        } else {
        System.out.println("¿Estas recomendado por alguien VIP? 1 para si 0 para no");
             int recomendado = sc.nextInt();

            System.out.println("¿Estas dentro del periodo de prueba? 1 para si 0 para no ");
             int prueba = sc.nextInt(); 
        
         if ( vip == 0 && recomendado == 1 &&  prueba == 1){
            System.out.println("Al estar recomendado por un usuario VIP y estar dentro del periodo de prueba puedes ser VIP");

        } else if ( vip == 0 && recomendado == 1 && prueba == 0){
            System.out.println("Aunque vengas recomendado por un usuario VIP no estas dentro del periodo de prueba");
        }
        else {  
            System.out.println("No eres VIP, para unirte a miembros VIP puedes pagar unas cuotas");
        } 
        sc.close();
        }
}
}


