package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.Aplicacao;

public class TstImpostoDeRenda {

	@Test
	public void testImpostoDeRendaUm() {
		Aplicacao aplicacao = Aplicacao.criarAplicacao(270, 2000.00f, 8.5f);
		
		assertEquals(25.15, aplicacao.obterImpostoDeRenda(), 0);
	}
	
}
