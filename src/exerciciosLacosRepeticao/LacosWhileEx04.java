package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosWhileEx04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//váriaveis de respostas
		int age, 
			gender, 
			areaDev;
		
		//váriaveis de contagem
		int	devsBackend = 0, 
			frontendWomen = 0, 
			mobileMen40 = 0, 
			fullstackNotBinaryUnder30 = 0,
			totalResponses = 0;
		
		double sumAges = 0;
			
		String continueSearch = "s";
		
		while(continueSearch.equalsIgnoreCase("s")) {
			System.out.println("digite a idade do colaborador: ");
			age = leia.nextInt();
			sumAges += age;
			
			System.out.println("digite o genero:\r\n"
					+ "1 – Mulher Cis\r\n"
					+ "2 – Homem Cis\r\n"
					+ "3 – Não Binário\r\n"
					+ "4 – Mulher Trans\r\n"
					+ "5 – Homem Trans\r\n"
					+ "6 – Outros\r\n");
			gender = leia.nextInt();
			
			System.out.println("Pessoa desenvolvedora:\r\n"
					+ "1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n");
			areaDev = leia.nextInt();
			if(areaDev == 1) devsBackend += 1;
			if((gender == 1 || gender == 4) && areaDev == 2) frontendWomen += 1;
			if((gender == 2 || gender == 5) && areaDev == 3 && age > 40) mobileMen40 += 1;
			if(gender == 3 && areaDev == 4 && age < 30) fullstackNotBinaryUnder30 += 1;
			
			totalResponses += 1;
			
			System.out.println("Deseja continuar e fazer a leitura de dados de um novo colaborador? S para SIM e N para NÃO");
			continueSearch = leia.next();
		}
		
		leia.close();
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+devsBackend);
		System.out.println("Total de mulheres cis e trans desenvolvedoras frontend: "+frontendWomen);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+mobileMen40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+fullstackNotBinaryUnder30);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+totalResponses);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: "+sumAges/totalResponses);
		
	}
}
