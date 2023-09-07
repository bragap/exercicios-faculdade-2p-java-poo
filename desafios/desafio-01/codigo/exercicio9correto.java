
import java.util.Scanner;

public class exercicio9correto {
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
        data.verifica_data2024(dia, mes, ano);

    }

}
