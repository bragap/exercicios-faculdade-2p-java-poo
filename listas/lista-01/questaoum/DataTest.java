package questaoum;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {
	Data data1;
	Data data2;
	@BeforeEach
	void setUp() throws Exception {
	data1 = new Data();
	data2 = new Data(8,3,2002);
	}
	
	@Test
	void DeveriaAdicionar1Dia() {
		data2.adicionaDias(10);
		assertEquals(18,data2.getDia(),"Testando a função de adicionar dias.");
	}
    
	@Test
	void DeveriaRetornarAQuantidadeDeDiasDoMesDaData() {
		assertEquals(31,data1.diasNoMes(),"Testando a função para exibir a quantidade de dias no mês da data");
		assertEquals(31,data2.diasNoMes(),"Testando a função para exibir a quantidade de dias no mês da data");
	}
	@Test
	void DeveriaRetorarODiaDaSemana() {
		assertEquals("Sexta-feira",data2.diaDaSemana(),"Testando a função para exibir o dia da semana da data inserida");
	}
	@Test
	void DeveriaRetornarSeOAnoEBissextoOuNao() {
	assertEquals(false,data1.eAnoBissexto(2023),"Testando se o ano de 2023 é bissexto ou não.");
	assertEquals(false,data2.eAnoBissexto(2002),"Testando se o ano de 2002 é bissexto.");
	}
	@Test
	void DeveriaRetornarODiaSeguinte() {
		data2.proximoDia();
		data1.proximoDia();
		assertEquals(9,data2.getDia(),"Testa se o dia seguinte esta correto.");
	}
	@Test
	void DeveriaRetornarADataPorExtenso() {
		assertEquals("8 de Março de 2002",data2.porExtenso(),"Testa se o retorno do mês está correto");
		assertEquals("30 de Agosto de 2023",data1.porExtenso(),"Testa se o retorno do mês está correto");

	}
}
