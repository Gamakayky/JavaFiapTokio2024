package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {
		
//		Elabore um programa que declare um número inteiro, float e double.
//		▪ Atribua valores à essas 3 variáveis.
//		▪ Exiba no terminal os 3 valores como números.

//		▪ Agora, converta esses 3 números para String e exiba novamente.
		
		float preco1 = 9.90f;
		System.out.println(preco1);
		
		double preco2 = 15.90;
		System.out.println(preco2);
		
		int preco3 = 10;
		System.out.println(preco3);
		
		String precoStr = Float.toString(preco1);
		System.out.println(precoStr);
		
		String precoStr2 = Double.toString(preco2);
		System.out.println(precoStr2);
		
		String precoStr3 = Integer.toString(preco3);
		System.out.println(precoStr3);
		
		int numInt = 2;
		float numFloat = 2.5f;
		double numDouble = 5.0;
		
		System.out.printf("%d %.2f %.2f \n", numInt, numFloat, numDouble);
		
		String numIntString = Integer.toString(numInt);
		String numFloatString = Float.toString(numFloat);
		String numDoubleString = Double.toString(numDouble);
		
		System.out.printf("%s %s %s", numIntString, numFloatString, numDoubleString);
		
		
		
		
		
		
	}

}
