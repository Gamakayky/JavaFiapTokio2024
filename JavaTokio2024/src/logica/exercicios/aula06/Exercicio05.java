package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo que recebe dois números e um caractere (representando uma
		das operações matemáticas (+, -, *, /)
		▪ O programa deve calcular o valor final de acordo com a operação selecionada.
		▪ Ou seja, se a entrada for 5, 6 e *, então seu programa dever mostrar 30.

		▪ Dica: switch/case facilita as coisas.
		 */
		
		/*		 
			 Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("Escolha uma operação:");
	            System.out.println("1. Soma");
	            System.out.println("2. Subtração");
	            System.out.println("3. Multiplicação");
	            System.out.println("4. Divisão");
	            System.out.print("Digite o número da operação desejada: ");
	            int escolha = scanner.nextInt();

	            System.out.print("Digite o primeiro número: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Digite o segundo número: ");
	            double num2 = scanner.nextDouble();

	            double resultado = 0;

	            switch (escolha) {
	                case 1:
	                    resultado = num1 + num2;
	                    System.out.println("Resultado da soma: " + resultado);
	                    break;
	                case 2:
	                    resultado = num1 - num2;
	                    System.out.println("Resultado da subtração: " + resultado);
	                    break;
	                case 3:
	                    resultado = num1 * num2;
	                    System.out.println("Resultado da multiplicação: " + resultado);
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        resultado = num1 / num2;
	                        System.out.println("Resultado da divisão: " + resultado);
	                    } else {
	                        System.out.println("Erro: Divisão por zero não é permitida.");
	                    }
	                    break;
	                default:
	                    System.out.println("Escolha inválida. Por favor, escolha um número entre 1 e 4.");
	                    break;
	            }

	            System.out.print("Deseja realizar outra operação? (s/n): ");
	            char resposta = scanner.next().charAt(0);
	            if (resposta != 's' && resposta != 'S') {
	                continuar = false;
	            }
	        }

	        System.out.println("Programa encerrado.");
	        scanner.close();
			*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double n2 = sc.nextDouble();

		System.out.println("Digite o caracter da operacao [+, -, *, /]: ");
		char operacao = sc.next().charAt(0);

		System.out.println("Primeiro numero: " + n1);
		System.out.println("Segundo numero: " + n2);
		System.out.println("Operacao selecionada foi: " + operacao);

		double resultado = 0;

		switch (operacao) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			if (n2 != 0) {
				resultado = n1 / n2;
			} else {
				System.out.println("nao e possivel dividir por 0");
			}
			break;
		default:
			System.out.println("Operacao invalida");
		}

		System.out.println("Resultado: " + resultado);
		
		sc.close();

	}

}
