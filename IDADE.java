import java.util.Scanner;
public class IDADE {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int I;
		System.out.println("Coloque a sua idade aqui");
		I=ler.nextInt();
		ler.close();
		if (I<=10) {
			System.out.println("Voc� ainda � uma crian�a");
		}
		else if ( I> 10 && I<18) {
			System.out.println("voc� � um adolescente");
		}
		else if	( I>=18 && I<60) {
				System.out.println("Voc� � um Adulto");
		}
				else   {
			  	System.out.println("voc� � um idoso");
				}
			}
			
		}
	


