package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
		seguinte critério, baseado no salário atual:
		▪ Salários até R$ 280,00 (incluindo): aumento de 20%.
		▪ Salários entre R$ 280,00 e R$ 700,00: aumento de 15%.
		▪ Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%.
		▪ Salários de R$ 1500,00 em diante: aumento de 5%.

		▪ Após o aumento ser realizado, informe na tela:
		▪ O salário antes do reajuste.
		▪ O percentual de aumento aplicado.
		▪ O valor do aumento.
		▪ O novo salário, após o aumento.
		 */
		/*
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu salario: ");
		double salarioAtual = sc.nextDouble();
		
	        double percentualAumento = 0.0;
	        double valorAumento = 0.0;
	        double novoSalario = 0.0;

	        if (salarioAtual <= 280.00) {
	            percentualAumento = 20.0;
	        } else if (salarioAtual <= 700.00) {
	            percentualAumento = 15.0;
	        } else if (salarioAtual <= 1500.00) {
	            percentualAumento = 10.0;
	        } else {
	            percentualAumento = 5.0;
	        }

	        valorAumento = salarioAtual * (percentualAumento / 100);
	        novoSalario = salarioAtual + valorAumento;

	        System.out.println("Salario antes do reajuste: R$ " + String.format("%.2f", salarioAtual));
	        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
	        System.out.println("Valor do aumento: R$ " + String.format("%.2f", valorAumento));
	        System.out.println("Novo salario, apos o aumento: R$ " + String.format("%.2f", novoSalario));

	        sc.close();
			*/
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o salario atual: ");
			double salarioAtual = sc.nextDouble();
			
			double reajuste;
			
			if (salarioAtual <= 280) {
				reajuste = 0.2;
			} else if (salarioAtual <= 700) {
				reajuste = 0.15;
			} else if (salarioAtual <= 1500) {
				reajuste = 0.10;
			} else {
				reajuste = 0.05;
			}
			
			System.out.println(reajuste);
			
			double valorAumento = salarioAtual * reajuste;
			
			System.out.println(valorAumento);
			
			double novoSalario = salarioAtual + valorAumento;
			
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("Percentual do aumento: " + reajuste*100 + "%");
			System.out.println("Valor do aumento: " + valorAumento);
			System.out.println("Novo salario com aumento: " + novoSalario);
			
			sc.close();
			
	}

}
