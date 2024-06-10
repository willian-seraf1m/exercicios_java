package exerciciosCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetEx03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> numbersList = new HashSet<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d° número: ", i);
			numbersList.add(scanner.nextInt());
		}
		scanner.close();
		
		System.out.println("\nListar dados do Set: ");
		
		Iterator<Integer> iNumbersList = numbersList.iterator();
		
		while(iNumbersList.hasNext()) {
			System.out.println(iNumbersList.next());
		}
	}
}
