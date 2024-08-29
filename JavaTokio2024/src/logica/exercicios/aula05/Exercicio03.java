package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*Elabore um programa que receba o nome do usuário e o seu gênero da seguinte
		forma:
		▪ [ M ] para masculino
		▪ [ F ] para feminino
		▪ [ O ] outro
		▪ [ N ] não responder

		▪ Exiba uma mensagem final da seguinte forma:
		▪ “Olá, Alexandre! Você escolheu a seguinte opção de gênero: M”
		▪ Dica: utilize o tipo char para o gênero.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu genero: \n M = Masculino \n F = feminino \n O = Outro \n N = Nao responder" );
		
		char generos;
		generos = 'M' + 'F' + 'O' + 'N';
		generos = sc.next().charAt(0);
		
		System.out.println("ola, " + nome + " Voce escolheu a seguinte opcao de genero: " + generos);
		
		sc.close();
		*/
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Selecione o seu genero da seguinte forma: ");
		System.out.println("[M] - Masc");
		System.out.println("[F] - Fem");
		System.out.println("[O] - Outro");
		System.out.println("[N] - N responder");
		
		char genero = sc.nextLine().charAt(0);
		
		System.out.printf("Ola, %s! voce escolheu a seguinte opcao de genero: %s", nome, genero);
		
		sc.close();
	}

}
