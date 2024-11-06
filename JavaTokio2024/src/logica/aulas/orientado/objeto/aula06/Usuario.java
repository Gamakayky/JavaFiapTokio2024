package logica.aulas.orientado.objeto.aula06;

import java.util.Iterator;
import java.util.List;

public class Usuario implements Comparable<Usuario> {

	private int id;
	private String nome;
	private String senha;

	public Usuario(int id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int compareTo(Usuario o) {
		if (this.getId() < o.getId()) {
			return -1;
		}
		if (this.getId() > o.getId()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "nome : " + this.getId() + "\nId: " + this.getNome();

	}

	static public List<Usuario> remover(String nome) {
		List<Usuario> list = null;
		@SuppressWarnings("null")
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}

}
