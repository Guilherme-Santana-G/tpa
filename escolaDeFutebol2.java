package listatpa;
import java.util.Scanner;
public class escolaDeFutebol2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Entre com a idade do Aluno.");
        a = in.nextInt();
        switch (a){
            case 6:
                   System.out.println("Dente de leite");
                   break;
            case 7:
                   System.out.println("J�nior");
                   break;
            case 8:
                   System.out.println("J�nior max");
                   break;
            case 9:
                   System.out.println("J�nior master");
                   break;
            case 10:
                  System.out.println("Master");
                   break;
            default:
                   System.out.println("Idade inv�lida");
        }in.close();
        
        
    }
    
}


