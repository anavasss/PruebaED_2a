package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		String nombreEsperado = "";
		Persona persona = new Persona();
		assertEquals(nombreEsperado, persona.getNombre());
	}

}
