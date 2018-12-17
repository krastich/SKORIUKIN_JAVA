package ru.itpark;

public class MainInitialize {
    public static void main(String[] args) {
        // с выделением памяти
        int a[] = new int[5];
        a[0] = 4;
        a[1] = 3;
        a[2] = 4;
        a[3] = 6;
        a[4] = 1;

        // явная инициализация
        int b[] = {4, 3, 4, 6, 1};
    }
}
