import java.util.Scanner;
public class NumeroNegaNeuPosit {
	public static void main (String[]args ) {
		Scanner pika = new Scanner (System.in);
		double n;
		System.out.println("informe um n�mero aleat�rio");
		n = pika.nextDouble();
		if ( n > 0) {
			System.out.println("Este n�mero � positivo");
		}
		else if (n==0) {
			System.out.println("Este n�mero � neutro");
		}
		else {
			System.out.println(" Este n�mero � negativo");
		}
		
	}

}
