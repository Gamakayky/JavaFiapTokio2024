package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Digite sua primeira nota: ");
//		String nota1 = sc.nextLine();
		
//		System.out.println("Digite sua segunda nota: ");
//		String nota2 = sc.nextLine();
	
	Scanner entrada = new Scanner(System.in);// cria um objeto scanner      
	 
    /*float nota1, nota2, media;
     
     
    System.out.println("Digite a primeira nota: ");
    nota1 = entrada.nextFloat();
     
 
    System.out.println("Digite a segunda nota: ");
    nota2 = entrada.nextFloat();
     
     
    System.out.println("Digite a segunda nota: ");
    media = ((nota1*4) +(nota2*6)) /10;

    System.out.printf("A media do aluno e: %10.2f", media);
    
    entrada.close();
		*/
		
		System.out.println("Digite a nota A: ");
		double notaA = entrada.nextDouble();
		
		System.out.println("Digite a nota B: ");
		double notaB = entrada.nextDouble();
		
		double mediaPonderada = (notaA *0.4) + (notaB * 0.6);
		
		System.out.println("media ponderada: " + mediaPonderada);
		
		entrada.close();
		
	
	}

}
