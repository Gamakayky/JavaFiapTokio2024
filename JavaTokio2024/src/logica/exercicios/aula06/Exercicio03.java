package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
		deve calcular a média alcançada pelo aluno e apresentar:
		▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
		▪ A mensagem "Reprovado", se a média for menor que cinco.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota A: ");
		double notaA = sc.nextDouble();
		
		System.out.println("Digite a nota B");
		double notaB = sc.nextDouble();
		
		System.out.println("Digite a nota C");
		double notaC = sc.nextDouble();
		
		System.out.println("Digite a nota D");
		double notaD = sc.nextDouble();
		
		double media = (notaA + notaB + notaC + notaD) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5 && media < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
		
		sc.close();

	}

}
