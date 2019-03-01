package com.roche.vnv.first;

import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = readFrom(scanner, "Enter a number");
        while (Number > 20) {
            Number = Number -1;
            System.out.println("quedan "+(Number-20));
        }
        System.out.println("He salido del bucle");
    }
    private static int readFrom(Scanner scanner, String inputMessage) {
        System.out.println(inputMessage);
        return scanner.nextInt();
    }
}