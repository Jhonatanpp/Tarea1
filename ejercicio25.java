public class ejercicio25 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // llamada recursiva
        }
    }

    public static void main(String[] args) {
        int numero = 5; // puedes cambiar el número aquí
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}