package tpa11;
import java.util.*;
public class nota {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mb, b, r, i, qa;
		String p;
		System.out.print("Informe a quantidade de alunos com Mb:     ");
		 mb = in.nextInt();
		System.out.print("Informe a quantidade de alunos com B:     ");
	     b = in.nextInt();
		System.out.print("Informe a quantidade de alunos com R:     ");
		 r = in.nextInt();
		System.out.print("Informe a quantidade de alunos com I:     ");
		 i = in.nextInt();
		 qa = mb + b + r + i;
		 System.out.println("A quantidade de alunos é: "+qa);
	     System.out.print("Informe a nota que deseja saber a porcentagem de alunos corresponde a ela:   ");
	     p = in.next();
        switch(p) {
        case "mb":
        case "MB":
        case "Mb":
        case "mB":
        	mb = (mb*100)/qa;
        	System.out.println("A porcentagem de alunos com MB é: "+mb+"%");
        break;
        case "b":
        case "B":
        	b = (b*100)/qa;
        	System.out.println("A porcentagem de alunos com B é: "+b+"%");
        break;
        case "r":
        case "R":
        	r = (r*100)/qa;
        	System.out.println("A porcentagem de alunos com R é: "+r+"%");
        break;
        case "i":
        case "I":
        	i = (i*100)/qa;
        	System.out.println("A porcentagem de alunos com I é: "+i+"%");
        break;
        default:
        	System.out.println("Invalido");
        }in.close();
	}
	
}


