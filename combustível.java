import java.util.Scanner;
public class combustível {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		double kml, km, l;
		System.out.println("Coloque aqui a distância percorrida em km");
		km=ler.nextDouble();
		System.out.println("Coloque a capacidade do tanque aqui");
		l=ler.nextDouble();
		kml= km/l;
		System.out.println("O gasto é de "+kml+ "km/L");
		if (kml>=10) {
			System.out.println("Seu carro é econômico");
		}
		else {
			System.out.println("Seu carro não é econômico");
	
		}
		ler.close();
		
	}

}
