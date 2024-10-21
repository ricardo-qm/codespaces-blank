// Pruebas unitarias para una clase Calculadora que se encuentra en el paquete miPrincipal
// Calcualadora.java realiza operaciones aritméticas básicas

package miPrincipal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final Calculadora c = new Calculadora();

    // Crea una prueba unitaria para un metodo sumar en la clase Calculadora
    // Ejemplo : c.sumar(2, 3) debe devolver 5
    // Ejemplo : c.sumar(2, -3) debe devolver -1
    // Ejemplo : c.sumar(0, 0) debe devolver 0

    @Test
    public void testSumar() {
        assertEquals(5, c.sumar(2, 3));
        assertEquals(-1, c.sumar(2, -3));
        assertEquals(0, c.sumar(0, 0));
    }

    // Crea una prueba unitaria para un metodo restar en la clase Calculadora
    // Ejemplo : c.restar(2, 3) debe devolver -1    
    // Ejemplo : c.restar(2, -3) debe devolver 5    
    // Ejemplo : c.restar(0, 0) debe devolver 0

    @Test
    public void testRestar() {
        assertEquals(-1, c.restar(2, 3));
        assertEquals(5, c.restar(2, -3));
        assertEquals(0, c.restar(0, 0));
    }

    // Crea una prueba unitaria para un metodo multiplicar en la clase Calculadora
    // Ejemplo : c.multiplicar(2, 3) debe devolver 6    
    // Ejemplo : c.multiplicar(2, -3) debe devolver -6    
    // Ejemplo : c.multiplicar(0, 0) debe devolver 0

    @Test
    public void testMultiplicar() {
        assertEquals(6, c.multiplicar(2, 3));
        assertEquals(-6, c.multiplicar(2, -3));
        assertEquals(0, c.multiplicar(0, 0));
    }

    // Crea una prueba unitaria para un metodo dividir en la clase Calculadora
    // Ejemplo : c.dividir(6, 3) debe devolver 2    
    // Ejemplo : c.dividir(6, -3) debe devolver -2    

    @Test
    public void testDividir() {
        assertEquals(2, c.dividir(6, 3));
        assertEquals(-2, c.dividir(6, -3));
    }

    // Crea una prueba unitaria para un metodo dividir en la clase Calculadora  que genera la excepcion IllegalArgumentException
    // Ejemplo : c.dividir(6, 0) debe lanzar una excepcion IllegalArgumentException 

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            c.dividir(6, 0);
        });
    }
}
