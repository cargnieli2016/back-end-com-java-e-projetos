package Java.OperadoresAritmeticos.Decremento;

public class Main {
    public static void main(String[] args) {
        var value = 50;
        System.out.println(--value);
        System.out.println(value);

        System.out.println("=== Pós decremento === ");
        System.out.println(10 + value--);
        System.out.println(10 + value);

    }
}
