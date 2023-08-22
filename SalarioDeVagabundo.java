import java.util.Scanner;

public class SalarioDeVagabundo {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 double su ;
	 System.out.println("informe aqui seu salário");
	 su = ler.nextDouble();
	 if (su < 1320) {                                                                    
		       System.out.println("teu salário é uma merda, está abaixo do salário mínimo");
	 } 
	 else {
		 System.out.println("teu salário tá bom, acima do salário mínimo");
	 }
	 
	 
 }
}
