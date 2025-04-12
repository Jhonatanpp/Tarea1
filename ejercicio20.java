import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        System.out.print("Introduce la anchura del rectángulo: ");
        double anchura = sc.nextDouble();

        double area = altura * anchura;
        System.out.println("El área del rectángulo es: " + area);
        sc.close();
    }
}
