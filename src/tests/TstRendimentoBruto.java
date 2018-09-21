package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.Aplicacao;

public class TstRendimentoBruto {
	
	@Test
	public void testRendimentoBrutoUm() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(60, 1000.00f, 8.5f);
		
		assertEquals(13.97, aplicacao.obterRendimentoBruto(), 0);
	}
}
