package exercicios;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite sua nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua nota 4:");
		nota4 = leia.nextFloat();
		leia.close();
		
		float mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("Sua média foi: %.1f", mediaNotas);
	}
}
