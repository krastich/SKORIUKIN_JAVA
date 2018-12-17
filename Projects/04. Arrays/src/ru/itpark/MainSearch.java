package ru.itpark;

import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) {
        int array[] = {3, 5, 10, -1, 34, 50, 11};

        Scanner scanner = new Scanner(System.in);

        int forSearchNumber = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == forSearchNumber) {
                position = i;
            }
        }

        System.out.println(position);
    }
}
