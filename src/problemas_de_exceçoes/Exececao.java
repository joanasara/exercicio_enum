package problemas_de_exce�oes;

public class Exececao {

	public static void main(String[] args) {

		try {
			// BLOCO QUE E MONITORADO POR ERROS
			int[] veto = new int[6];

			System.out.println("Antes da exception ");

			veto[5] = 10;

			System.out.println("este texto n�o sera impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exece��o ao acessar um �ndice de vetor que n�o existe");
		}
		System.out.println("Esse texto ser� impresso ap�s a exception");
	}
}
