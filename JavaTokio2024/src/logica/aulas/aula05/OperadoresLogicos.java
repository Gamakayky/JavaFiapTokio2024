package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
//		LOGICA E (&&)
//		EMAIL	SENHA	LOGIN
//		TRUE	TRUE	TRUE
//		TRUE	FALSE	FALSE
//		FALSE	TRUE	FALSE
//		FALSE	FALSE	FALSE
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
//		LOGICA OU (||)
//		SOL	NO	DOM	JOGO BR		CHURRASCO	
//		TRUE		TRUE		TRUE
//		TRUE		FALSE		TRUE
//		FALSE		TRUE		TRUE
//		FALSE		FALSE		FALSE
		
		boolean logicaOU = false || false;
		System.out.println(logicaOU);
		
//		LOGICA DE NEGAÇÃO
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		
		
	}

}
