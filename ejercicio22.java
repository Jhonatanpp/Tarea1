import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número entero: ");
        int numero = sc.nextInt();

        System.out.println("Números impares menores que " + numero + ":");
        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}