package logica.aulas.orientado.objeto.aula06;

public class Vetores {

	public static void main(String[] args) {

		int[] x = new int[100];
		lerVetor(x);
		imprimirVetor(x);
	}

	private static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}

	private static void imprimirVetor(int[] x) {
		for (int i : x) {
			System.out.println(i + "\t");
		}
	}

}
