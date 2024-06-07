package exerciciosArraysMatrizes;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numberSearch;		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numberSearch = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == numberSearch) {
				System.out.printf("O número %d está localizado na posição: %d \n", numberSearch, i);
				return;
			}
		}
		
		System.out.printf("O numero %d não foi encontrado!", numberSearch);
	
	}
}
