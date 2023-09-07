package exercicios;

import java.util.Scanner;

public class exercicio7 {

    public static Scanner ler = new Scanner(System.in);

	public static void multiplica_numero(int numero) {
		if( numero < 10 || numero > 99) {
			System.out.println("Numero invalido. Digite um numero de 2 digitos.");
			return;
		}
		int n1,n2,resposta,soma;
		n1 = numero/10;
		n2 = numero%10;
		soma = n1+n2;
		if ( soma > 9) {
			
			resposta = n1*100 + soma*10 + n2;
			System.out.println("Numero " + numero + " multiplicado por 11 e: " + resposta);
		} else {
			resposta = n1*100 + soma*10 + n2;
			System.out.println("Numero " + numero + " multiplicado por 11 e: " + resposta);
		}	
	}

   public static void main(String[] args) {
	   int numero;
	   while(true) {
			System.out.println("Digite um numero de 2 digitos: (para sair digite -1)");
			numero = ler.nextInt();
			if(numero == -1) {
				System.out.println("FIM ...");
	        break;
			}
			multiplica_numero(numero);
	   }
   }
}
