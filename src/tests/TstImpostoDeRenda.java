package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Aplicacao;

@RunWith(Parameterized.class)
public class TstImpostoDeRenda {

	int tempo;
	double aplicacaoInicial;
	double taxaJurosAnual;
	double impostoDeRenda;
	
	public TstImpostoDeRenda(int tempo, double aplicacaoInicial, double taxaJurosAnual, double impostoDeRenda) {
		this.tempo = tempo;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
		this.impostoDeRenda = impostoDeRenda;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		
		// Parâmetros 1
		Object[] parametros1 = new Object[]{270, 2000.00f, 8.5f, 25.15};
		
		// Parâmetros 2
		Object[] parametros2 = new Object[] {390, 100.00f, 7.5f, 1.40};
		
		// Parâmetros 3
		Object[] parametros3 = new Object[] {1000, 100.00f, 7.5f, 3.08};
		
		return Arrays.asList(new Object[][] {
			parametros1, 
			parametros2, 
			parametros3
		});
	}
	
	@Test
	public void testImpostoDeRenda() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(this.tempo, this.aplicacaoInicial, this.taxaJurosAnual);
		
		assertEquals(this.impostoDeRenda, aplicacao.obterImpostoDeRenda(), 0);
	}
	
}
