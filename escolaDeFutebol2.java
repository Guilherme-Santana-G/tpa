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
                   System.out.println("Júnior");
                   break;
            case 8:
                   System.out.println("Júnior max");
                   break;
            case 9:
                   System.out.println("Júnior master");
                   break;
            case 10:
                  System.out.println("Master");
                   break;
            default:
                   System.out.println("Idade inválida");
        }in.close();
        
        
    }
    
}


