package exercicios;

import java.util.Scanner;

public class SalárioFinal {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		
		System.out.println("Digite seu salário:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono:");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("o seu salário final é de: R$ %.2f", novoSalario);
	}
}
