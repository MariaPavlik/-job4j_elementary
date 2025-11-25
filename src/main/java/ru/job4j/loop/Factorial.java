package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        return factorial;
    }
}
