

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class exercicio10 {

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

    public static int[] lerVetor(String linha) {
        String[] numerosString = linha.split(";");
        int[] vetor = new int[numerosString.length];

        for (int i = 0; i < numerosString.length; i++) {
            vetor[i] = Integer.parseInt(numerosString[i]);
        }

        return vetor;
    }

    public static void main(String[] args) {
        try {
            File arquivo = new File("exercicio10.txt"); 
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                int[] vetorOriginal = lerVetor(linha);
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

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
