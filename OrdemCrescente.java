import java.util.Scanner;
public class OrdemCrescente {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		double a, b ,c;
		System.out.println("Informe o Primeiro valor");
		a = ler.nextDouble();
		System.out.println("Informe o segundo valor");
		b=ler.nextDouble();
		System.out.println("Informe o terceiro valor");
		c=ler.nextDouble();
		if (a+b<c || a+c<b || b+c<a) {
			System.out.println("Isto n�o � um tri�ngulo");
		} else if (a==b && a==c) {
			System.out.println("Isto � um tri�ngulo equil�tero");
		} else if (a==b || a==c || b==c) {
			System.out.println("Isto � um tri�ngulo is�sceles");
		}
	}

}
