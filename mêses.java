package listatpa;

import java.util.Scanner;

public class m�ses {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		int m;
		
		System.out.println("Escreva o n�mero correspondente a um dos 12 meses respectivamente:");
		m = in.nextInt();
		switch(m) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 10:
	    case 12:
	        System.out.println(" Este m�s possui 31 dias.");
		    break;
		    
	    case 2:
	    	System.out.println(" Este m�s possui 28 dias.");
		    break;
		   
	    case 4:
	    case 6:  
	    case 9:
	    case 11:
	    	System.out.println(" Este m�s possui 30 dias.");
		    break;
		    
	    	default:
	    	System.out.println(" M�s inv�lido");	
		}in.close();
		
	}
}