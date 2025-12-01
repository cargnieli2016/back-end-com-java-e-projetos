package Java.OperadoresAritmeticos.Aritmeticos2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner =  new Scanner(System.in);
        System.out.println("Digite o valor para calcular a raiz quadrada: ");
        var value1 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));

        System.out.println("--------------------------------------");

        System.out.println("Digite o valor para calcular potência: ");
        var value2 = scanner.nextInt();
        System.out.printf("A potência de %s é %s\n", value2, Math.pow(value2, 2));
    }
}
