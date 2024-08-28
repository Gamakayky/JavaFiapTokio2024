package logica.aulas.aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		
		System.out.println("Float: " + preco);
		System.out.println("Float 2: " + preco2);
		
		int precoInteiro = (int) 2.5;
		System.out.println("inteiro: " + precoInteiro);
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Digite um numero: ");
		int numeroInteiro = (int) sc.nextDouble();
		
		Integer numInteiroClass = numeroInteiro;
		
		
		System.out.println(numeroInteiro);
		System.out.println(numInteiroClass.getClass());
		
		sc.close();
		
	}

}
