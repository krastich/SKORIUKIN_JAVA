package ru.itpark;

import java.util.Scanner;

public class MainSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitsSum = 0;
        int currentDigit;
        while (number != 0) {
            System.out.println("number = " + number);
            currentDigit = number % 10;
            System.out.println("current digit = " + currentDigit);
            digitsSum = digitsSum + currentDigit;
            System.out.println("digits sum = " + digitsSum);
            number = number / 10;
        }
    }
}
