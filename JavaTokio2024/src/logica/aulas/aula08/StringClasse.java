package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		String str = "Fiap Paulista";
		
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr);
		
		System.out.println(str.charAt(6));
		
		System.out.println("------------");
		
		for (int i = 0; i < tamanhoStr; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
