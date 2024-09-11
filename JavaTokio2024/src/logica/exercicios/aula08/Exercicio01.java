package logica.exercicios.aula08;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * ▪ Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com o
		nome dele:
		▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã
		▪ “Boa tarde, FULANO!” se for maior ou igual que 12h
		▪ “Boa noite, FULANO!” se for maior ou igual que 18h
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		LocalTime agora = LocalTime.now();
		int horaAtual = agora.getHour();
		
		if (horaAtual > 18) {
			System.out.println("Boa noite, " + nome + "!");
		} else if (horaAtual >= 12) {
			System.out.println("Boa tarde, " + nome + "!");
		} else {
			System.out.println("Bom dia, " + nome + "!");
		}
		
		sc.close();
		

	}

}
