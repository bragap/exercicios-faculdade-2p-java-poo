
   
   import java.util.Scanner;

public class exercicio5 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de disciplinas: ");
        int numDisciplinas = scanner.nextInt();

        System.out.print("Informe o total de horas disponíveis por semana: ");
        int horasDisponiveis = scanner.nextInt();

        System.out.print("Informe o total de minutos disponíveis por semana: ");
        int minutosDisponiveis = scanner.nextInt();

        calcularPlanoDeEstudos(numDisciplinas, horasDisponiveis, minutosDisponiveis);

        scanner.close();
    }

    public static void calcularPlanoDeEstudos(int numDisciplinas, int horasDisponiveis, int minutosDisponiveis) {
        int totalMinutosDisponiveis = horasDisponiveis * 60 + minutosDisponiveis;
        int tempoPorDisciplina = totalMinutosDisponiveis / numDisciplinas;
        int minutosDeDescanso = totalMinutosDisponiveis % numDisciplinas;

        System.out.println("Tempo disponível por disciplina: " + tempoPorDisciplina + " minutos");

        for (int i = 0; i < numDisciplinas; i++) {
            int minutosParaEstaDisciplina = tempoPorDisciplina;

            if (minutosDeDescanso > 0) {
                minutosParaEstaDisciplina++;
                minutosDeDescanso--;
            }

            int horasParaEstaDisciplina = minutosParaEstaDisciplina / 60;
            int minutosRestantes = minutosParaEstaDisciplina % 60;

            System.out.println("Disciplina " + (i + 1) + ": " + horasParaEstaDisciplina + " horas e " + minutosRestantes + " minutos");
        }
    }
}


