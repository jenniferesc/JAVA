package com.roche.vnv.first;

import javax.xml.transform.Result;
import java.util.Scanner;

public class FuncionExponencial {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base_number = readFrom(scanner, "Enter a base number");
        int exponent_number = readFrom(scanner, "Enter an exponent number");
        int result = 1;
        while (exponent_number > 0) {
            result = result*base_number;
            exponent_number = exponent_number-1;
        }
        System.out.println(result);
    }

    private static int readFrom(Scanner scanner, String inputMessage) {
        System.out.println(inputMessage);
        return scanner.nextInt();
    }

}
