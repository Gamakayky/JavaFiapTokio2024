package logica.aulas.orientado.objeto.aula06;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {

		int[][] Matriz = new int[10][10];
		lerMatrizes(Matriz);
		imprimirMatrizes(Matriz);

	}

	public static void lerMatrizes(int[][] x) {
		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++)
				x[i][j] = random.nextInt(101);
		}
	}

	public static void imprimirMatrizes(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");

			}
		}
	}
}
