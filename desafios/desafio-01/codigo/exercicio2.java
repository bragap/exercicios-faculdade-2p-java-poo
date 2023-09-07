

import java.util.Scanner;


public class exercicio2 {
    public static Scanner ler = new Scanner(System.in);

    public static int[] somarVizinhos(int[] vetor) {
        int[] novoVetor = new int[(vetor.length + 1) / 2];
        
        for (int i = 0; i < vetor.length; i += 2) {
            if (i + 1 < vetor.length) {
                novoVetor[i / 2] = vetor[i] + vetor[i + 1];
            } else {
                novoVetor[i / 2] = vetor[i] * 2;
            }
        }
        
        return novoVetor;
    }
    
    public static int[] lerVetor() {
        System.out.print("Digite os numeros do vetor separados por espaco: ");
        String entrada = ler.nextLine();
        String[] numerosString = entrada.split(" ");
        int[] vetor = new int[numerosString.length];
        
        for (int i = 0; i < numerosString.length; i++) {
            vetor[i] = Integer.parseInt(numerosString[i]);
        }
        
        return vetor;
    }
    
    public static void main(String[] args) {
        int[] vetorOriginal = lerVetor();
        int[] vetorSoma = somarVizinhos(vetorOriginal);
        
        System.out.print("Vetor original: ");
        for (int num : vetorOriginal) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Vetor com a soma de vizinhos: ");
        for (int num : vetorSoma) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
