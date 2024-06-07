package exerciciosArraysMatrizes;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numbersList[] = new int[10];
		int numbersListSum = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numbersList[i] = scanner.nextInt();
			numbersListSum += numbersList[i];
		}
		
		scanner.close();
		
		System.out.println("Elementos nos indices ímpares: ");
		for(int i=0; i < 10; i++) {
			if(i % 2 != 0) {
				System.out.println(numbersList[i]);
			}
		}
		
		System.out.println("Elementos pares: ");
		for(int i=0; i < 10; i++) {
			if(numbersList[i] % 2 == 0) {
				System.out.println(numbersList[i]);
			}
		}
		
		System.out.printf("Soma dos elementos do vetor: %d \n", numbersListSum);
		System.out.printf("Média dos elementos do vetor: %d \n", numbersListSum/10);
	}
}
