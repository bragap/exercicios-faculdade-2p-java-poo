package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class exercicio12 {

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void inverter() {
        try {
            File arquivo = new File("exercicio12.txt"); // Substitua pelo caminho do seu arquivo
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.equals("fim")) {
                    break; // Sai do loop se a linha for "fim"
                }

                System.out.println("Invertendo frase ...");
                String rvs = reverse(linha);
                System.out.println("A string invertida é: " + rvs);
            }

            bufferedReader.close();
            System.out.println("Sistema finalizado!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        inverter();
    }
}
