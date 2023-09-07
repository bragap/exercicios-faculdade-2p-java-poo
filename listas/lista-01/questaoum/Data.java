package questaoum;
import java.time.LocalDate;

public class Data {
    private int ano;
    private int mes;
    private int dia;
  

    /*
     * Métodos estão na ordem do enunciado, existem alguns métodos complementares,
     * que não foram pedidos no exercicio, mas criei para modularizar o código;
     */ 
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    public void setMes(int mes) {
        if (mes > 0 && mes < 12)
            this.mes = mes;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= 31)
            this.dia = dia;
    }

    public void setAno(int ano) {
        if (ano > 1900 && ano < 2100)
            this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setDia(dia);
        setMes(mes);
    }

    public Data() {
        LocalDate localDate = LocalDate.now();
        setAno(localDate.getYear());
        setDia(localDate.getDayOfMonth());
        setMes(localDate.getMonthValue());
    }

    
    public void adicionaDias(int dias) {
        
        while (dias > 0) {
            int diasNoMes = diasNoMes();

            if (this.dia + dias > diasNoMes) {
                dias -= (diasNoMes - this.dia + 1);
                this.dia = 1;

                if (this.mes == 12) {
                    this.mes = 1;
                    this.ano++;
                } else {
                    this.mes++;
                }
            } else {
                this.dia += dias;
                dias = 0;
            }
        }
    }

    public int diasNoMes() {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (eAnoBissexto(this.ano)) {
            diasPorMes[2] = 29;
        }

        return diasPorMes[this.mes];
    }

    public String diaDaSemana() {
        int a = this.ano;
        int m = this.mes;
        int d = this.dia;

        String[] diasDaSemana = {  "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
                "Sexta-feira", "Sábado" ,"Domingo"};

        if (m < 3) {
            m += 12;
            a--;
        }

        int diaDaSemanaIndex = (d + 2 * m + (3 * (m + 1)) / 5 + a + (a / 4) - (a / 100) + (a / 400)) % 7;

        return diasDaSemana[diaDaSemanaIndex];
    }

    public boolean eAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean eUltimoDiaDoMes() {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (eAnoBissexto(ano)) {
            diasPorMes[2] = 29;
        }
        return dia == diasPorMes[mes];
    }

    public void proximoDia() {
        if (eUltimoDiaDoMes()) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                ano++;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
    }

    public String porExtenso() {
        String[] nomesMeses = { "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        return dia + " de " + nomesMeses[mes] + " de " + ano;
    }

}