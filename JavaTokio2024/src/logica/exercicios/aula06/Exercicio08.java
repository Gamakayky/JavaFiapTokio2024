package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
		fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

		▪ Dê sua resposta em km por litro de combustível (km/Litro)

		▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
		▪ “Esse carro bebe hein!”
		▪ Senão, exiba a mensagem:
		▪ “Autonomia legal”
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida (em km): ");
		double distanciaTotal = sc.nextDouble();
		
		System.out.println("Digite o total de combustivel gasto (em litros): ");
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = distanciaTotal / combustivelGasto;

		System.out.println("Consumo medio do veículo: " + consumoMedio + " km/Litro");
		
		 if (consumoMedio < 8) {
	            System.out.println("Esse carro bebe hein!");
	        } else {
	            System.out.println("Autonomia legal");
	        }
		 
		 sc.close();
		 
	}

}
