package estruturasDeRepeticao2;

import java.util.Scanner;

public class lacoFor {

	public static void main(String[] args) {
		 /* Escreva um algoritmo em Java, que leia 2 números inteiros
		  * via teclado, onde o primeiro número deve ser menor do que
		  * o segundo número. Caso contrário, deve ser exibida uma
		  * mensagem na tela informando que o intervalo é inválido e sair do programa. 
		  * No intervalo informado, mostre na tela todos os números que são múltiplos de 3 e 5.
		  */
		   
		Scanner scanner = new Scanner(System.in);
		
		int multiplo5 = 0;
		int multiplo3 = 0;
		
		System.out.println("Digite 2 números para o intervalo. Sendo o primeiro número menor que o segundo.");
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo inválido. O primeiro número deve ser maior que o segundo");
			scanner.close();
			return;
		}
		
		for(int i = num1; i <= num2; i++) {
			if(i % 3 == 0) {
				multiplo3 = i;
				System.out.println("O número " + multiplo3 + "é múltiplo de 3");
			}
			
			if( i % 5 == 0) {
				multiplo5 = i;
				System.out.println("O número " + multiplo5 + "é múltiplo de 5");
			}
		}
		
		scanner.close();
	}

}
