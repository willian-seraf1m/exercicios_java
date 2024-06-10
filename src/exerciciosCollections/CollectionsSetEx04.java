package exerciciosCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSetEx04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> setNumbers = new HashSet<>();

		setNumbers.add(2);
		setNumbers.add(5);
		setNumbers.add(1);
		setNumbers.add(3);
		setNumbers.add(4);
		setNumbers.add(9);
		setNumbers.add(7);
		setNumbers.add(8);
		setNumbers.add(10);
		setNumbers.add(6);

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
