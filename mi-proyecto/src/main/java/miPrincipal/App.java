// Programa principal para mostrar como funciona la Calcualador aritmetica

package miPrincipal;

public class App {
    public static void main(String[] args) {
// Crear un objeto de la clase Calculadora
        Calculadora calc = new Calculadora();

        // Realizar operaciones aritmeticas
        performArithmeticOperations(calc);
    }

    private static void performArithmeticOperations(Calculadora calc) {
        // Realizar operaciones aritmeticas
                double a = 10;
                double b = 5;
                System.out.println("Suma: " + calc.sumar(a, b));
                System.out.println("Resta: " + calc.restar(a, b));
                System.out.println("Multiplicación: " + calc.multiplicar(a, b));
                System.out.println("División: " + calc.dividir(a, b));
    }
}