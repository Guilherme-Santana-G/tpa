package listae;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i;
		double  s = 0, m = 0;
			a = new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Entre com o "+(i+1)+" valor do vetor A.");
				a[i] = in.nextInt();
				s += a[i];
				m = s/TAM;
			}
			
			System.out.println(m);
	}
	
} 
