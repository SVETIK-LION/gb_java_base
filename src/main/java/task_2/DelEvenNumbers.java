package task_2;

import java.util.ArrayList;
import java.util.Random;


/** Пусть дан произвольный список целых чисел. Удалить из него чётные числа. */


public class DelEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers_list = new ArrayList<>();
        ArrayList<Integer> new_numbers_list = new ArrayList<>();

        Random random_number = new Random();
        for (int i = 0; i < 20; i++){
            numbers_list.add(random_number.nextInt(100));
        }

        System.out.printf("Исходный список: %s\n", numbers_list);

        for (int i = 0; i <= numbers_list.size() - 1; i++) {
            int num = numbers_list.get(i);
            if (num % 2 != 0) {
                new_numbers_list.add(num);
            }
        }
        System.out.printf("Список нечетных значений: %s\n", new_numbers_list);
    }
}
