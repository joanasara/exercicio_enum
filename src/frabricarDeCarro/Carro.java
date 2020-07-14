package frabricarDeCarro;

public class Carro {
	// DECLAÇÃO DOS ATRIBUTOs

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
     
	
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// LIGAR CARRO
	void ligar() {
		System.out.println("O CARRO ESTA LIGADO");
	}

	// ACELERA UMA CERTA QUANTIDADE

	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;

	}

	// DEVOLVER A MARCHA DO CARRO
	int pegaMacher() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual <= 0 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}

	@Override
	public String toString() {
		return "\ncarro: cor: " + cor + " Modelo: " + modelo;
	}

}
