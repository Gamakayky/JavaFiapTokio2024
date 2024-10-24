package logica.exercicios.revisao;

public class Exercicio03 {

	public static void main(String[] args) {

		double ouro = 4;
		double prata = 5;
		double bronze = 10;

		if (ouro > prata && ouro > bronze) {
			System.out.println("O ouro e o metal mais pesado.");
		} else if (prata > bronze) {
			System.out.println("A prata e o metal mais pesado.");
		} else {
			System.out.println("O bronze e o metal mais pesado.");
		}

	}

}
