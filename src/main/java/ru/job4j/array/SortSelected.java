package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int datum = 0; datum < data.length; datum++) {
            int min = MinDiapason.findMin(data, datum, data.length - 1);
            int index = FindLoop.indexInRange(data, min, datum, data.length - 1);
            SwitchArray.swap(data, index, datum);
        }
        return data;
    }
}