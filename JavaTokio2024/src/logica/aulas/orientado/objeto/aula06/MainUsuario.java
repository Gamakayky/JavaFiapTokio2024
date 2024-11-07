package logica.aulas.orientado.objeto.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainUsuario {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("mateus", 9, "23456"));
		usuarios.add(new Usuario("maria", 13, "3453"));
		usuarios.add(new Usuario("gabriel", 5, "5645"));
		usuarios.add(new Usuario("kayky", 4, "ucgu75"));
		usuarios.add(new Usuario("guilherime", 3, "ucgu75"));

		Collections.sort(usuarios);

		remover("kayky", usuarios);

		usuarios.forEach(System.out::println);
		
		Map<String, Usuario> mapa = new HashMap<>();
		mapa.put("kayky", new Usuario("kayky", 4, "ucgu75"));
		mapa.put("maria", new Usuario("maria", 13, "u3453"));
		mapa.put("mateus", new Usuario("mateus", 9, "23456"));
		mapa.put("gabriel", new Usuario("gabriel", 5, "5645"));
		mapa.put("guilherme", new Usuario("guilherme", 3, "ucgu75"));
		
		System.out.println("");
		Usuario usuario = mapa.get("kayky");
		System.out.println(usuario.getNomeUsuario());
		
		
	}

	public static List<Usuario> remover(String nome, List<Usuario> usuarios) {
		Iterator<Usuario> iterator = usuarios.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNomeUsuario().equals(nome)) {
				iterator.remove();
			}
		}
		return usuarios;

	}
}
