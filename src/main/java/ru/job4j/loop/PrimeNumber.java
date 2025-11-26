package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        if (finish < 2)
            return (0);
        for (int index = 2; index <= finish; index++) {
            if (check(index)) {
                count++;
            }
        }
        return count;
    }

    public static boolean check(int number) {
        int noSimple = 0;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                noSimple++;
                break;
            }
        }
        return noSimple == 0;
    }

}