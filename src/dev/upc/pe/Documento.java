package dev.upc.pe;

public class Documento {
	private String nombre;
	private Tutor autor;

	public Documento(String nombre, Tutor autor) {
		super();
		this.nombre = nombre;
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tutor getAutor() {
		return autor;
	}

	public void setAutor(Tutor autor) {
		this.autor = autor;
	}
}
