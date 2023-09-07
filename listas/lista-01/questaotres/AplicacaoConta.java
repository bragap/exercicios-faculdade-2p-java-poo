package questaotres;

public class AplicacaoConta {
 

    public static void main(String[] args){
    
    Conta conta1 = new Conta(1,10000.000);
    Conta conta2 = new Conta(2,3000.000);   
    conta1.sacar(1000.00);
    conta2.depositar(5000.00);
    System.out.println("Valor final da conta " + conta1.getNumeroConta() + " após sacar 1000 reais : " + conta1.getSaldo()+" reais");
    System.out.println("Valor final da conta "+conta2.getNumeroConta() + " após depositar um valor de 5000 reais: " + conta2.getSaldo()+ " reais");
    System.out.println("Existem " + Conta.getContador() + " contas no Sistema do Banco");
    }



}
