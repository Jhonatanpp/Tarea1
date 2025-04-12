public class ejercicio16 {
    public static void main(String[] args) {
        long resultado = 1; // usamos long porque el número será grande
        for (int i = 1; i <= 20; i++) {
            resultado = resultado * i;
        }
        System.out.println("El producto de los primeros 20 números naturales es: " + resultado);
    }
}
