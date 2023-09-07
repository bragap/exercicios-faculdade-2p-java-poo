

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class exercicio11 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeArquivo = "datas.txt"; // Nome do arquivo de texto
        List<String> datas = new ArrayList<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));

            // Lê o número de datas da primeira linha
            int numDatas = Integer.parseInt(leitor.readLine());

            // Lê as datas restantes e as armazena na lista
            for (int i = 0; i < numDatas; i++) {
                String linha = leitor.readLine();
                datas.add(linha);
            }

            leitor.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        // Exibe as datas lidas
        System.out.println("Datas lidas do arquivo:");
        for (String data : datas) {
            System.out.println(data);
}
    }
}
