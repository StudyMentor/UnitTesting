package test.upc.pe;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import dev.upc.pe.Estudiante;
import dev.upc.pe.Tutoria;

public class Test2 {
	Tutoria tutoria1 = new Tutoria();

	ArrayList<Tutoria> tutorias = new ArrayList<>();
	Tutoria matebasica = new Tutoria("matebasica");
	Tutoria calculo = new Tutoria("calculo");
	Tutoria calculo2 = new Tutoria("calculo2");
	Tutoria calculodiferencial = new Tutoria("calculodiferencial");
	Tutoria matediscreta = new Tutoria("matediscreta");
	Tutoria matecomputacional = new Tutoria("matecomputacional");
	Tutoria fisica1 = new Tutoria("fisica1");
	Tutoria fisica2 = new Tutoria("fisica2");

	Estudiante estudiante1 = new Estudiante("Jorge", "123hdj");

	@Test
	public void testInscribirseTutoria() {
		assertTrue(estudiante1.inscribirseTutoria(tutoria1));
	}

	@Test
	public void testGenerarEnlace() {
		assertTrue(tutoria1.generarEnlace());
	}

	@Test
	public void testGenerarReunion() {
		assertTrue(tutoria1.generarReunion());
	}

	@Test
	public void testBusquedaTutoria() {
		tutorias.add(matebasica);
		tutorias.add(calculo);
		tutorias.add(calculo2);
		tutorias.add(calculodiferencial);
		tutorias.add(matediscreta);
		tutorias.add(matecomputacional);
		tutorias.add(fisica1);
		tutorias.add(fisica2);
		assertTrue(estudiante1.busquedaTutoria(tutorias, "matediscreta"));
	}

	@Test
	public void testPublicarReseñia() {
		Tutoria matebasica = new Tutoria("matebasica");
		estudiante1.inscribirseTutoria(matebasica);
		boolean resultado = estudiante1.publicarResenia("matebasica", "Esta materia es de la mejor");
		assertTrue(resultado);
	}
}
