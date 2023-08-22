import java.util.Scanner;
public class ProgramaRaizes {
	public static void main  (String[]args) {
		Scanner ler = new Scanner (System.in);
		double a ,b ,c ,d ,x1 ,x2 ;
       System.out.println("Informe primeiro valor ");
		a = ler.nextDouble();
       System.out.println("Informe segundo valor ");
		b = ler.nextDouble();
		System.out.println("Informe o terceiro valor");
        c = ler.nextDouble();
        d = (b*b)- (4*a*c);
        if (d<0) {
        	System.out.println("não existem raízes reais para essa equacao");
        }else if (d==0) {
        	x1 = -b+Math.sqrt(d) / (2*a);
        	System.out.println("Existe uma raiz real x1 = "+x1);
        }else {
        	x1 = -b+Math.sqrt(d) / (2*a);
        	x2 = -b-Math.sqrt(d) / (2*a);
        	System.out.println("Existem duas raizes reais x1 = "+x1+" e x2 = "+x2);
        }
     //  System.out.println("O valor de delta é" +d);
        
		ler.close();	
	}
}