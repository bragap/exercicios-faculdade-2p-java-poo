

import java.util.Scanner;

public class exercicio6 {
	
	public static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		int primeiro,segundo, x , y, resposta;
		System.out.println("Digite o valor do primeiro premio:");
		primeiro = ler.nextInt();
		y = primeiro % 1000;
		System.out.println("Digite o valor do segundo premio:");
		segundo = ler.nextInt();
		x = segundo / 100;
		System.out.println("Realizando calculo ...");
		System.out.println("...");
		resposta = x*1000 + y;
		System.out.println("O numero vencedor da organizacao e:" + resposta);
	}
	
	
	
	
}
