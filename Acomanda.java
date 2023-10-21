import java.util.Scanner;

public class Acomanda {
      public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);

        

        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;
        
        
        boolean i= true;
        double total = 0;
        String concatenarPrimerplato = " ";
        String concatenarSegundoplato= ""; 
        String concatenarpostreplato= "";


     
       
        
        System.out.println(" *** RESTAURANTE IES VEGA DE MIJAS ****");
        System.out.println(" ----------------------------------");
        System.out.println("Primeros platos");
        System.out.println(" 1. Salmorejo (5€)");
        System.out.println(" 2. Sopa picadillo (4€)");
        System.out.println(" 3. Ensalada de atún (4.5€)");
        System.out.println("Segundos platos");
        System.out.println(" 4. Paella (6€)");
        System.out.println(" 5. Salmón (8€)");
        System.out.println(" 6. Codillo al horno (9€)");
        System.out.println(" 7. Lentejas (5€)");
        System.out.println("Postres");
        System.out.println(" 8. Fruta (1.5€)");
        System.out.println(" 9. Café (1.25€)");
        System.out.println("10. Helado (2€)");
        System.out.println();
        System.out.println();
        System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
        System.out.println("Selecciona la opción deseada por el cliente...");

        while( i ){
          System.out.println("¿Que plato quieres?");
          int platoquiero = sc.nextInt();
          System.out.println("¿Cuantos quieres?");
          int quieroplatocantidad = sc.nextInt();
          

          if ( platoquiero == 0 || quieroplatocantidad == 0){
               i= false;
          }else{ 

              if ( platoquiero > 10 || quieroplatocantidad >10){
                    System.out.println("Valores incorrectos.Introduzca valores entre 1 y 10, por favor vuelva a pedir.");
              }else{
               if ( platoquiero == 1 ){
                    //cantidad que quiero * el valor del plato 
                    double primerosuma = PLATO1 * quieroplatocantidad; 
                   
                    //para hcer la suma total vamos sumando a variable total
                    total = total + primerosuma; 

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }

                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarPrimerplato = concatenarPrimerplato + " Salmorejo " + " X " + quieroplatocantidad + "\n";
                    
               }else if ( platoquiero == 2){
                    //cantidad que quiero * el valor del plato 
                    double primerosuma = PLATO2 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + primerosuma; 


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarPrimerplato = concatenarPrimerplato + " Sopa " + " X " + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
               }
             else if ( platoquiero == 3){
                    //cantidad que quiero * el valor del plato 
                    double primerosuma = PLATO3 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + primerosuma;    

                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                   concatenarPrimerplato = concatenarPrimerplato + " Atun " + " X " + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
                            
               }
                else if ( platoquiero == 4){
                    //cantidad que quiero * el valor del plato 
                    Double segundosuma = PLATO4 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + segundosuma;


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarSegundoplato = concatenarSegundoplato + " Paella " + " X " + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }

                   
               }else if ( platoquiero == 5){
                    //cantidad que quiero * el valor del plato 
                    Double segundosuma = PLATO5 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + segundosuma; 


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarSegundoplato = concatenarSegundoplato + " Salmon " + " X " + quieroplatocantidad + "\n";

                      //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
                
               }
               else if ( platoquiero == 6){
                    //cantidad que quiero * el valor del plato 
                    Double segundosuma = PLATO6 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + segundosuma;


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarSegundoplato = concatenarSegundoplato + " Codillo " + "X" + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
                
               }
              else  if ( platoquiero == 7){
                    //cantidad que quiero * el valor del plato 
                    Double segundosuma = PLATO7 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + segundosuma;


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima  
                   concatenarSegundoplato = concatenarSegundoplato + " Lentejas " + "X" + quieroplatocantidad + "\n";

                     //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
               }

               else if ( platoquiero == 8){
                    //cantidad que quiero * el valor del plato 
                    Double postresuma = PLATO8 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + postresuma; 


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarpostreplato = concatenarpostreplato + " fruta " + "X" + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }
                  
               }
               else  if ( platoquiero == 9){
                    //cantidad que quiero * el valor del plato 
                    Double postresuma = PLATO9 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + postresuma; 


                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarpostreplato = concatenarpostreplato + " Café " + " X " + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");
                         total=total-quieroplatocantidad;

                    }
               }
                else if ( platoquiero == 10){
                    //cantidad que quiero * el valor del plato 
                    Double postresuma = PLATO10 * quieroplatocantidad; 

                    //para hcer la suma total vamos sumando a variable total
                    total = total + postresuma; 

                    //concatenar el salmorejo por cada vuelta para ir sumando si sigo pidiendo este plato. \n para que este abajo la proxima 
                    concatenarpostreplato = concatenarpostreplato + " helado " + "X" + quieroplatocantidad + "\n";

                    //si mi pedido es mayor de 2 pues me descuenta la cantidad que seria 1 euro por plato
                    if (quieroplatocantidad > 2){ 
                         total=total-quieroplatocantidad;
                         System.out.println("Como pedistes mas de dos platos te vamos a hacer un descuento de 1 euro por plato ");

                    }  
                 }  
               }
           }

          
          }
          //si es menor de 30 y mayor de 20 pues hacemos descuento 
          if (total< 30 && total>20 ){
               
               System.out.println("-Al comprar: "+total+" te hemos hecho un descuento de 2 euros.");
               total=total-2;

          //si es mauor de 30 y menor de 50 pues hacemos descuento 
          } else if (total >30 && total <50){
               System.out.println("Al comprar: "+total+" te hemos hecho un descuento de 3 euros.");
               total = total-3; 

          //si es mayor de 50 hacemos descuento 
          } else if ( total > 50 ){
                System.out.println("Al comprar: "+total+" te hemos hecho un descuento de 5 euros.");
                total = total -5; 
          }

          System.out.println("______________Comanda_______________");
          System.out.println("Primeros Platos");
          System.out.println(concatenarPrimerplato);
          System.out.println("Segundos Platos");
          System.out.println(concatenarSegundoplato);
          System.out.println("Postres");
          System.out.println(concatenarpostreplato);
          System.out.println("____________________________________");
          System.out.println("TOTAL A PAGAR  : "+ total + " Euros");
          sc.close();
     }
     
} 
       

          
            
        

        