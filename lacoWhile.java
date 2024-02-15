package estruturasDeRepeticao2;

import java.util.*;

public class lacoWhile {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa interna para conhecer os
		 * colaboradores da área de Desenvolvimento e precisam de um 
		 * sistema para analisar os dados. Escreva um algoritmo em Java,
		 * que leia via teclado as seguintes informações de cada colaborador:
		 * Idade, Identidade de Gênero (Número Inteiro) e Pessoa Desenvolvedora (Número Inteiro)
		 * Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaborador ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:

		  ●	O número de pessoas desenvolvedoras Backend
		  ●	O número de Mulheres Cis e Trans desenvolvedoras Frontend
		  ●	O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
		  ●	O número de Não Binários desenvolvedores FullStack menores de 30 anos
		  ●	O número total de pessoas que responderam à pesquisa
		  ●	A média de idade das pessoas que responderam à pesquisa
		 */

		Scanner scanner = new Scanner(System.in);
		
		String continua = "S";
		int mulherCis = 0;
        int homemCis = 0;
        int naoBinario = 0;
        int mulherTrans = 0;
        int homemTrans = 0;
        int outros = 0;
        int backend = 0;
        int frontend = 0;
        int mobile = 0;
        int fullStack = 0;
        int devFrontend = 0;
        int devMobile = 0;
        int devFullStack = 0;
        int totalPessoas = 0;
        int totalIdade = 0;
        int mediaIdade = 0;
		
		System.out.println("***Pesquisa Interna***");
		
		
		while(continua.equalsIgnoreCase("S")) {
			totalPessoas++;
			
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		totalIdade = idade + totalIdade;
		mediaIdade = totalIdade / totalPessoas;
		
		scanner.nextLine();
			
		System.out.println("Qual sua Identidade de Gênero: ");
		System.out.println("1 - Mulher Cis");
        System.out.println("2 - Homem Cis");
        System.out.println("3 - Não Binário");
        System.out.println("4 - Mulher Trans");
        System.out.println("5 - Homem Trans");
        System.out.println("6 - Outros");
        int identidadeGenero = scanner.nextInt();
        
        scanner.nextLine();
        
        switch (identidadeGenero) {
        case 1:
            mulherCis++;
            break;
        case 2:
            homemCis++;
            break;
        case 3:
            naoBinario++;
            break;
        case 4:
            mulherTrans++;
            break;
        case 5:
            homemTrans++;
            break;
        case 6:
            outros++;
            break;
        default:
            System.out.println("Opção inválida.");
            break;
     }
        System.out.println("Qual a sua função de Pessoa Desenvolvedora");
		System.out.println("1 - Backend");
        System.out.println("2 - Frontend");
        System.out.println("3 - Mobile");
        System.out.println("4 - FullStack");
        int pessoaDesenvolvedora = scanner.nextInt();
        
        scanner.nextLine();
        
        switch(pessoaDesenvolvedora) {
        case 1:
        	backend++;
        	break;
        case 2:
        	frontend++;
        	break;
        case 3:
        	mobile++;
        	break;
        case 4:
        	fullStack++;
        	break;
        default:
        	System.out.println("Opção inválida.");
        	break;
        }
        
        if((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
        	devFrontend++;
        }
        
        if((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
        	devMobile++;
        }
        
        if(identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
        	devFullStack++;
        }
        
        System.out.println("Deseja inserir informações de outro colaborador? (S/N)");
        continua = scanner.nextLine();
        
        

        if(continua.equalsIgnoreCase("S")) {
        	System.out.println("Digite as novas Informações: ");
        }else {
        	System.out.println("O número de pessoas desenvolvedoras Backend: " + backend);
        	System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + devFrontend);
        	System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + devMobile);
        	System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + devFullStack);
        	System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        	System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
        	
        }
        
       scanner.close();
        
		}
	}

}
