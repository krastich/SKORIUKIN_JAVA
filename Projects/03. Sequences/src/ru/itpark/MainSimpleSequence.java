package ru.itpark;

import java.util.Scanner;

public class MainSimpleSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        int currentNumber = scanner.nextInt();

        while (currentNumber != -1) {
            // число четное
            if (currentNumber % 2 == 0) {
                evenNumbersCount = evenNumbersCount + 1; // evenNumbersCount++
            } else {
                oddNumbersCount++;
            }
            currentNumber = scanner.nextInt();
        }
        System.out.println("Odd Number Count = " + oddNumbersCount);
        System.out.println("Even Number Count = " + evenNumbersCount);
    }
}
