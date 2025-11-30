package Java.OperadoreAtribuicaoELogicos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Quanto é 2 + 2 ?
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2 ?");
        var result = scanner.nextInt();
        System.out.printf("O resultado é 4, você acertou? %s%n", result == 4);

        // Pode dirigir
        System.out.println("Quantos anos você tem ?");
        var age = scanner.nextInt();
        var canDrive = age >= 18;
        System.out.println("Você pode dirigir? " + canDrive);
    }

}
