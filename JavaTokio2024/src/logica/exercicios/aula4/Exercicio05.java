package logica.exercicios.aula4;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Seu salario é: " + salario);
		
		sc.close();
	}

}
