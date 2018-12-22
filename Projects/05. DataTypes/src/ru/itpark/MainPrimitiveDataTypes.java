package ru.itpark;

public class MainPrimitiveDataTypes {

    public static void main(String[] args) {
        // 1111111111111111111111111111111

        int intValue = 2147483647;
        intValue++;
        // 1111111111111111111111111111111
        System.out.println(intValue);

        long longValue = 2147483647;
        longValue++;
        System.out.println(longValue);

        // long -> int
        int oneMoreIntValue = (int)longValue;
        System.out.println(oneMoreIntValue);

        // int -> long
        long oneMoreLongValue = oneMoreIntValue;
        System.out.println(oneMoreLongValue);

    }
}
