package test.upc.pe;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import dev.upc.pe.Documento;
import dev.upc.pe.Estudiante;
import dev.upc.pe.Tutor;
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

	@Test
	public void testPublicarReseñiaNoInscrito() {
		Tutoria matediscreta = new Tutoria("matediscreta");
		Estudiante estudiante = new Estudiante("Marcelo", "garro");
		// El estudiante no se inscribio a la tutoria de mate discreta
		boolean resultado = estudiante.publicarResenia("matediscreta", "Me gusto este curso");
		assertTrue(!resultado);
	}

	@Test
	public void testSubirDocumentos() {
		Tutor tutor = new Tutor("Jorge", "admin");

		String nombreTutoria = "Patrones de software";
		Tutoria tutoria = new Tutoria(nombreTutoria);

		tutor.agregarCurso(tutoria);

		Documento documento1 = new Documento("Diagrama de clases", tutor);
		Documento documento2 = new Documento("Patrones de creacion", tutor);
		Documento documento3 = new Documento("Patrones de estructuracion", tutor);
		Documento documento4 = new Documento("Patrones de comportamiento", tutor);

		ArrayList<Documento> documentos = new ArrayList<>();
		documentos.add(documento1);
		documentos.add(documento2);
		documentos.add(documento3);
		documentos.add(documento4);

		boolean result = tutor.subirDocumentosTutoria("Patrones de software", documentos);
		assertTrue(result);
	}
	
	@Test
	public void testComprobarTamanioDocumentos() {
		Tutor tutor = new Tutor("Jorge", "admin");

		String nombreTutoria = "Patrones de software";
		Tutoria tutoria = new Tutoria(nombreTutoria);

		tutor.agregarCurso(tutoria);

		Documento documento1 = new Documento("Diagrama de clases", tutor);
		Documento documento2 = new Documento("Patrones de creacion", tutor);
		Documento documento3 = new Documento("Patrones de estructuracion", tutor);
		Documento documento4 = new Documento("Patrones de comportamiento", tutor);
		Documento documento5 = new Documento("Diagramas de flujo", tutor);

		ArrayList<Documento> documentos = new ArrayList<>();
		documentos.add(documento1);
		documentos.add(documento2);
		documentos.add(documento3);
		documentos.add(documento4);
		documentos.add(documento5);
		
		tutor.subirDocumentosTutoria("Patrones de software", documentos);
		System.out.println(tutoria.getDocumentos().size());
		assertTrue(tutoria.getDocumentos().size() == 5);
	}
}