package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba um número n
		▪ Exiba a tabuada deste número do 0 ao 25.
		▪ Utilize laços de repetição.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		int multi;
		
		System.out.println(" ");
		System.out.println("Tabuada do numero: " + n + ":");
		for (int i = 0; i <= 25; i++) {
			
			multi = n * i;
			System.out.println(n + "x" + i + ": " + multi);
		}
		
		sc.close();
		
	
		
		
		
		

	}

}
