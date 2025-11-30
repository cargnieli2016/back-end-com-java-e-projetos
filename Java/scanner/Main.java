package Java.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Olá %s, sua idade é %d anos.%n", nome, age);
    }
}
