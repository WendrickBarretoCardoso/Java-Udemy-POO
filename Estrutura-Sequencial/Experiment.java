public class Experiment {
    public static void main(String[] args) {
        System.out.println("Teste 1(Int + Double): " + (10 + 10.5));
        System.out.println("Teste 2(Int + String): " + (10 + "10") + "\n\n");

        int x = 5;
        int y = 2;

        double resultado = x / y;
        double resultado2 = (double) x / y;

        System.out.println("Teste 3 part 1: " + resultado);
        System.out.println("Teste 3 part 2: " + resultado2);
    }
}
