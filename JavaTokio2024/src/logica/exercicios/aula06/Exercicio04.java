package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numInt = sc.nextInt();
		
		System.out.println("Digite um numero inteiro: ");
		int numInt1 = sc.nextInt();
		
		if ((numInt % numInt1) == 0 || numInt1 % numInt == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();

	}

}
