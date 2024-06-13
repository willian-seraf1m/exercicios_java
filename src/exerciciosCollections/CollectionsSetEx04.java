package exerciciosCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSetEx04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> setNumbers = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		int numberSearch;

		System.out.println("Digite o número que você deseja encontrar: ");
		numberSearch = scanner.nextInt();
		scanner.close();

		if(setNumbers.contains(numberSearch)) {
			System.out.printf("O número %d foi encontrado!", numberSearch);
		} else {
			System.out.printf("O número %d não foi encontrado!", numberSearch);
		}
	}
}
