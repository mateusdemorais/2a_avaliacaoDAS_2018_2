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
public class TstRendimentoBruto {
	
	int tempo;
	double aplicacaoInicial;
	double taxaJurosAnual;
	double rendimentoBruto;
	
	public TstRendimentoBruto(int tempo, double aplicacaoInicial, double taxaJurosAnual, double rendimentoBruto) {
		this.tempo = tempo;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
		this.rendimentoBruto = rendimentoBruto;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		
		// Parâmetros 1
		Object[] parametros1 = new Object[]{60, 1000.00f, 8.5f, 13.97};
		
		// Parâmetros 2
		Object[] parametros2 = new Object[] {120, 500.00f, 8.0f, 13.15};
		
		// Parâmetros 3
		Object[] parametros3 = new Object[] {240, 3000.00f, 9.0f, 177.53};
		
		return Arrays.asList(new Object[][] {
			parametros1, 
			parametros2, 
			parametros3
		});
	}
	
	@Test
	public void testRendimentoBruto() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(this.tempo, this.aplicacaoInicial, this.taxaJurosAnual);
		
		assertEquals(this.rendimentoBruto, aplicacao.obterRendimentoBruto(), 0);
	}
	
}
