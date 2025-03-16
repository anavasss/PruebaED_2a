package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void test() {
		Curso curso = new Curso("Bases");
		assertEquals("Bases", curso.getNombre());
	}
	
	@Test
	void test2() {
		String nombreEsperado = "Entornos";
		Curso curso = new Curso("Entornos");
		assertEquals(curso.getNombre(), nombreEsperado);
	}

}
