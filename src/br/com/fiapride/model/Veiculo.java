package br.com.fiapride.model;

public class Veiculo {
	
	public String motorista;
	public String placa;
	public double combustivel;
	
	public void adicionarCombustivel(double v) {
		combustivel = combustivel + v;
	}
	
	public void consumirCombustivel(double v) {
		combustivel = combustivel - v;
	}
}