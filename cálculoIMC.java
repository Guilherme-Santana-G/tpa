import java.util.Scanner;
public class c�lculoIMC {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		double p, a, imc;
		System.out.println("informe seu peso abaixo");
		p=ler.nextDouble();
		System.out.println("informe sua altura abaixo");
		a=ler.nextDouble();
		imc=p / (a*a);
		System.out.println("Seu IMC � de "+imc);
		if (imc<18.5) {
			System.out.println("Voc� est� abaixo do peso ideal");
		}
		else if (imc>=18.5 && imc<25) {
			System.out.println("Voc� est� no peso ideal");
		}
		else if (imc>=25 && imc<30) {
			System.out.println("Excesso de Peso");
		}
		else if (imc>=30 && imc<35) {
			System.out.println("Obesidade grau 1");
		}
		ler.close();
		}

}
