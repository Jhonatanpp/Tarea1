import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + (numero + i);
        }

        System.out.println("La suma de los 100 números siguientes es: " + suma);
        sc.close();
    }
}
