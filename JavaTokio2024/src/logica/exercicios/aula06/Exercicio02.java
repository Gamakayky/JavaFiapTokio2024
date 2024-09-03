package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else if (num1 == num2) {
			System.out.println("os numeros sao iguais");
		}
		
		sc.close();

	}

}
