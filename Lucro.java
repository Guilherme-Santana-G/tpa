import java.util.Scanner;

public class Lucro {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double preco, lucro, porcentagem, venda;
		System.out.println("Coloque o preco do produto");
		preco = ler.nextDouble();
		System.out.println("Coloque a porcentagem de lucro desejado");
		porcentagem = ler.nextDouble();
		lucro = porcentagem * preco / 100;
		venda = lucro + preco;
		System.out.println("Venda o produto por: " + venda);

	}
}