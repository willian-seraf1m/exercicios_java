package exerciciosCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int menu;

		System.out.println("Menu:"
				+ "\n1 - Adicionar Clientes na Fila"
				+ "\n2 - Listar todos os Clientes"
				+ "\n3 - Retirar Clientes da Fila"
				+ "\n0 - Sair");

		do {
			System.out.println("\nDigite um número do menu: ");
			menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("\nDigite o nome: ");
				fila.add(scanner.nextLine());
				System.out.println("\nCliente adicionado!");
				break;

			case 2:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					break;
				} else {
					System.out.println("\nLista de clientes na fila: ");
					for(String cliente : fila) System.out.println(cliente);
				}
				break;

			case 3:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					break;
				} else {
					fila.poll();
					System.out.println("\nFila:");
					for(String cliente : fila) System.out.println(cliente);
					System.out.println("\nO cliente foi chamado!");
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
