package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Considere a = 5, b = 7, c = 4 e d = 8
		▪ Julgue verdadeiro ou falso as seguintes expressões:

		A. (a <= b) e (b < d)
		B. (a = b) ou (c != b)
		C. (d > a) e (c >= b)
		D. (a <= b) ou (c <= d)
		E. ((b > c) ou (c < a)) e (d <= b)
		 */
		
		int a = 5, b = 7, c = 4, d = 8;
		
		boolean resultadoA = (a <= b) && (b < d);
		boolean resultadoB = (a == b) || (c != b);
		boolean resultadoC = (d > a) && (c >= b);
		boolean resultadoD = (a <= b) || (c <= d);
		boolean resultadoE = ((b > c) || (c < a)) && (d <= b);
		
		 System.out.println("A. (a <= b) e (b < d): " + resultadoA);
	        System.out.println("B. (a == b) ou (c != b): " + resultadoB); // 
	        System.out.println("C. (d > a) e (c >= b): " + resultadoC);
	        System.out.println("D. (a <= b) ou (c <= d): " + resultadoD);
	        System.out.println("E. ((b > c) ou (c < a)) e (d <= b): " + resultadoE);
		
		
		
	}

}
