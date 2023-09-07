package questaotres;
public class Conta {
    private int numero_conta;
    private double saldo;
    private static int contador;

    public Conta() {
        this.numero_conta = 0;
        this.saldo = 0.0;
    }

    public Conta(int numero_conta, double saldo) {
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        ++contador;
    }

    public int getNumeroConta() {
        return numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getContador() {
        return contador;
    }

    public void sacar(double valor_sacar) {
        this.saldo -= valor_sacar;
    }

    public void depositar(double valor_depositar) {
        this.saldo += valor_depositar;
    }
}
