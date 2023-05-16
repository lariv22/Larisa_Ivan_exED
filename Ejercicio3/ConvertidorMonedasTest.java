package entornos;
 
import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertidorMonedasTest {

	@Test
	public void testDolar2euro() {
		assertEquals(9.5, ConvertidorMonedas.dolar2euro(10.5), 0.1);
	}

	@Test
	public void testEuro2dolar() {
		assertEquals(22.2, ConvertidorMonedas.euro2dolar(20.30), 0.1);
	}
}
