package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * ▪ Faça um programa que exiba a mensagem “Olá, Mundo”.
		▪ Essa mensagem deverá ser exibida repetidamente.
		▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja
		exibir a mensagem novamente.
		▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.
		 */
		
int i = 0;
		
		while (i < 5) {
			System.out.println("Ola mundo " + i);
			i++;									
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String jogar = "sim";
		
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente? ");
			jogar = sc.nextLine();
		}
		
		sc.close();
	}

}
