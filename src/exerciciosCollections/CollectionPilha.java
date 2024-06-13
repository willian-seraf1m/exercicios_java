package exerciciosCollections;

import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Stack<String> pilhaDelivros = new Stack<String>();

		int menu;

		System.out.println("Menu:"
				+ "\n1 - Adicionar Livros na Pilha"
				+ "\n2 - Listar todos os Livros"
				+ "\n3 - Retirar Livros da Pilha"
				+ "\n0 - Sair");

		do {
			System.out.println("\nDigite um número do menu: ");
			menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("\nDigite o nome: ");
				pilhaDelivros.push(scanner.nextLine());
				System.out.println("\nLivro adicionado");
				break;

			case 2:
				if(pilhaDelivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
					break;
				} else {
					System.out.println("\nLista de livros na pilha: ");
					for(String cliente : pilhaDelivros) System.out.println(cliente);
				}
				break;

			case 3:
				if(pilhaDelivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
					break;
				} else {
					pilhaDelivros.pop();
					System.out.println("\nPilha:");
					for(String cliente : pilhaDelivros) System.out.println(cliente);
					System.out.println("\nO livro foi removido!");
				}
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção inválida. Tente uma opção que está no menu!");
			}

		} while(menu != 0);
		
		scanner.close();
	}
}
