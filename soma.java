package listaVetor;

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
		for(i=0; i<5; i++) {
			System.out.println("Entre com o "+(i+1)+" valor do vetor A.");
			a[i] = in.nextInt();
			
			//declarando b
			for(i=0; i<5; i++) {
				System.out.println("Entre com o "+(i+1)+" valor do vetor B.");
				b[i] = in.nextInt();
		}
		System.out.print("\nB[] = [ ");
		for(i=0; i<5; i++) {
			System.out.print(a[i]+"  ");
			c[] = a[i] + b[i] ;
		}System.out.print(" ]");
		
	}
}