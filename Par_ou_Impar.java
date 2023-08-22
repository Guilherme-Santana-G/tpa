import java.util.Scanner;
public class Par_ou_Impar {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int n, rn;
		System.out.println("coloque aqui um número qualquer");
		n = ler.nextInt();
		rn=n%2;
		if (rn==0) {
			System.out.println("este número é par");
		
		}
		else {System.out.println("este número é ímpar");
		
		
		}
		
	
		
	}

}
