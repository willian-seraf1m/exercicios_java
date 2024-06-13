package exerciciosCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionsListEx02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		int numberSearch;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numberSearch = scanner.nextInt();
		scanner.close();
		
		int numberSearchIndex = numbersList.indexOf(numberSearch);
		
		if(numbersList.contains(numberSearch)) {
			System.out.printf("O número %d está localizado na posição: %d", numberSearch, numberSearchIndex);
		} else {
			System.out.printf("O número %d não foi encontrado!", numberSearch);
		}
		
	}
}
