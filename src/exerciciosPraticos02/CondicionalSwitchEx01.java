package exerciciosPraticos02;

import java.util.Scanner;

/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de 
 * um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado. */

public class CondicionalSwitchEx01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigoDoProduto, quantidade;
		float preco;
		String produto;
		
		System.out.println("Digite o código do produto: ");
		codigoDoProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		leia.close();
		
		switch(codigoDoProduto) {
			case 1:
				produto  = "Cachorro Quente";
				preco = 10.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			case 2:
				produto  = "X-Salada";
				preco = 15.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			case 3:
				produto  = "X-Bacon";
				preco = 18.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			case 4:
				produto  = "Bauru";
				preco = 12.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			case 5:
				produto  = "Refrigerante";
				preco = 8.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			case 6:
				produto  = "Suco de laranja";
				preco = 13.00f;
				System.out.printf("Produto: %s. Preço: R$ %.2f", produto, preco*quantidade);	
				break;
			default:
				System.out.println("Opção inválida!");
		}
		
	}
}
