package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Faça o cálculo contrário do último exercício (Exercício 10):
▪ Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em
anos, meses e dias. Também considere todo ano com 365 dias e todo mês com 30
dias. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias vividos: ");
		int idadeEmDias = sc.nextInt();
		
		// 9255
		// 25 anos
		// 4 meses
		// 10 dias
		
		int anos = idadeEmDias / 365;
		System.out.println(" ");
		System.out.println("Idade em anos: " + anos);
		
		int restoDeAno = idadeEmDias % 365;
		System.out.println("Exibindo o resto: " + restoDeAno);
		
		int meses = restoDeAno / 30; // 130 dividido por 30
		System.out.println("Meses: " + meses);
		
		int dias = restoDeAno % 30; // resto da divisão de 130 por 30
		System.out.println("Dias: " + dias);
		
		sc.close();

	}

}
