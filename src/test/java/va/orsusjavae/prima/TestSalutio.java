package va.orsusjavae.prima;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalutio {

	@Test
	public void testSalutio() {
		assertEquals(Salutio.getSalutio(), "Salve!");
	}

}
