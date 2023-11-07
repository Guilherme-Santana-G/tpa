package atividade2908;
import java.util.Scanner; 
public class exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		int i = 1, n, r;
		System.out.print("entre com o numero para tabuada:");
		n = in.nextInt();
		while(i<= 10) {
			r=n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		}
		
		in.close();
	}
  
}
