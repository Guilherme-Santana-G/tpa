import java.util.Scanner;

public class salário {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double su, sm;
		System.out.println("Informe o seu salário aqui");
		su = ler.nextDouble();
		System.out.println("Informe o salário mínimo atual");
		sm = ler.nextDouble();
		if (su>= sm) {
			System.out.println("o seu salário é adequado");
		
		}
		else {
			System.out.println("o seu salário não é adequado, peça aumento ou apenas aceite se você estiver fazendo estágio pois o salário é baixo mesmo");
		
		}
		
		
	}

}
