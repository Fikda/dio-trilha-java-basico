public class TiposVariaveis {
    public static void main(String[] args) {

        int numero = 5;
        numero = 10;

        final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 3.15; // Quando tem final, significa que o valor é imutável, além de
        // identificar com o nome em letra maiúscula.

        System.out.println("Hello world! " + numero);
    }
}