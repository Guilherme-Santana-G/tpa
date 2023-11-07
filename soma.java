package listae;

import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	final int TAM = 10;
	int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM]; 
	   	c = new int [TAM];
	   	
	   	//declarando a
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor A.");
			a[i] = in.nextInt();
		}
		//declarando b
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor B.");
			b[i] = in.nextInt();
			
		//ciando a soma
			c[i] = a[i]+b[i];
		}
		
		System.out.print("\nc[] = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+"  ");
		}System.out.print(" ]");
		
	}
}