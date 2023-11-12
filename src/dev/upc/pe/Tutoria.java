package dev.upc.pe;

import java.util.ArrayList;

public class Tutoria {
	private Estudiante estudiante;
	private Tutor tutor;
	private int duracion;
	private Enlace grabacion;
	private Enlace reunion;
	private ArrayList<Documento> documentos;
	private Reseña reseña;
	private String nombre;
;

    public Tutoria() {
    }
    public Tutoria(String name){
    	this.nombre = name;
    }

    public boolean generarEnlace() {
    	if(this.grabacion == null) {
    		this.grabacion = Enlace.generarEnlaceConDatosAleatorios();
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean generarReunion() {
    	if(this.reunion == null) {
    		this.reunion = Enlace.generarEnlaceConDatosAleatorios();
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
    

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Enlace getGrabacion() {
		return grabacion;
	}

	public void setGrabacion(Enlace grabacion) {
		this.grabacion = grabacion;
	}

	public Enlace getReunion() {
		return reunion;
	}

	public void setReunion(Enlace reunion) {
		this.reunion = reunion;
	}

	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(ArrayList<Documento> documentos) {
		this.documentos = documentos;
	}

	public Reseña getReseña() {
		return reseña;
	}

	public void setReseña(Reseña reseña) {
		this.reseña = reseña;
	}



	public String getNombre() {
		return nombre;
	}


	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}