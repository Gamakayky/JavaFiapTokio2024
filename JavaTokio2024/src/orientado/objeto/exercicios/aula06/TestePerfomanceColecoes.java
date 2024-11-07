package orientado.objeto.exercicios.aula06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestePerfomanceColecoes {

	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo + " ms");

	}

}
