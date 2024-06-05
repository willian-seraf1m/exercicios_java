package exerciciosPraticos02;

import java.util.Scanner;

public class CondicionalSwitchEx02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome, cargo;
		int codigoDoCargo, porcentualReajuste;
		float salario;
		
		System.out.println("Nome do colaborador");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		codigoDoCargo = leia.nextInt();
		
		System.out.println("digite o sálario do colaborador: ");
		salario = leia.nextFloat();
		leia.close();
		
		switch(codigoDoCargo) {
			case 1:
				cargo = "Gerente";
				porcentualReajuste = 10;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			case 2:
				cargo = "Vendedor";
				porcentualReajuste = 7;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			case 3:
				cargo = "Supervisor";
				porcentualReajuste = 9;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			case 4:
				cargo = "Motorista";
				porcentualReajuste = 6;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			case 5:
				cargo = "Estoquista";
				porcentualReajuste = 5;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			case 6:
				cargo = "Técnico de TI";
				porcentualReajuste = 8;
				System.out.printf("%s. %s. Salário reajustado: R$ %.2f", nome, cargo, (salario + (salario*porcentualReajuste / 100)));
				break;
			default:
				System.out.println("código inválido. Tente um código de 1 a 6");
		}
	}
}
