public class ejercicio30 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
