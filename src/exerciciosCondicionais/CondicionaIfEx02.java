package exerciciosCondicionais;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia um número inteiro via teclado
 * e mostre na tela uma mensagem indicando se este número é par ou ímpar 
 * e se o número é positivo ou negativo. Veja os exemplos abaixo:
 */

public class CondicionaIfEx02 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Escreva um numero");
		numero = leia.nextInt();
		leia.close();
		
		if(numero % 2 == 0 && numero >= 0) {
			System.out.printf("O número %d é PAR e é POSITIVO", numero);
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.printf("O número %d é PAR e é NEGATIVO", numero);
		} else if(numero % 2 != 0 && numero > 0) {
			System.out.printf("O número %d é ÍMPAR e é POSITIVO", numero);
		} else {
			System.out.printf("O número %d é ÍMPAR e é NEGATIVO", numero);
		}
	}
}