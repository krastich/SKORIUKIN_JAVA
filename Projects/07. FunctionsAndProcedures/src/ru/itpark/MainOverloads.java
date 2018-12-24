package ru.itpark;

public class MainOverloads {

//    public static long sum(long a, int b) {
//        return a + b;
//    }

    public static int sum(long a, int b) {
     return (int)a + b;
    }

//    public static boolean sum(int a, int b) {
//        return true;
//    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return  a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(4L, 5));
        System.out.println(sum(3, 1, 1));
    }
}
