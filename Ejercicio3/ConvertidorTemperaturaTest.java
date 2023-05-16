package entornos;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertidorTemperaturaTest {

	@Test
	  public void testFahrenheitToCelsius() {
        assertEquals(4.4, ConvertidorTemperatura.fahrenheitToCelsius(40.0), 0.1);
        assertEquals(15.6, ConvertidorTemperatura.fahrenheitToCelsius(60.0), 0.1);
        assertEquals(26.7, ConvertidorTemperatura.fahrenheitToCelsius(80.0), 0.1);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(23.0, ConvertidorTemperatura.celsiusToFahrenheit(-5.0), 0.1);
        assertEquals(32.0, ConvertidorTemperatura.celsiusToFahrenheit(0.0), 0.1);
        assertEquals(59.0, ConvertidorTemperatura.celsiusToFahrenheit(15.0), 0.1);
    }
}
