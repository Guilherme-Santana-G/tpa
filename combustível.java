import java.util.Scanner;
public class combust�vel {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		double kml, km, l;
		System.out.println("Coloque aqui a dist�ncia percorrida em km");
		km=ler.nextDouble();
		System.out.println("Coloque a capacidade do tanque aqui");
		l=ler.nextDouble();
		kml= km/l;
		System.out.println("O gasto � de "+kml+ "km/L");
		if (kml>=10) {
			System.out.println("Seu carro � econ�mico");
		}
		else {
			System.out.println("Seu carro n�o � econ�mico");
	
		}
		ler.close();
		
	}

}
