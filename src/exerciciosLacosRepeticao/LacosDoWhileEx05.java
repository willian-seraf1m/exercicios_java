package exerciciosLacosRepeticao;

/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado, 
 * até que o número zero seja digitado. Ao final, mostre na tela a soma 
 * de todos os números digitados, que sejam positivos 
 */

import java.util.Scanner;

public class LacosDoWhileEx05 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int somaNumerosPositivos = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				somaNumerosPositivos = somaNumerosPositivos+numero;
			}
			
		} while (numero != 0);
		
		leia.close();
		
		System.out.printf("A soma dos números positivos é: %d", somaNumerosPositivos);
	}
}
