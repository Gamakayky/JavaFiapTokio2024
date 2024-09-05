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
			
			System.out.println("Origem/Estado da carga (1-5): ");
			int estado = sc.nextInt();
			
			System.out.println("Digite o peso do caminhao em toneladas: ");
			double pesoToneladas = sc.nextDouble();
			
			System.out.println("Codigo da carga (10-40): ");
			int codCarga = sc.nextInt();
			
			// COMEÇAR A REALIZAR OS CALCULOS
			
			// CONVERTENDO PARA KILOGRAMAS
			double pesoKg = pesoToneladas * 1000;
			
			double precoPorKg = 0;
			
			if (codCarga >= 10 && codCarga <= 20) {
				precoPorKg = 100;
			} else if (codCarga <= 30) {
				precoPorKg = 250;
			} else if (codCarga <= 40) {
				precoPorKg = 340;
			}
			
			// ESTOU VERFIFCANDO QUAL SERA A PORCENTAGEM DO IMPOSTO DE ACORDO COM O ESTADO DE ORIGEM
			double impostoPorcentagem = 0;
			
			if (estado == 1) {
				impostoPorcentagem = 0.35;
			} else if (estado == 2) {
				impostoPorcentagem = 0.25;
			} else if (estado == 3) {
				impostoPorcentagem = 0.15;
			} else if (estado == 4) {
				impostoPorcentagem = 0.05;
			} else if (estado == 5) {
				impostoPorcentagem = 0;
			}
			
			// CALCULAR O PREÇO DA CARGA
			double precoCarga = pesoKg * precoPorKg; // 1000 * 340 = 340.000
			
			// CALCULAR O VALOR DO IMPOSTO
			double imposto = precoCarga * impostoPorcentagem; // 340.000 * 0.05 = 17.000
			// CALCULAR O VALOR FINAL 
			double valorFinal = precoCarga + imposto; // 340.000 + 17.500 = 357.000
			
			System.out.println("Peso da carga em kg: " + pesoKg);
			System.out.println("Preco da carga em: " + precoCarga);
			System.out.println("Valor do imposto: " + imposto);
			System.out.println("Valor final: " + valorFinal);
			
			sc.close();
			
			
			
			
		
		
	}

}
