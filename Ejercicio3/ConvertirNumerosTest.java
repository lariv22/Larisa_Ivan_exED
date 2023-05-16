package entornos;
 
import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertirNumerosTest {

	@Test
	public void testRoman2dec() {
		assertEquals(21, ConvertirNumeros.roman2dec("XXI"));
	}

	@Test
	public void testDec2rom() {
		assertEquals("MMXVI", ConvertirNumeros.dec2roman(2016));
	}
}
