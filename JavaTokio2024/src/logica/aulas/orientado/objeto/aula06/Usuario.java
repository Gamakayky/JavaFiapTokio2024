package logica.aulas.orientado.objeto.aula06;

import java.util.Iterator;
import java.util.List;

public class Usuario implements Comparable<Usuario> {
	private String nomeUsuario;
	private int idUsuario;
	private String senhaUsuario;

	public Usuario(String nomeUsuario, int idUsuario, String senhaUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.idUsuario = idUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	@Override
	public int compareTo(Usuario usuario) {
		if (this.getIdUsuario() < usuario.getIdUsuario()) {
			return -1;
		} else if (this.getIdUsuario() > usuario.getIdUsuario()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Nome : " + this.getNomeUsuario() + "\nId: " + this.getIdUsuario();
	}
	
	

}
