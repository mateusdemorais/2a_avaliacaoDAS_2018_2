package app;

public class Aplicacao {

	private int tempo;
	private double aplicacaoInicial;
	private double taxaJurosAnual;
	
	public Aplicacao(int tempo, double aplicacaoInicial, double taxaJurosAnual) {
		this.tempo = tempo;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
	}
	
	public static Aplicacao criarAplicacao(int tempo, double aplicacaoInicial, double taxaJurosAnual) {
		return new Aplicacao(tempo, aplicacaoInicial, taxaJurosAnual);
	}
	
	public double obterRendimentoBruto() {
		return Math.round(((double)this.tempo / 365) * this.aplicacaoInicial * this.taxaJurosAnual)/100.0;
	}
	
}
