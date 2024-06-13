package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
 * individualmente no ArrayList.
*/

public class CollectionListEx01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> colorsList = new ArrayList<String>();
		
		for(int i=1; i<=5; i++) {
			System.out.printf("Digite a %d° cor: ", i);
			colorsList.add(scanner.next());
		}
		scanner.close();
		
		System.out.println("\nCores digitadas: ");
		for(String color : colorsList) {
			System.out.println(color);
		}
		
		System.out.println("\nCores ordenadas: ");
		Collections.sort(colorsList);
		for(String color : colorsList) {
			System.out.println(color);
		}
	}
}
