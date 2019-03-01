package com.roche.vnv.first;

import java.util.Scanner;

public class Suma {

    public static void main (String [] args ){

        Scanner scanner = new Scanner(System.in);
        final int firstNumber = readFrom(scanner, "Enter first number");

        final int secondNumber = readFrom(scanner, "Enter second number");

        int suma = firstNumber + secondNumber;
        System.out.println("Result is: " + suma );

    }

    private static int readFrom(Scanner scanner, String inputMessage) {
        System.out.println(inputMessage);
        return scanner.nextInt();
    }
}
