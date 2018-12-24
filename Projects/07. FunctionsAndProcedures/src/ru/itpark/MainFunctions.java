package ru.itpark;

public class MainFunctions {

    public static int calcSumOfRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result = result + i;
        }
        return result;
    }

    public static int calcDigitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean isPrimeResult = isPrime(6);
        boolean isPrimeResult1 = isPrime(7);
        boolean isPrimeResult2 = isPrime(9);
        boolean isPrimeResult3 = isPrime(121);
        boolean isPrimeResult4 = isPrime(113);
        int digitsSum = calcDigitsSum(1324234);
        System.out.println(isPrimeResult);
        System.out.println(isPrimeResult1);
        System.out.println(isPrimeResult2);
        System.out.println(isPrimeResult3);
        System.out.println(isPrimeResult4);
        System.out.println(isPrime(111));
        System.out.println(calcDigitsSum(777));
        System.out.println(calcSumOfRange(1, 100));
    }
}
