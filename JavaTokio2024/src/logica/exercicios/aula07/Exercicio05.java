package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe
		qual é o maior deles.
		*/
		
		Scanner scanner = new Scanner(System.in);

		int maiorValor = Integer.MIN_VALUE;

		for (int i = 1; i <= 12; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}
		}

		scanner.close();

		System.out.println("O maior valor digitado é: " + maiorValor);
	}

}


