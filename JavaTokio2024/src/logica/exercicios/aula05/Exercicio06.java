package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/* Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o
		número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome de uma
		peça2, o número de peças2 e o valor unitário de cada peça2. Após, calcule e mostre o
		valor a ser pago.
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Digite o nome da peca 1: ");
		String peca1 = scanner.nextLine();
		
		System.out.println("Digite o numero de pecas 1: ");
		String numPeca1 = scanner.nextLine();
		
		System.out.println("Digite o valor da peca 1: ");
		String valorPeca1 = scanner.nextLine();
		
		System.out.println("Digite o nome da peca 2: ");
		String peca2 = scanner.nextLine();
		
		System.out.println("Digite o numero da pecas 2: ");
		String numPeca2 = scanner.nextLine();
		
		System.out.println("Digite o valor da peca2: ");
		String valorPeca2 = scanner.nextLine();
		
		
		double numPecaD1 = Double.parseDouble(numPeca1);
		double valorPecaD1 = Double.parseDouble(valorPeca1);
		double numPecaD2 = Double.parseDouble(numPeca2);
		double valorPecaD2 = Double.parseDouble(valorPeca2);
		
		double valorTotal;
		
		valorTotal = (numPecaD1 * valorPecaD1) + (numPecaD2 * valorPecaD2);
		System.out.printf("Valor total a ser pago: R$ %.2d%n ", valorTotal);
		
		*/
		
		// PEÇA 1 ---------------------------------------------
		System.out.print("Digite o nome da peca 1: ");
		String nomePeca1 = scanner.nextLine();
		
		System.out.print("Escolha a quantidade de pecas 1: ");
		//String qtdPecas1Str = scanner.nextLine();
		int qtdPecas1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("valor unitario de cada peca 1: ");
		//double valorPeca1 = scanner.nextDouble();
		double valorPeca1 = Double.parseDouble(scanner.nextLine());
		
		// PEÇA 2 ---------------------------------------------
		System.out.print("Digite o nome da peca 2: ");
		String nomePeca2 = scanner.nextLine();
		
		System.out.print("Escolha a quantidade de pecas 2: ");
		//int qtdPecas2 = scanner.nextInt();
		int qtdPecas2 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("valor unitario de cada peca 2: ");
		//double valorPeca2 = scanner.nextDouble();
		double valorPecas2 = Double.parseDouble(scanner.nextLine());
		
		//CALCULOS
		
		double valorPago1 = qtdPecas1 * valorPeca1;
		double valorPago2 = qtdPecas2 * valorPecas2;
		
		double valorTotal = valorPago1 + valorPago2;
		
		
		System.out.println();
		System.out.printf("valor a ser pago por %s: %.2f\n", nomePeca1, valorPago1);
		System.out.printf("valor a ser pago por %s: %.2f\n", nomePeca2, valorPago2);
		
		
		
		
		
		
		
		
		
		
	}

}
