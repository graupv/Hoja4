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
        Calculadora calc = Calculadora.getInstance();
        double res = calc.restar(1, 4);
        assertEquals(-3, res, 0);
    }

    @Test
    public void multiplicar() {
        Calculadora calc = Calculadora.getInstance();
        double res = calc.multiplicar(1, 4);
        assertEquals(4, res, 0);
    }

    @Test
    public void dividir() {
        Calculadora calc = Calculadora.getInstance();
        double res = calc.dividir(4, 1);
        assertEquals(4, res, 0);
    }
}