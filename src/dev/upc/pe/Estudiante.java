package dev.upc.pe;
import java.util.ArrayList;

public class Estudiante extends Usuario {
    private ArrayList<Tutoria> tutoresInscritos;
    private ArrayList<Tutor> tutoriasInscritas;

    public Estudiante(String usuario, String contrase�a) {
        super(usuario, contrase�a, 2);
        tutoresInscritos = new ArrayList<>();
        setTutoriasInscritas(new ArrayList<>());
    }
    
    public boolean inscribirseTutoria(Tutoria tutoria) {
    	if(tutoria != null ) {
    		tutoresInscritos.add(tutoria);
        	return true;
    	}
    	return false;
    }

    public void publicarRese�a() {
    	
    }
    
    public boolean busquedaTutoria(ArrayList<Tutoria> tutorias, String name) {
    	boolean auxEncontrado = false;
    	for(Tutoria tutoria: tutorias) {
    		if(tutoria.getNombre()==name) {
    			auxEncontrado = true;
    			continue;
    		}
    	}
		return auxEncontrado;
    	
    }

	public ArrayList<Tutor> getTutoriasInscritas() {
		return tutoriasInscritas;
	}

	public void setTutoriasInscritas(ArrayList<Tutor> tutoriasInscritas) {
		this.tutoriasInscritas = tutoriasInscritas;
	}
}