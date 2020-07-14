package problemas_de_condiccionais;

import java.util.Scanner;

public class Execicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
      
		int num1;
		
		System.out.print("Digite Um Valor: ");
		num1 = leia.nextInt();
		
		
		if(num1 < 0 ) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		
		
		
		
		
		
		leia.close();
	}

}
