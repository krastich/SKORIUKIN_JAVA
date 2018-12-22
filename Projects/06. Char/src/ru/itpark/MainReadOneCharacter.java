package ru.itpark;

import java.util.Scanner;

public class MainReadOneCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println(++c);

    }
}
