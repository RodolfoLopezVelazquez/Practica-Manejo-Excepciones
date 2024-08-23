import java.util.Scanner;

public class ProgramaExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor numérico: ");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("Número negativo introducido.");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada del número es: " + raiz);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
