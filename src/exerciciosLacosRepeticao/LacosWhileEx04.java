package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosWhileEx04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, 
			genero, 
			areaDev, 
			devsBackend = 0, 
			mulheresFrontend = 0, 
			homensMaiores40Mobile = 0, 
			naoBinariosMenores30Fullstack = 0,
			totalRespostas = 0;
		
		double mediaIdade = 0;
			
		String continua = "s";
		
		while(continua.equalsIgnoreCase("s")) {
			System.out.println("digite a idade do colaborador: ");
			idade = leia.nextInt();
			mediaIdade += idade;
			
			System.out.println("digite o genero:\r\n"
					+ "1 – Mulher Cis\r\n"
					+ "2 – Homem Cis\r\n"
					+ "3 – Não Binário\r\n"
					+ "4 – Mulher Trans\r\n"
					+ "5 – Homem Trans\r\n"
					+ "6 – Outros\r\n");
			genero = leia.nextInt();
			
			System.out.println("Pessoa desenvolvedora:\r\n"
					+ "1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n");
			areaDev = leia.nextInt();
			if(areaDev == 1) {
				devsBackend += 1;
			} else if((genero == 1 || genero == 4) && areaDev == 2) {
				mulheresFrontend += 1;
			} else if((genero == 2 || genero == 5) && areaDev == 3 && idade > 40) {
				homensMaiores40Mobile += 1;
			} else if(genero == 3 && areaDev == 4 && idade < 30) {
				naoBinariosMenores30Fullstack += 1;
			}
			
			totalRespostas += 1;
			
			System.out.println("Deseja continuar e fazer a leitura de dados de um novo colaborador? S para SIM e N para NÃO");
			continua = leia.next();
		}
		
		leia.close();
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+devsBackend);
		System.out.println("Total de mulheres cis e trans desenvolvedoras frontend: "+mulheresFrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+homensMaiores40Mobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+naoBinariosMenores30Fullstack);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+totalRespostas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: "+mediaIdade/totalRespostas);
		
	}
}
