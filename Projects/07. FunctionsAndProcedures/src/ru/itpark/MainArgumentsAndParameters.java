package ru.itpark;

public class MainArgumentsAndParameters {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        swap(x, y);
        System.out.println(x + " " + y);
    }
}
