package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que recebe:
		▪ o código do estado de origem da carga de um caminhão, supondo que é um número inteiro
		de 1 a 5
		▪ o peso da carga do caminhão em toneladas
		▪ o código da carga, supondo que é um número inteiro de 10 e 40

		▪ Seu programa deve calcular:
		▪ o peso da carga do caminhão convertido em quilos
		▪ o preço da carga do caminhão
		▪ valor do imposto que e cobrado com base no preço da carga e do estado de origem
		▪ o valor total transportado pelo caminhão (carga + impostos)
		 */
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o código do estado de origem da carga (1 a 5): ");
	        int codigoEstado = sc.nextInt();

	        System.out.println("Digite o peso da carga do caminhão (em toneladas): ");
	        double pesoCargaToneladas = sc.nextDouble();

	        System.out.println("Digite o código da carga (entre 10 e 40): ");
	        int codigoCarga = sc.nextInt();

	        if (codigoEstado < 1 || codigoEstado > 5) {
	            System.out.println("Código do estado inválido.");
	            sc.close();
	            return;
	        }

	        if (codigoCarga < 10 || codigoCarga > 40) {
	            System.out.println("Código da carga inválido.");
	            sc.close();
	            return;
	        }
	        double pesoCargaQuilos = pesoCargaToneladas * 1000;

	        double precoCarga = codigoCarga * 10.0; 

	        double imposto = 0.0;
	        switch (codigoEstado) {
	            case 1:
	                imposto = precoCarga * 0.05; 
	                break;
	            case 2:
	                imposto = precoCarga * 0.10; 
	                break;
	            case 3:
	                imposto = precoCarga * 0.15; 
	                break;
	            case 4:
	                imposto = precoCarga * 0.20; 
	                break;
	            case 5:
	                imposto = precoCarga * 0.25; 
	                break;
	        }

	        double valorTotal = precoCarga + imposto;

	        System.out.println("Peso da carga (em quilos): " + String.format("%.2f", pesoCargaQuilos));
	        System.out.println("Preço da carga: R$ " + String.format("%.2f", precoCarga));
	        System.out.println("Valor do imposto: R$ " + String.format("%.2f", imposto));
	        System.out.println("Valor total transportado: R$ " + String.format("%.2f", valorTotal));

	        sc.close();
		
		
		
	}

}
