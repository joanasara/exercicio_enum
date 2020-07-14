package enumeradores_enum;

public class Teste {
	public static void main(String[] args) {

		usandoConstantes();

		System.out.println();

		usandoEnum();

	}

	private static void usandoConstantes() {

		int segunda = DiaSemanaConstantes.SEGUNDA_FEIRA;
		int terca = DiaSemanaConstantes.TERCA_FEIRA;
		int quarta = DiaSemanaConstantes.QUARTA_FEIRA;
		int quinta = DiaSemanaConstantes.QUINTA_FEIRA;
		int sexta = DiaSemanaConstantes.SEXTA_FEIRA;
		int sabado = DiaSemanaConstantes.SABADO_FEIRA;
		int domingo = DiaSemanaConstantes.DOMINGO;

		System.out.println("Teste Ultilizando Constantes No Java ");

		imprimirDiaDasemana(segunda);
		imprimirDiaDasemana(terca);
		imprimirDiaDasemana(quarta);
		imprimirDiaDasemana(quinta);
		imprimirDiaDasemana(sexta);
		imprimirDiaDasemana(sabado);
		imprimirDiaDasemana(domingo);

	}

	private static void imprimirDiaDasemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("SEGUNDA-FEIRA");
			break;
		case 2:
			System.out.println("TERÇA-FEIRA");
			break;
		case 3:
			System.out.println("QUARTA-FEIRA");
			break;
		case 4:
			System.out.println("QUINTA-FEIRA");
			break;
		case 5:
			System.out.println("SEXTA-FEIRA");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;

		}

	}

	private static void usandoEnum() {

		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		System.out.println("Ultilizando Enum No Java");
		imprimirDiaDasemana(segunda);
		imprimirDiaDasemana(terca);
		imprimirDiaDasemana(quarta);
		imprimirDiaDasemana(quinta);
		imprimirDiaDasemana(sexta);
		imprimirDiaDasemana(sabado);
		imprimirDiaDasemana(domingo);

	}

	private static void imprimirDiaDasemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("SEGUNDA-FEIRA");
			break;
		case TERCA:
			System.out.println("TERÇA-FEIRA");
			break;
		case QUARTA:
			System.out.println("QUARTA-FEIRA");
			break;
		case QUINTA:
			System.out.println("QUINTA-FEIRA");
			break;
		case SEXTA:
			System.out.println("SEXTA-FEIRA");
			break;
		case SABADO:
			System.out.println("SABADO");
			break;
		case DOMINGO:
			System.out.println("DOMINGO");
			break;

		}

	}
}
