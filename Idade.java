import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int Aa, An, I;
		System.out.println("Coloque seu ano de nascimento");
		An = ler.nextInt();
		System.out.println("Coloque o ano atual");
		Aa = ler.nextInt();
		I = Aa - An;
		System.out.println("sua idade atual � " + I);
		if (I >= 18) {
			System.out.println("Voc� � maior de idade");
		} else {
			System.out.println("Voc� � menor de idade");
		}
	}
}
