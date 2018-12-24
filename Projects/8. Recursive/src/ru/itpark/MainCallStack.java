package ru.itpark;

public class MainCallStack {

    public static int y(int a, int b) {
        System.out.println("in Y with " + a + " " + b);
        int result = a + b;
        System.out.println("out from Y with " + result);
        return result;
    }

    public static int x(int a, int b) {
        System.out.println("in X with " + a + " " + b);
        int m = y(a + a, b + b);
        int n = y(a - b, b - a);
        int result = m + n;
        System.out.println("out from X with " + result);
        return result;
    }

    public static int f(int a, int b) {
        System.out.println("in F with " + a + " " + b);
        int m = x(a, b);
        int n = y(a, b);
        int result = y(m, n);
        System.out.println("out from F with " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(50, 100));
    }
}
