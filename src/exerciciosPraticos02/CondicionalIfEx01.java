package exerciciosPraticos02;
import java.util.Scanner;

/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
 * e imprima na tela se a soma de A + B é maior, menor ou igual a C.
 * */


public class CondicionalIfEx01 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = leia.nextInt();
		leia.close();
		
		int somaAB = a+b;
		
		if(somaAB == c) {
			System.out.println("A soma de A + B é igual ao valor de C");
		} else if(somaAB > c) {
			System.out.println("A soma de A + B é maior que o valor de C");
		} else {
			System.out.println("A soma de A + B é menor que o valor de C");
		}
	}
}
