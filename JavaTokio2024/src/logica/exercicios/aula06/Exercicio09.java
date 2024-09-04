package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		/*
		 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
		▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:



		Tipo cliente Valor do KW/h
		1 (residência) 0,60
		2 (comércio) 0,48
		3 (indústria) 1,29
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tipo de cliente (1 para residencia, 2 para comercio, 3 para industria): ");
        int tipoCliente = sc.nextInt();
        
        System.out.println("Digite o consumo de energia (em kWh): ");
        double consumoEnergia = sc.nextDouble();
        
        double tarifaPorKwh = 0.0;
        switch (tipoCliente) {
            case 1:
                tarifaPorKwh = 0.60; // Residência
                break;
            case 2:
                tarifaPorKwh = 0.48; // Comércio
                break;
            case 3:
                tarifaPorKwh = 1.29; // Indústria
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                sc.close();
                return; // Encerra o programa se o tipo de cliente for inválido
        }
        
        double valorConta = consumoEnergia * tarifaPorKwh;
        
        System.out.println("O valor da conta de luz é: R$ " + String.format("%.2f", valorConta));
        
        sc.close();
        
	}

}
