package exerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
 * o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser 
 * finalizada ao digitar uma idade negativa 
 */

public class LacosWhileEx03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
		int idade = 0;
		int menor21 = 0;
		int maior50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menor21++;
			} else if(idade >= 50) {
				maior50++;
			}
		}
		leia.close();
		
		System.out.println("Total de pessoa menores de 21 anos: "+menor21);
		System.out.println("Total de pessoa maiore de 50 anos: "+maior50);
	}
}
