package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba o ano de nascimento da pessoa e retorne:
▪ Se o voto é obrigatório este ano;
▪ Se o voto é opcional este ano;
▪ Se o voto é proibido este ano.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		int anoNasc = sc.nextInt();
		
		int anoAtual = 2024;
		int idade = anoNasc - anoAtual;
		
		if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("voto opcional");
		} else if 
		
		
	}

}
