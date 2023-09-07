package questaoum;

public class AplicacaoData {

    public static void main(String[] args) {

        Data data1 = new Data();
        Data data2 = new Data(8, 3, 2002);

        System.out.println("Getters:");
        System.out.println("Dia da data1:" + data1.getDia());
        System.out.println("Ano da data2:" + data2.getAno());
        System.out.println("Mes da data2:" + data2.getMes());
        System.out.println("\n");
        System.out.println(" Procedimento adicionaDias");
        data2.adicionaDias(10);
        data1.adicionaDias(15);
        System.out.println("Dia da data2 somado a 10 dias:" + data2.getDia());
        System.out.println("Dia da data1 somado a 15 dias:" + data1.getDia());
        System.out.println("\n");
        System.out.println("Função diasNoMes");
        int dias_mesd1 = data1.diasNoMes();
        int dias_mesd2 = data2.diasNoMes();
        System.out.println("Quantidade de dias do mes da data1 : " + dias_mesd1);
        System.out.println("Quantidade de dias do mes da data2 : " + dias_mesd2);
        System.out.println("\n");
        System.out.println("Função proximoDia");
        data1.proximoDia();
        data2.proximoDia();
        System.out.println("Dia da data2 somado a 1 dia:" + data2.getDia());
        System.out.println("Dia da data1 somado a 1 dia:" + data1.getDia());
        System.out.println("\n");
        System.out.println("Data porExtenso");
        String data1_extenso = data1.porExtenso();
        String data2_extenso = data2.porExtenso();
        System.out.println("Data1 por extenso: " + data1_extenso);
        System.out.println("Data2 por extenso: " + data2_extenso);

    }

}
