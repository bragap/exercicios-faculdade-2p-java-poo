package questaodois;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {
	Pessoa pessoa1;
	Pessoa pessoa2;
	@BeforeEach
	void setUp(){
	pessoa1 = new Pessoa();
    pessoa2 = new Pessoa("Roberto", "105900851-31",15, "Masculino");
	}

	@Test
	void DeveriaVerificarAMaioridade(){
    assertEquals("Menor de idade",pessoa2.verifica_maioridade());
	assertEquals("Maior de idade",pessoa1.verifica_maioridade());
	}
		
	}


