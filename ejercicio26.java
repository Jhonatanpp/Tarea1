import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int a = sc.nextInt();

        System.out.print("Escribe el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Escribe el tercer número: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        sc.close();
    }
}