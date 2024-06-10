package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsListEx02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(2);
		numbersList.add(5);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(9);
		numbersList.add(7);
		numbersList.add(8);
		numbersList.add(10);
		numbersList.add(6);
		
		int numberSearch;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numberSearch = scanner.nextInt();
		scanner.close();
		
		if(numbersList.contains(numberSearch)) {
			System.out.printf("O número %d está localizado na posição: %d", numberSearch, numbersList.indexOf(numberSearch));
		} else {
			System.out.printf("O número %d não foi encontrado!", numberSearch);
		}
		
	}
}
