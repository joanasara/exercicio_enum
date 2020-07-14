package frabricarDeCarro;

public class TestaCarro {

	public static void main(String[] args) {

		Carro carro = new Carro("VERDE", "FUSCA", 0, 30);
		System.out.println(carro.toString());
		carro.ligar();
		carro.acelera(80);
		System.out.println("velocidade atual " + carro.getVelocidadeAtual());
		carro.pegaMacher();
		System.out.println("velocidade maxima do carro " +carro.getVelocidadeMaxima());

	}

}
