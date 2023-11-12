package dev.upc.pe;
import java.util.ArrayList;

public class Tutor extends Usuario {
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Tutoria> listaTutorias;
    private int rating;

    public Tutor(String usuario, String contraseña) {
        super(usuario, contraseña, 1);
        listaEstudiantes = new ArrayList<>();
        listaTutorias = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante);
    }

    public void agregarCurso(Tutoria curso) {
        // Codigo para agregar un curso al tutor
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