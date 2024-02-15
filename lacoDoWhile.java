package estruturasDeRepeticao2;

import java.util.*;

public class lacoDoWhile {

	public static void main(String[] args) {
		/*  Escreva um algoritmo em Java, que leia números inteiros via teclado,
		 *  até que o número zero seja digitado. Ao final, mostre na tela a 
		 *  média de todos os números digitados, que sejam múltiplos de 3. 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num;
		int multiplos3 = 0;
		double mediaMultiplos3 = 0;
		int totalNum = 0;
		
		do {
		System.out.println("Digite um número inteiro: ");
		num = scanner.nextInt();
		
		if(num % 3 == 0 && num != 0) {
			multiplos3++;
			totalNum = num + totalNum;
		}
		
		}while(num != 0);
		
		mediaMultiplos3 = (double) totalNum / multiplos3;
		
		if(multiplos3 != 0) {
			System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplos3);
		}else {
			 System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		}
		
		
		scanner.close();
		
	}

}
