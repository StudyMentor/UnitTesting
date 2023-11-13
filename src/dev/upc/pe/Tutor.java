package dev.upc.pe;

import java.util.ArrayList;

public class Tutor extends Usuario {
	private ArrayList<Estudiante> listaEstudiantes;
	private ArrayList<Tutoria> listaTutorias;
	private int rating;

	public Tutor(String usuario, String contraseña) {
		super(usuario, contraseña, 1);
		this.listaEstudiantes = new ArrayList<>();
		this.listaTutorias = new ArrayList<>();
	}

	public void agregarEstudiante(Estudiante estudiante) {
		this.listaEstudiantes.add(estudiante);
	}

	public void eliminarEstudiante(Estudiante estudiante) {
		this.listaEstudiantes.remove(estudiante);
	}

	public boolean subirDocumentosTutoria(String nombreTutoria, ArrayList<Documento> documentos) {
		for (int i = 0; i < this.listaTutorias.size(); i++) {
			if (nombreTutoria == this.listaTutorias.get(i).getNombre()) {
				this.listaTutorias.get(i).agregarDocumentos(documentos);
				return true;
			}
		}
		return false;
	}

	public void agregarCurso(Tutoria curso) {
		this.listaTutorias.add(curso);
	}

	public void eliminarCurso(Tutoria curso) {
		// Codigo para eliminar un curso del tutor
	}

	public ArrayList<Tutoria> getListaTutorias() {
		return listaTutorias;
	}

	public void setListaTutorias(ArrayList<Tutoria> listaTutorias) {
		this.listaTutorias = listaTutorias;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}