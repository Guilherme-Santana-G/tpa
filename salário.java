import java.util.Scanner;

public class sal�rio {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double su, sm;
		System.out.println("Informe o seu sal�rio aqui");
		su = ler.nextDouble();
		System.out.println("Informe o sal�rio m�nimo atual");
		sm = ler.nextDouble();
		if (su>= sm) {
			System.out.println("o seu sal�rio � adequado");
		
		}
		else {
			System.out.println("o seu sal�rio n�o � adequado, pe�a aumento ou apenas aceite se voc� estiver fazendo est�gio pois o sal�rio � baixo mesmo");
		
		}
		
		
	}

}
