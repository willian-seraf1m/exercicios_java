package exercicios;

import java.util.Scanner;

public class DiferencaDoProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
			float n1;
			float n2;
			float n3;
			float n4;
			
			System.out.println("Digite n1:");
			n1 = leia.nextFloat();
			
			System.out.println("Digite n2:");
			n2 = leia.nextFloat();
			
			System.out.println("Digite n3:");
			n3 = leia.nextFloat();
			
			System.out.println("Digite n4:");
			n4 = leia.nextFloat();
			leia.close();
			
			float calculoDaDiferenca = (n1*n2) - (n3*n4);
			System.out.printf("A diferença é %.1f", calculoDaDiferenca);
		}
}
