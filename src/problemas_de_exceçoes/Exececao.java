package problemas_de_exceçoes;

public class Exececao {

	public static void main(String[] args) {

		try {
			// BLOCO QUE E MONITORADO POR ERROS
			int[] veto = new int[6];

			System.out.println("Antes da exception ");

			veto[5] = 10;

			System.out.println("este texto não sera impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Execeção ao acessar um índice de vetor que não existe");
		}
		System.out.println("Esse texto será impresso após a exception");
	}
}
