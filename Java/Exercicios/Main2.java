package Java.Exercicios;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        var keepverify = true;
        while (keepverify) {
            System.out.println("Informe o número para verificação: ");
            var toverify = scanner.nextInt();
            if (toverify < number) {
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }
            var result = toverify % number;
            keepverify = toverify % number == 0;
            System.out.printf("%s %% %s = %s\n", toverify, number, result);
        }

    }
}
