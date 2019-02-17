package Test;

import Main.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sumar_test() {
        Calculadora calc = Calculadora.getInstance();
        double res = calc.sumar(1, 4);
        assertEquals(5, res, 0);
    }

    @Test
    public void restar() {
    }

    @Test
    public void multiplicar() {
    }

    @Test
    public void dividir() {
    }
}