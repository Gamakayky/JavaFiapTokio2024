package logica.aulas.aula07;
/*
import java.util.Scanner;
*/
public class WhileLaco {

	public static void main(String[] args) {
		
		/*
		int i = 0;
		
		while (i < 5) {
			System.out.println("Ola mundo " + i);
			i++;									
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String jogar = "sim";
		
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente? ");
			jogar = sc.nextLine();
		}
		*/
		
		// MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while (i < 10) {
			i++; // i = 1
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if ( i == 7) {
				break;
			}
			
			System.out.println("Produto " + i);
		}
		
		System.out.println("FIM");
		
		
		
	}

}
