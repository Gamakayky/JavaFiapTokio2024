package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		 * ▪ Faça um programa que leia 2 valores inteiros (A e B).
		▪ A seguir, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são
		Múltiplos", indicando se os valores lidos são múltiplos entre si.

		Dica:
		▪ Como que eu sei que 2 números são ou não são múltiplos um do outro?
		▪ Conjunto dos Múltiplos de 2 = {2, 4, 6, 8, 10, ...}
		▪ Então se observa que os múltiplos de um número são divisíveis por esse número,
		então o resto dessa divisão será 0.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numInt = sc.nextInt();
		
		System.out.println("Digite um numero inteiro: ");
		int numInt1 = sc.nextInt();
		
		if (numInt % numInt1 == 0 || numInt1 % numInt == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();

	}

}
