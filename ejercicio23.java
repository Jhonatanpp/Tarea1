import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int a = sc.nextInt();

        System.out.print("Escribe el segundo número: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El MCD es: " + a);
        sc.close();
    }
}