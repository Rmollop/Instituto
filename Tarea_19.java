import java.util.Scanner;

public class Tarea_19 {
    public static void main (String [] args){

        Scanner sc; 
      
        sc = new Scanner(System.in);
    
       char una = sc.next().charAt(0);
       char dos = sc.next().charAt(0);
       char tres    = sc.next().charAt(0);
       char cuatro = sc.next().charAt(0);
       char cinco   = sc.next().charAt(0);
       String cadenatexto; 
       StringBuilder sb=new StringBuilder();
       sb.append(una); 
       sb.append(dos);
       sb.append(tres);
       sb.append(cuatro);
       sb.append(cinco);

       cadenatexto = sb.toString(); 

       
       System.out.println("Es:  " + cadenatexto);
        
    
        
        
        

        sc.close();
    }
}