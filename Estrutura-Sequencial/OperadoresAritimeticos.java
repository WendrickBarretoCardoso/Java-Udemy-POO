public class OperadoresAritimeticos {
    public static void main(String[] args) throws Exception {
        //  +     =     ADIÇÃO
        System.out.println("Adição: " + (5+5));
        //  -     =     SUBTRAÇÃO
        System.out.println("Subtração: " + (5-5));
        //  +     =     DIVISÃO
        System.out.println("Divisão: " + (5/5));
        //  +     =     MULTIPLICAÇÃO
        System.out.println("Multiplicação: " + (5*5));

        // ORDEM  DAS EXPRESSÕES
        System.out.println("Ordem 1 (10+5+6*5): " + (10+5+6*5));
        System.out.println("Ordem 2 (10+(5+6)*5): " + (10+(5+6)*5));
    }
}
