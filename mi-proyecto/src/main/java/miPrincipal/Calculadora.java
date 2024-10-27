/**
 * Calculadora aritmetica básica que suma, resta, multiplica y divide dos números double.
 */
// Calculadora aritmetica básica que suma, resta, multiplica y divide dos números double

package miPrincipal;

public class Calculadora {

    /**
     * Suma dos números de punto flotante.
     *
     * @param a el primer número a sumar
     * @param b el segundo número a sumar
     * @return la suma de los dos números
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números de punto flotante.
     *
     * @param a el minuendo, un número de punto flotante.
     * @param b el sustraendo, un número de punto flotante.
     * @return la diferencia entre a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números de punto flotante.
     *
     * @param a el primer número a multiplicar
     * @param b el segundo número a multiplicar
     * @return el resultado de la multiplicación de a y b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números de punto flotante.
     *
     * @param a el dividendo
     * @param b el divisor
     * @return el resultado de la división de a entre b
     * @throws IllegalArgumentException si el divisor es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    /**
     * Calcula la función exponencial de un número de punto flotante.
     *
     * @param a el número para calcular la función exponencial
     * @return el resultado de la función exponencial de a
     */
    public double exponencial(double a) {
        return Math.exp(a);
    }
}
