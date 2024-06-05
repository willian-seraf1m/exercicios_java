package exerciciosPraticos02;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia 3 palavras (String), 
 * que definem as características de um tipo de animal possível segundo
 * o diagrama abaixo, que deve ser lido da esquerda para a direita.
 *
*/

public class CondicionalIfEx04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String palavra1;
		String palavra2;
		String palavra3;
		
		System.out.println("Escolha 'vertebrado' ou 'invertebrado': ");
		palavra1 = leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			System.out.println("Escolha 'Ave' ou 'Mamífero'");
			palavra2 = leia.nextLine();
			
			if(palavra2.equalsIgnoreCase("Ave")) {
				System.out.println("Escolha entre 'Carnívoro' ou 'Onívoro'");
				palavra3 = leia.nextLine();
				
					if(palavra3.equalsIgnoreCase("Carnívoro")) {
						System.out.println("Águia");
					} else if(palavra3.equalsIgnoreCase("Onívoro")) {
						System.out.println("Pomba");
				} else {
					System.out.println("opção invalida");
				}
				
			} else if(palavra2.equalsIgnoreCase("Mamífero")) {
				System.out.println("Escolha 'Onívoro' ou 'Herbívoro'");
				palavra3 = leia.nextLine();
				
				if(palavra3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else if(palavra3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("opção invalida");
				}
			} else {
				System.out.println("opção invalida");
			}
			
		} else if(palavra1.equalsIgnoreCase("invertebrado")) {
			System.out.println("Escolha 'Inseto' ou 'Anelídeo'");
			palavra2 = leia.nextLine();
			
			if(palavra2.equalsIgnoreCase("Inseto")) {
				System.out.println("Escolha entre 'Hematófago' ou 'Herbívoro'");
				palavra3 = leia.nextLine();
				
					if(palavra3.equalsIgnoreCase("Hematófago")) {
						System.out.println("Pulga");
					} else if(palavra3.equalsIgnoreCase("Herbívoro")) {
						System.out.println("Lagarta");
				} else {
					System.out.println("opção invalida");
				}
				
			} else if(palavra2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("Escolha 'Hematófago' ou 'Onívoro'");
				palavra3 = leia.nextLine();
				
				if(palavra3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else if(palavra3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("opção invalida");
				}
			} else {
				System.out.println("opção invalida");
			}
			
		} else {
			System.out.println("Opção inválida!");
		}
		
		leia.close();
	}
}
