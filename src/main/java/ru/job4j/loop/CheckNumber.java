package ru.job4j.loop;

public class CheckNumber {
    public static boolean check(int number) {
        int middleValue = 0;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                middleValue++;
                break;
            }
        }
        return middleValue == 0;
    }
}

