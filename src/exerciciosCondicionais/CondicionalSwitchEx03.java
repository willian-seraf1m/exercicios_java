package exerciciosCondicionais;

import java.util.Scanner;

public class CondicionalSwitchEx03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, resSoma;
		String operador;
		
		System.out.println("digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("digite o operador: ");
		operador = leia.next();
		leia.close();
		
		switch(operador) {
			case "+":
				resSoma = numero1+numero2;
				System.out.println(resSoma);
				break;
			case "-":
				resSoma = numero1-numero2;
				System.out.println(resSoma);
				break;
			case "*":
				resSoma = numero1*numero2;
				System.out.println(resSoma);
				break;
			case "/":
				resSoma = numero1/numero2;
				System.out.println(resSoma);
				break;
			default:
				System.out.println("Operação Inválida!");
		}
	}
}
