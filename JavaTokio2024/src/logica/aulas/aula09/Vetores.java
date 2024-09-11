package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		// Lado esquerdo: declação do vetor de num inteiros
		// lado direito: instanciamos o vetor com 10 posições
		int [] vetorInteiros = new int[10];
		
		vetorInteiros[0] = 10; // colocando o valor 10 na posição 0 do vetor
		vetorInteiros[1] = 1999; // colocando valor 1999 na posição 1 do vetor
		
		System.out.println("Valor inteiro na posicao 0: " + vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1];
		System.out.println("Ano nascimento: " + anoNascimento);
		
		// acessando a posição via variável
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
		// ------------------------------------------------------------------------
		
		// Declarando uma lista de frutas com 4 posições
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta Pos 1: " + listaFrutas[1]);
		
		// OUTRO JEITO DE DECLARAR LISTAS!!!
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Pitaia", "Banana"};
		
		// listaFrutas2[0] = "Melancia"
		// listaFrutas2[1] = "Abacaxi"
		// listaFrutas2[2] = "Pitaia"
		// listaFrutas2[1] = "Banana"
		// listafrutas2.length = 4
		
		int qtdfrutas = listaFrutas2.length;
		System.out.println("Qtd de frutas: " + qtdfrutas);
		
		// FOR INDEXADO
		for (int i = 0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);			
		}
		
		// CRIAR UMA LISTA DE NUMEROS
		
		int [] numeros = {16, 24, 29, 33};
		
		// FOR EACH --> percorre a lista e acessa os valores das posições
		
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero	);
		}
		
		
	}

}