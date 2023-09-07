package questaotres;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {
    Conta conta;

    @Test
    public void deveSacarDaContaDoUsuario() {
        conta = new Conta(1, 3000.00);
        conta.sacar(500);
        assertEquals(2500, conta.getSaldo());
    }

    @Test
    public void deveDepositarNaContaDoUsuario() {
        conta = new Conta(1, 3000.00);
        conta.depositar(500);
        assertEquals(3500, conta.getSaldo());
    }
}
