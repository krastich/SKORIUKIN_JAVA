package ru.itpark;

import java.util.Scanner;

public class MainWorksWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i =0; i < 5; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
