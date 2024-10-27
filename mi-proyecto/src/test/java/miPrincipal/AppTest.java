package miPrincipal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final Calculadora c = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, c.sumar(2, 3));
        assertEquals(-1, c.sumar(2, -3));
        assertEquals(0, c.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        assertEquals(-1, c.restar(2, 3));
        assertEquals(5, c.restar(2, -3));
        assertEquals(0, c.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, c.multiplicar(2, 3));
        assertEquals(-6, c.multiplicar(2, -3));
        assertEquals(0, c.multiplicar(0, 0));
    }

    @Test
    public void testDividir() {
        assertEquals(2, c.dividir(6, 3));
        assertEquals(-2, c.dividir(6, -3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            c.dividir(6, 0);
        });
    }

    @Test
    public void testExponencial() {
        assertEquals(Math.exp(1), c.exponencial(1), 0.0001);
        assertEquals(Math.exp(0), c.exponencial(0), 0.0001);
        assertEquals(Math.exp(-1), c.exponencial(-1), 0.0001);
    }
}
