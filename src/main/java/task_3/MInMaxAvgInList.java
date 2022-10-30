package task_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */


public class MInMaxAvgInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 0, 44, 16, 18, 100));

        float sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            sum += numbers.get(i);
            System.out.println(sum);
        }

        float avg = sum / numbers.size();

        System.out.printf("Минимальное значение: %d\n", Collections.min(numbers));
        System.out.printf("Максимальное значение: %d\n", Collections.max(numbers));
        System.out.printf("Среднее арифметическое: %f", avg);

    }
}
