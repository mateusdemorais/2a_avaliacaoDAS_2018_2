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
	
	public double obterImpostoDeRenda() {
		
		double aliquota = 0f;
		
		if(this.tempo <= 180) {
			aliquota = 0.225f;
		} else if(this.tempo >= 181 && this.tempo <= 360) {
			aliquota = 0.20f;
		} else if(this.tempo >= 361 && this.tempo <= 720) {
			aliquota = 0.175f;
		} else if(this.tempo > 720) {
			aliquota = 0.15f;
		}
		
		return Math.round(this.obterRendimentoBruto() * aliquota * 100.0)/100.0;
	}
	
}
