package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
		qual é a soma deles.
		*/
		
		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = scanner.nextInt();

			soma += valor;
		}

		scanner.close();

		System.out.println("A soma dos valores digitados e: " + soma);
	}

}
