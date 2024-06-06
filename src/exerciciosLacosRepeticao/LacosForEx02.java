package exerciciosLacosRepeticao;

/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
 * mostre na tela quantos números são pares e quantos número são ímpares
 */

import java.util.Scanner;

public class LacosForEx02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int numerosPares = 0;
		int numerosImpares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("digite o %d° número ", i);
			numero = leia.nextInt();
			
			if(i%2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		
		leia.close();
		
		System.out.printf("Total de numeros pares: %d \n", numerosPares);
		System.out.printf("Total de numeros ímpares: %d \n", numerosImpares);

	}
}
