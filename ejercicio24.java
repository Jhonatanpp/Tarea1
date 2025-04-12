import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Tiene dos soluciones: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Tiene una única solución: " + x);
        } else {
            System.out.println("No tiene soluciones reales.");
        }

        sc.close();
    }
}
