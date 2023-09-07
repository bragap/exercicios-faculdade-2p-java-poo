package questaodois;
import java.util.Scanner;

public class AplicacaoPessoa {
    
    public static Scanner ler = new Scanner(System.in);
    
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2;

        String nome2;
        String cpf2;
        String sexo2;
        int idade2;

        System.out.println("Digite o nome:");
        nome2 = ler.nextLine();
        System.out.println("Digite o cpf:");
        cpf2 = ler.nextLine();
        System.out.println("Digite o sexo:");
        sexo2 = ler.nextLine();
        System.out.println("Digite a idade:");
        idade2 = ler.nextInt();
        
        
        pessoa2 = new Pessoa(nome2,cpf2,idade2,sexo2);

        System.out.println("A pessoa 1 é " + pessoa1.verifica_maioridade());
        System.out.println("A pessoa 2 é " + pessoa2.verifica_maioridade());
         
    }
}
