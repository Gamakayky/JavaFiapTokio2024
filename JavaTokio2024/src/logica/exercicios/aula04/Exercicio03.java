package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("olá, " + nome);
		
		sc.close();
	
	}

}
