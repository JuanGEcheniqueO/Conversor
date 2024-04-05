import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número binario de 16 dittos:");
        String binario = scanner.nextLine();

        if (binario.length() != 16 || !binario.matches("[01]+")) {
            System.out.println("El número binario ingresado no tiene 16 dígitos válidos.");
            return;
        }

        int decimal = Integer.parseInt(binario, 2);

        String octal = Integer.toOctalString(decimal);

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Número binario: " + binario);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}