package exerciciosLacosRepeticao;

/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até 
 * que o número zero seja digitado. Ao final, mostre na tela a média de todos
 * os números digitados, que sejam múltiplos de 3
 */

import java.util.Scanner;

public class LacosDoWhileEx06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		double somaNumerosMultiplosTres = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero%3 == 0) {
				somaNumerosMultiplosTres = somaNumerosMultiplosTres+numero;;
				contador++;
			}
			
		} while (numero != 0);
		
		leia.close();
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + somaNumerosMultiplosTres/(contador-1));
	}
}

