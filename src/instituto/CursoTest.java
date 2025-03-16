package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void test() {
		Curso curso = new Curso("Alonso");
		assertEquals("Alonso", curso.getNombre());
	}

}
