package logica.aulas.orientado.objeto.aula06;

public class TesteFinally {

	public static void main(String[] args) {

		try {
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}

	}

}
