package exerciciosArraysMatrizes;

public class MatrizesEx03 {

	public static void main(String[] args) {
		double notasBimestrais[][] = {
				{ 4.0, 5.0, 7.0, 3.0 },
				{ 2.5, 6.5, 4.7, 8.0 }, 
				{ 10.0, 8.5, 9.5, 8.0 },
				{ 9.0, 6.5, 7.6, 8.2 },
				{ 5.0, 5.0, 5.0, 6.3 },
				{ 7.0, 8.0, 9.0, 8.5 },
				{ 5.5, 3.5, 2.5, 1.0 },
				{ 8.0, 9.0, 10.0, 9.5 },
				{ 5.6, 5.8, 6.5, 7.0 },
				{ 7.5, 8.5, 9.5, 10.0}};

		double somaNotas[] = new double[10];

		for(int linha=0; linha < 10; linha++) {
			for(int coluna=0; coluna < 4; coluna++) {
				somaNotas[linha] += notasBimestrais[linha][coluna];
			}
		}

		for(int i = 0; i < somaNotas.length; i++) {
			System.out.printf("A média do %d° aluno foi: %.1f \n",i+1, somaNotas[i]/4);
		}
	}
}
