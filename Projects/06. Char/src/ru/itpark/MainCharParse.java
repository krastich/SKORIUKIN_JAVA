package ru.itpark;

import java.util.Scanner;

public class MainCharParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char numberAsChar = scanner.nextLine().charAt(0);
        char numberAsChar2 = scanner.nextLine().charAt(0);
        int sumResult = numberAsChar + numberAsChar2;
        System.out.println(sumResult);

        // '5' -> 5
        int numberAsInt = (int)numberAsChar - '0';
        int numberAsInt2 = (int)numberAsChar2 - '0';
        sumResult = numberAsInt + numberAsInt2;
        System.out.println(sumResult);
    }
}
