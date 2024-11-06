package logica.aulas.orientado.objeto.aula06;

public class ForEach {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		lerArray(numeros);

	}

	public static void lerArray(int[] x) {

		for (int numero : x) {
			System.out.print(numero + "\t");
		}
	}

}
