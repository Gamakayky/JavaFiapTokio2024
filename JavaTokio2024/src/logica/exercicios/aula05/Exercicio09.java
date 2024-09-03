package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um programa no qual o usuário entre com um número.
▪ Após isso seu script deverá exibir o número digitado e sua respectiva separação em
centena, dezena e unidade.
▪ Exemplo: se o usuário digitar o número 729, deverá ser exibido na tela:
▪ Centena = 700
▪ Dezena = 20
▪ Unidade = 9

▪ Obs.: considere que o usuário irá digitar números somente até 999.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero (0-999): ");
		int numero = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("Valor digitado: " + numero);
		
		int centena = (numero / 100) * 100;
		System.out.println("Centena: " + centena);
		
		int restoCentena = numero - centena;
		
		int dezena = (restoCentena / 10) * 10;
		System.out.println("Dezena: " + dezena);
		
		int unidade = restoCentena - dezena;
		System.out.println("Unidade: " + unidade);
		
		sc.close();
		
		
		
		
		

	}

}









