package logica.exercicios.revisao;

public class Exercicio05 {

	public static void main(String[] args) {

		String nome = "ADMINISTRADOR";
		int senha = 123;

		if (nome.equalsIgnoreCase("administrador") && senha == 123) {
			System.out.println("logado");
		} else {
			System.out.println("Usuario ou senha invalido");
		}

	}

}
