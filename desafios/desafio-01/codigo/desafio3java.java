import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio3java {
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

            // Permite ao usuário inserir datas à sua escolha
            
            System.out.print("Quantas datas você deseja inserir? ");
            int numDatasInserir = ler.nextInt();
            ler.nextLine(); // Consumir a quebra de linha
           
            List<String> datasInseridas = new ArrayList<>(); // Nova lista para armazenar datas inseridas

            for (int i = 1; i <= numDatasInserir; i++) {
                int dia;
                int mes;
                int ano;
                System.out.println("Insira o dia da data " + i + " , no formato de 2 numeros:");
                dia = Integer.parseInt(ler.nextLine());
                System.out.println("Insira o mes da data " + i + " , no formato de 2 numeros:");
                mes = Integer.parseInt(ler.nextLine());
                System.out.println("Insira o ano da data " + i + " , noformato de 4 numeros:");
                ano = Integer.parseInt(ler.nextLine());
                Data data_inserida = new Data(dia,mes,ano);
                boolean dataValida = data_inserida.verifica_data(dia, mes, ano);
                if (dataValida) {
                    String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
                    datasInseridas.add(dataFormatada);
                } else {
                    System.out.println("Data inserida não é válida.");
                }
            }

            datas.addAll(datasInseridas);


            // Exibe todas as datas, incluindo as inseridas pelo usuário
            System.out.println("Todas as datas:");
            for (String date : datas) {
                System.out.println(date);
            }

            // Feche o ler
            ler.close();
        }
    }
}
