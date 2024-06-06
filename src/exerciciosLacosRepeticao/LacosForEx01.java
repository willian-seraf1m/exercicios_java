package exerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve
 * ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando 
 * que o intervalo é inválido e sair do programa. No intervalo informado, mostre na tela todes os
 * números que são múltiplos de 3 e 5.
*/

public class LacosForEx01 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero2 = leia.nextInt();
		leia.close();
		
		if(numero1 >= numero2) {
			System.out.println("Intervalo inválido!");
		} else {
			for(int i = numero1; i <= numero2; i++) {
				if(i%3 == 0 && i%5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
	}
}
