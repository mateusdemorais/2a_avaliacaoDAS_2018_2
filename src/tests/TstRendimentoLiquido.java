package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.Aplicacao;

public class TstRendimentoLiquido {

	@Test
	public void testRendimentoLiquidoUm() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(420, 250.00f, 8.0f);
		
		assertEquals(7.5945, aplicacao.obterRendimentoLiquido(), 0);
	}
	
	@Test
	public void testRendimentoLiquidoDois() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(550, 400.00f, 8.0f);
		
		assertEquals(9.9452, aplicacao.obterRendimentoLiquido(), 0);
	}
	
}
