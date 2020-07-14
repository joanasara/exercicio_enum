package problemas_de_condiccionais;

import java.util.Scanner;

public class Execicio01 {

	public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);

		int num1, num2;
		
		System.out.println("Digite o primeiro numero");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo valor");
		num2 = leia.nextInt();
		
		if(num1 >  num2) {
			System.out.println("O valor maior e: "+ num1);
		}
		 else {
			System.out.println("Valor maior e: "+ num2);
		}
		
		
      leia.close();
	}

}
