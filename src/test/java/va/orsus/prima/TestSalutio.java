package va.orsus.prima;

import static org.junit.Assert.*;

import org.junit.Test;

import va.orsus.prima.Salutio;

public class TestSalutio {

	@Test
	public void testSalutio() {
		assertEquals(Salutio.getSalutio(), "Salve!");
	}

}
