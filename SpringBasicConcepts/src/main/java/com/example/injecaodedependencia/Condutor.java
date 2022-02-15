package com.example.injecaodedependencia;

public class Condutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Condutor condutor = new Condutor(new Carro());
		condutor.automovel();
	}
	
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}
	
	public void automovel() {
		veiculo.acao();
	}

}
