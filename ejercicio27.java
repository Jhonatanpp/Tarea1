import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;

        do {
            System.out.print("Escribe la temperatura en Fahrenheit (999 para salir): ");
            fahrenheit = sc.nextDouble();

            if (fahrenheit != 999) {
                double celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println("Equivale a " + celsius + " grados Celsius.");
            }

        } while (fahrenheit != 999);

        sc.close();
    }
}