package exercicios;

import java.util.Scanner;

public class exercicio4 {
	
	static String str = "";
	
    public static String reverse(String str) {
    	return new StringBuilder(str).reverse().toString();
    }
    
    public static Scanner ler = new Scanner(System.in);
   
	/**
	 * Inverte uma frase string;
	 * @param str Uma string com a frase a ser invertida. Pode ser vazia;
	 * @return A frase invertida em uma nova String;
	 */
    public static void inverter() {
    	while(!str.equals("fim")){
    	System.out.println("Digite a frase: (digite fim para sair do programa)");
    	str = ler.nextLine();
    	System.out.println("Invertendo frase ...");
    	String rvs = reverse(str);
    	System.out.println("A string invertida e:" + rvs);
    	}
    	System.out.println("Sisttema finalizado!");
    }
    
    public static void main(String[] args) {
    	inverter();
    	}
    }
	


	

