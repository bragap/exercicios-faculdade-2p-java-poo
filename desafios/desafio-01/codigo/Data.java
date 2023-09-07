

public class Data {

    private int dia = 01;
    private int mes = 01;
    private int ano = 1900;

    public String data = dia + "/" + mes + "/" + "/" + ano;

    // Criando métodos getters e setters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if( ano > 1899 & ano < 10000)
        this.ano = ano;
    }

    public void setDia(int dia) {
        if( dia > 0 && dia < 32)
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13)
        this.mes = mes;
    }
    // FIm dos metodos getters e setters

   /**
    * Construtor sem parametros, chamado para dizer qual a data principal do sistema;
    */
    public Data() {
        //System.out.println("Data padrao do sistema: 01/01/1900");
    }
    /**
     * Construtor que recebe parametros e altera a data do mes, se validada corretamente;
     * @param dia dia inserido pelo usuario;
     * @param mes mes inserido pelo usuario;
     * @param ano ano inserido pelo usuario;
     */
    public Data(int dia, int mes, int ano){
        if(verifica_data(dia, mes, ano)){
       setDia(dia);
       setMes(mes);
       setAno(ano);
    }
}

    /**
     * Verifica se a data pode ser alterada para a que foi inserida
     * pelo usuario
     * @param dia dia inserido pelo usuario
     * @param mes mes inserido pelo usuario 
     * @param ano ano inserido pelo usuario
     * @return retorna um valor booleano contendo a verificacao
     * da data inserida, se for verdadeiro, a data padrao do 
     * sistema é alterada, se não, mantém-se a data padrão:
     * 1/1/1900
     */
    public boolean verifica_data(int dia, int mes, int ano) {
        if (ano_bissexto(ano)) {
            if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano < 1900) {
                System.out.println("Data informada não é válida, será mantida a data padrão do sistema.");
                return false;
            } else if ((mes == 4 || mes == 6 || mes == 9) && (dia > 30)) {
                System.out.println(
                        "Data informada não é válida, pois o mês só possui 30 dias, será mantida a data padrão do sistema.");
                return false;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    && (dia > 31)) {
                System.out.println(
                        "Data informada não é válida, pois o mês só possui 31 dias, será mantida a data padrão do sistema.");
                return false;
            } else if (mes == 2 && dia > 29) {
                System.out.println(
                        "Data informada não é válida, pois fevereiro só possui 29 dias, e se trata de um ano bissexto. Será mantida a data padrão do sistema.");
                return false;
            }
        } else {
            if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano < 1900) {
                System.out.println("Data informada não é válida, será mantida a data padrão do sistema.");
                return false;
            } else if ((mes == 4 || mes == 6 || mes == 9) && (dia > 30)) {
                System.out.println(
                        "Data informada não é válida, pois o mês só possui 30 dias, será mantida a data padrão do sistema.");
                return false;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    && (dia > 31)) {
                System.out.println(
                        "Data informada não é válida, pois o mês só possui 31 dias, será mantida a data padrão do sistema.");
                return false;
            } else if (mes == 2 && dia > 28) {
                System.out.println(
                        "Data informada não é válida, pois fevereiro só possui 28 dias, e nao se trata de um ano bissexto. Será mantida a data padrão do sistema.");
                return false;
            }
        }

        return true;
    }

    // ------------------------------- Exercicio 8
    // ----------------------------------------

    /**
     * Função criada para determinar se um ano é bissexto ou não.
     * 
     * @param ano recebe o ano inserido pelo usuário e faz a comparação com anos
     *            bissextos.
     * @return retorna true se o ano for bissexto e false se não for.
     */
    public boolean ano_bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /**
     * Função criada para receber o dia, mes e ano inseridos no console do usuario.
     * Se todos os parametros estiverem ok,
     * o codigo atualiza a data. Se não, é mantida a data padrao do
     * sistema.01/01/1900;
     * 
     * @param dia ocorre verificações para e informa se o mês é de 31, 30 ou 28
     *            dias.
     * @param mes o sistema verifica e diz se o mes possui ou nao 31, 30 ou 28 dias.
     * @param ano verifica o ano inserido.
     */
    public void alterar_data(int dia, int mes, int ano) {
        if (verifica_data(dia, mes, ano)) {
            this.dia=dia;
            this.mes=mes;
            this.ano=ano;
            data = dia + "/" + mes + "/" + ano;
            System.out.println("Data alterada para:" + data);
        }
    }
    // ------------------------------- Fim do Exercicio 8
    // ----------------------------------------




    
    // --------------------------------- Exercicio 9
    // ----------------------------------------

    /**
     * Função criada para contador e retornar os dias que existirem entre a data
     * inserida pelo
     * usuario e o dia 01 de janeiro de 2024.
     * 
     * @param dia data inserida pelo usuario.
     * @param mes mes inserida pelo usuario.
     * @param ano ano inserida pelo usuario.
     * @return o retorno será um Int que representa a quantidade de dias que houver
     *         entre o dia 01/01/2024 e a data que o usuario
     *         inseriu.
     */
    public int contador_dias(int dia, int mes, int ano) {

        int contador_dias = 0;
        int qtd_dias = 0;
        int[] bissexto = new int[13];
        int[] nao_bissexto = new int[13];
        bissexto = new int[] { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        nao_bissexto = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        
            if (ano_bissexto(ano)) {
                for (int i = 1; i <= mes; i++) {
                    contador_dias += bissexto[i];
                    qtd_dias = contador_dias - (bissexto[mes] - dia);

                }
            } else {
                for (int i = 1; i <= mes; i++) {
                    contador_dias += nao_bissexto[i];
                    qtd_dias = contador_dias - (nao_bissexto[mes] - dia);
                }
            }

        return qtd_dias;
    }

    /**
     * Função criada para verificar o dia da semana que a data inserida pelo usuário
     * pertence.
     * 
     * @param dia dia informada pelo usuário.
     * @param mes mes informada pelo usuário.
     * @param ano ano informada pelo usuário.
     * @return retorna uma String contendo o dia da semana inserida pelo usuário.
     */
    public void verifica_data2024(int dia, int mes, int ano) {
        
        String dia_semana = "";
        int qtd_dias = contador_dias(dia, mes, ano);

        if(verifica_data(dia, mes, ano)){

        int calculo = (qtd_dias) % 7;
        if (calculo == 1) {
            dia_semana = "segunda-feira";
        } else if (calculo == 2) {
            dia_semana = "terca-feira";
        } else if (calculo == 3) {
            dia_semana = "quarta-feira";

        } else if (calculo == 4) {
            dia_semana = "quinta-feira";

        } else if (calculo == 5) {
            dia_semana = "sexta-feira";
        } else if (calculo == 6) {
            dia_semana = "sabado";
        } else if (calculo == 0) {
            dia_semana = "domingo";
        }
    System.out.println("O dia da semana correspondente a " + dia+"/"+mes+"/"+ano+" e: " + dia_semana);

    } 
}
// ------------------------------- Fim do Exercicio 9
    // ----------------------------------------

// Enunciado: A data deve conseguir ser comparada com outra data e indicar, com valor booleano, se está à frente desta
// outra data no calendário
/**
 * Função para retornar a quantidade de dias entre as duas datas.
 * @param d1 dia da primeira data
 * @param m1 mes da primeira data
 * @param a1 ano da primeira data
 * @param d2 dia da segunda data
 * @param m2 mes da segunda data
 * @param a2 ano da segunda data
 * @return verdade para quantidade1 > quantidade2, quantidade1 é o contador de dias da data 1 a partir de 01 de janeiro e quantidade 2, da data 2;
 */
public boolean compara_datas(int d1, int m1, int a1, int d2, int m2, int a2){
       
       int quantidade1;
       int quantidade2;
       verifica_data(d1,m1,a1);
       verifica_data(d2,m2,a2);

       quantidade1 = contador_dias(d1,m1,a1);
       quantidade2 = contador_dias(d2,m2,a2);
       
       return (quantidade1 > quantidade2);
}
}

