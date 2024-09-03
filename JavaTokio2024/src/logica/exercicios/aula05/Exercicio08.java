package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Montar um script onde o usuário entre com o valor em Reais e faça a sua respectiva
conversão para:
▪ Dólar Americano – Euro - Peso Argentino - Libra Esterlina - Iene
▪ Exibir na tela todos os valores obtidos com apenas 02 casas decimais.
▪ Valor em real:
▪ Valor em dólar:
▪ Valor em euro:
▪ ...
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		double reais = sc.nextDouble()
;
		
		System.out.println("valor em real: " + reais);
		
		double dolarAmericano = reais / 5.64;
		System.out.println("valor em dolar: " +dolarAmericano);
		
		sc.close();
	}

}
