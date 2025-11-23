package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffPlusDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double SumAllOperations(double first, double second) {
        return sum(sum(first, second), multiply(first, second))
                + sum(difference(first, second), division(first, second));

    }

    public static void main(String[] args) {
        System.out.println("Сумма разности двух чисел и деления двух чисел равна: " + diffPlusDivision(10, 20));
        System.out.println("Сумму всех четырех операций из класса : " + SumAllOperations(10, 20));
    }
}
