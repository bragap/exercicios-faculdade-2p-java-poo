

import java.util.Scanner;

public class exercicio1 {
    public static Scanner ler = new Scanner(System.in);
    static int vetor[] = new int[6];
    
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 6; i++) {       
            System.out.println("Digite o numero na posicao "+ i + ":");
            vetor[i] = Integer.parseInt(ler.nextLine());
        }
        
        System.out.println("Invertendo valores...");
        for(int i=0;i<3;i++){
            int x = 0;
            x = vetor[i];
            vetor[i] = vetor[5-i];
            vetor[5-i] = x; 
        }
        System.out.println("Imprimindo o vetor invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print("\t"+vetor[i]);
        }
    }
}
