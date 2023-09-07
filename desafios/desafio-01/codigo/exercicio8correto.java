
import java.util.Scanner;

public class exercicio8correto {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Data data = new Data();

        int dia;
        int mes;
        int ano;
        System.out.println("Insira o dia, formato de 2 numeros:");
        dia = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o mes, formato de 2 numeros:");
        mes = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o ano, formato de 4 numeros:");
        ano = Integer.parseInt(ler.nextLine());
        data.alterar_data(dia, mes, ano);
        System.out.println("\n");
        System.out.println("Iniciando o exercicio: A data deve conseguir ser comparada com outra data e indicar, com valor booleano, se esta na frente desta outra data no calendario.");
        int dia2;
        int mes2;
        int ano2;
        System.out.println("Insira o dia2, formato de 2 numeros:");
        dia2 = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o mes2, formato de 2 numeros:");
        mes2 = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o ano2, formato de 4 numeros:");
        ano2 = Integer.parseInt(ler.nextLine());
        int dia3;
        int mes3;
        int ano3;
        System.out.println("Insira o dia3, formato de 2 numeros:");
        dia3 = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o mes3, formato de 2 numeros:");
        mes3 = Integer.parseInt(ler.nextLine());
        System.out.println("Insira o ano3, formato de 4 numeros:");
        ano3 = Integer.parseInt(ler.nextLine());
        boolean resposta = data.compara_datas(dia2,mes2,ano2,dia3,mes3,ano3);
        if(resposta) {
                    System.out.println("Data 2 esta a frente da data 3.");

        } else {
                    System.out.println("Data 3 esta a frente da data 2.");
        }

    }
}
