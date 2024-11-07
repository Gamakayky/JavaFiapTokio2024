package logica.aulas.orientado.objeto.aula06;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {

		int[][] x = new int[10][10];
		x = lerMatriz(x);
		imprimirMatriz(x);
	}

	private static int[][] lerMatriz(int[][] x) {
		Random random = new Random();
		for (int[] linha : x) {
			for (int conteudo : linha) {
				x[5][5] = conteudo = random.nextInt(101);
			}
		}
		return x;
	}

	private static void imprimirMatriz(int[][] x) {

		for (int[] linha : x) {
			System.out.println("\n");
			for (int conteudo : linha) {
				System.out.print(conteudo + "\t");
			}
		}
	}
}
