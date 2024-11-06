package logica.aulas.orientado.objeto.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainUsuario {

	private static Usuario test;

	public static void main(String[] args) {

		List<Usuario> listaUsuarios = new ArrayList<>();

		listaUsuarios.add(new Usuario(10, "Kayky junior data science", "12345"));
		listaUsuarios.add(new Usuario(2, "matheus zumbi", "27842"));
		listaUsuarios.add(new Usuario(3, "maria do front", "48397"));
		listaUsuarios.add(new Usuario(4, "gabriel senior data science", "49384"));
		listaUsuarios.add(new Usuario(5, "guilherme zumbi 2.0", "49358"));

		Collections.sort(listaUsuarios);
		listaUsuarios.forEach(System.out::println);

		System.out.println("Id dos usuarios em ordem crescente: ");
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario.getId());
		}

		List<Usuario> listaAtualizada = Usuario.remover("kayky junior data science");
		for (Usuario usuario : listaAtualizada) {
			System.out.println(usuario.getNome());
		}

	}
}