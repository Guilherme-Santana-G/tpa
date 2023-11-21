package listae;

import java.util.Scanner;

public class invertido {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[], b[], i, j;
			a = new int [10];
			b = new int [10]; 
			j = 9;
			
			for(i=0; i<10; i++) {
				System.out.println("Entre com o "+(i+1)+" valor");
				a[i] = in.nextInt();
				b[j] = a[i];
				j--;
			}
			System.out.print("\nA[] = [ ");
			for(i=0; i<10; i++) {
				System.out.print(a[i]+"  ");
			}System.out.print(" ]");
			
			System.out.print("\nB[] = [ ");
			for(i=0; i<10; i++) {
				System.out.print(b[i]+"  ");
			}System.out.print(" ]");
			
			}
			
			
}
