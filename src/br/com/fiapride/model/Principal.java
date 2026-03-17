package br.com.fiapride.model;

public class Principal {
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		v1.motorista = "Carlos";
		v1.placa = "ABC-1234";
		v1.combustivel = 10;
		v1.adicionarCombustivel(50);
		v1.consumirCombustivel(20);
		System.out.println("Dono: " + v1.motorista + " | Placa: " + v1.placa + " | Combustível: " + v1.combustivel);
	}
}