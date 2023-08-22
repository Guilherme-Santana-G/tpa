package listatpa;
import java.util.Scanner;
public class Cantina2 {
    
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.println("Entre com o código:");
        c = in.nextInt();
     switch(c){
         case 1:
              System.out.println("Cachorro Quente, 8 reais.");
              break;
         case 2:
              System.out.println("Chessburger, 12 reais.");
              break;
         case 3:
              System.out.println("X-Salada, 15 reais.");
              break;
         case 4:
              System.out.println("Misto Quente, 11 reias.");
              break;
         case 5:
              System.out.println("Pão na chapa, 6 reais.");
              break;
         default:
         System.out.println("Código inválido.");
         
     }in.close(); 
        
    }
    
}


