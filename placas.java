package listatpa;

import java.util.Scanner;

public class placas {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int p;
		  System.out.println("Escreva o ultimo dígito da placa do seu carro");
		  p = in.nextInt();
		  // abrir switch
		  switch(p) {
		  case 1:
		  case 2:
			  System.out.println("O tráfego é proibido na Segunda-feira");
			  break;
		  case 3:
		  case 4:
			  System.out.println("O tráfego é proibido na Terça-feira");
			  break;
		  case 5:
		  case 6:
			  System.out.println("O tráfego é proibido na Quarta-feira");
			  break;
		  case 7:
		  case 8:
			  System.out.println("O tráfego é proibido na Quinta-feira");
			  break;
		  case 9:
		  case 0:
			  System.out.println("O tráfego é proibido na Sexta-feira");
			  break;
			  default:
				  System.out.println("Dígito inválido");
				  
		 
		  } in.close();
	}

}
