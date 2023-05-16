package entornos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConvertidorMonedasTest.class, ConvertidorTemperaturaTest.class, ConvertirNumerosTest.class })
public class AllTests {
}
