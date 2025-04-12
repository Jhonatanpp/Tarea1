import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        double tasaCambio = 1.08; // Puedes cambiar esto según el valor actual
        double dolares = euros * tasaCambio;

        System.out.println("Equivale a " + dolares + " dólares.");
        sc.close();
    }
}