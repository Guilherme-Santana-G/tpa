import java.util.Scanner;

public class SalarioDeVagabundo {
 public static void main (String [] args) {
	 Scanner ler = new Scanner (System.in);
	 double su ;
	 System.out.println("informe aqui seu sal�rio");
	 su = ler.nextDouble();
	 if (su < 1320) {                                                                    
		       System.out.println("teu sal�rio � uma merda, est� abaixo do sal�rio m�nimo");
	 } 
	 else {
		 System.out.println("teu sal�rio t� bom, acima do sal�rio m�nimo");
	 }
	 
	 
 }
}
