package ru.itpark;

import java.util.Scanner;

public class MainCharacterAnalyze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            System.out.println("Letter");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        }
    }
}
