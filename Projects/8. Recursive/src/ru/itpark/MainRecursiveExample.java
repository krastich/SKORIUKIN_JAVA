package ru.itpark;

public class MainRecursiveExample {

    public static int fib(int n) {
        System.out.println("in fib with n = " + n);
        if (n == 0 || n == 1) {
            return n;
        }
        int result = fib(n - 1) + fib(n - 2);
        System.out.println("out from fib with result = " + result);
        return result;
    }

    public static int fact(int n) {
        System.out.println("in fact with n = " + n);
        if (n == 1) {
            System.out.println("out from fact with result = " + 1);
            return 1;
        }
        int result = fact(n - 1) * n;
        System.out.println("out from fact with result = " + result);
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(fact(5));
        System.out.println(fib(10));
    }
}
