package Java.EstruturaCondicional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("%s, você tem %s anos e pode dirigir!! \n", name, age);
        } else {
            System.out.printf("%s, você não pode dirigir!!\n", name);
        }

        System.out.println("FIM!!");

    }
}
