package exercicios;

import java.util.Scanner;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Digite seu Salário: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		leia.close();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		
		System.out.printf("Salário líquido: R$ %.2f", salarioLiquido);
	}
}
