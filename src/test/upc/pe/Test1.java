package test.upc.pe;

import static org.junit.Assert.*;

import org.junit.Test;
import dev.upc.pe.*;

public class Test1 {
	Calculadora calc = new Calculadora();
	

	@Test
	public void testSuma() {
		assertEquals(calc.suma(6, 6), 12, 0);
	}

	@Test
	public void testResta() {
		assertEquals(calc.resta(10, 6),4, 0);
	}

}
