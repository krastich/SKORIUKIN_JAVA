package ru.itpark;

public class MainProcedures {

    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 3, 5, 6};
        reverse(a);
        print(a);
    }
}
