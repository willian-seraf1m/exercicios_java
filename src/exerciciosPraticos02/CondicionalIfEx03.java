package exerciciosPraticos02;

import java.util.Scanner;

/*
 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro)
 * do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na 
 * tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo:
*/

public class CondicionalIfEx03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean seraPrimeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.printf("Digite a idade de %s ", nome);
		idade = leia.nextInt();
		
		System.out.printf("É a primeira doação de sangue de %s? ", nome);
		seraPrimeiraDoacao = leia.nextBoolean();
		leia.close();
		
		if(idade >= 18 && idade <= 59) {
			System.out.printf("%s está apto(a) para doar sangue.", nome);
		} else if ((idade >= 60 && idade <= 69) && seraPrimeiraDoacao == false) {
			System.out.printf("%s está apto(a) para doar sangue.", nome);
		} else {
			System.out.printf("%s não está apto para doar sangue", nome);
		}
	}
}
