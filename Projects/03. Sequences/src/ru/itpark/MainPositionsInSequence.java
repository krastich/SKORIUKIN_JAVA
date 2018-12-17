package ru.itpark;

import java.util.Scanner;

public class MainPositionsInSequence {
    public static void main(String[] args) {
        // определить сумму чисел, которые
        // имеют четное вхождение
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int currentNumber = scanner.nextInt();
        int position = 0;
        while (currentNumber != -1) {
            if (position % 2 == 0) {
                sumOfNumbers = sumOfNumbers + currentNumber;
            }
            currentNumber = scanner.nextInt();
            position++;
        }
        System.out.println(sumOfNumbers);
    }
}
