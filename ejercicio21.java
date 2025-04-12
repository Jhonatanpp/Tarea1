import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Escribe el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num1 < num2) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        sc.close();
    }
}
