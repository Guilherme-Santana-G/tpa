import java.util.Scanner;
public class Temperatura {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		double f, c;
		System.out.println("coloque aqui a temperatura em Fahrenheit");
		f=ler.nextDouble();
		c = (f-32)/1.8 ;
		System.out.println("a temperatura em celsius � "+c);
		if (c < 15) {
			System.out.println("Est� frio");
		}	else if (c < 22) {
				System.out.println("Est� ameno");
			}
			else {
				System.out.println("Est� calor");
			}
		}
			
		
	}


