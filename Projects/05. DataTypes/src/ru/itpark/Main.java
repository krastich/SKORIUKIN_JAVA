package ru.itpark;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int a[] = {4, -3, 7, 8};
        int b[] = a;

        b[1] = 777;
        System.out.println(a[1]);

        int c[] = new int[5];
    }
}
