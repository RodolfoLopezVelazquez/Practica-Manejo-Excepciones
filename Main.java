import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        try {
            char caracter = CadenaUtil.caracterEn(cadena, 6);//empieza en la posicion 6 porque cuenta desde el 0
            System.out.println("Caracter en la posición 7: " + caracter);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }
}
