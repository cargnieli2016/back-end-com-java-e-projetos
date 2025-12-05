package Java.EstruturaRepeticaoWhileEDoWhile;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        do {
            System.out.println("Informe um nome: ");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;
        } while (true);

    }
}
