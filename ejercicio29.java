import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe números (termina con Ctrl+D o Ctrl+Z):");

        while (sc.hasNextInt()) {
            int numero = sc.nextInt();
            System.out.println("Leído: " + numero);
        }

        sc.close();
        System.out.println("Fin de entrada.");
    }
}
