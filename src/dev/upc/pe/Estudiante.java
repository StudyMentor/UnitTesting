package dev.upc.pe;

import java.util.ArrayList;

public class Estudiante extends Usuario {
	private ArrayList<Tutor> tutoresInscritos;
	private ArrayList<Tutoria> tutoriasInscritas;

	public Estudiante(String usuario, String contraseña) {
		super(usuario, contraseña, 2);
		this.tutoresInscritos = new ArrayList<>();
		this.tutoriasInscritas = new ArrayList<>();
	}

	public boolean inscribirseTutoria(Tutoria tutoria) {
		if (tutoria != null) {
			tutoriasInscritas.add(tutoria);
			return true;
		}
		return false;
	}

	public boolean publicarResenia(String nombreTutoria, String mensaje) {
		for (int i = 0; i < this.tutoriasInscritas.size(); i++) {
			if (nombreTutoria == this.tutoriasInscritas.get(i).getNombre()) {
				this.tutoriasInscritas.get(i).publicarReseña(mensaje);
				return true;
			}
		}
		return false;
	}

	public boolean busquedaTutoria(ArrayList<Tutoria> tutorias, String name) {
		boolean auxEncontrado = false;
		for (Tutoria tutoria : tutorias) {
			if (tutoria.getNombre() == name) {
				auxEncontrado = true;
				continue;
			}
		}
		return auxEncontrado;

	}

	public ArrayList<Tutoria> getTutoriasInscritas() {
		return this.tutoriasInscritas;
	}

	public void setTutoriasInscritas(ArrayList<Tutoria> tutoriasInscritas) {
		this.tutoriasInscritas = tutoriasInscritas;
	}
}