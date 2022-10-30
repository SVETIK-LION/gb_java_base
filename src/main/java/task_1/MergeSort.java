package task_1;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 1, 0, 44, -4};
        toSeparate(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }


    private static void toSeparate(int[] array) {
        // Находим Длину и середину иходного массива
        // Создаем два массива для левой и правой частей
        int length_array = array.length;

        // Базовый случай (если длина массива равна 1)
        if (length_array == 1) {
            return;
        }

        int middle_array = length_array / 2;
        int [] left_array = new int[middle_array];
        int [] right_array = new int[length_array - middle_array];

        // В цикле при сваиваем левую половину исходного массива левому массиву
        for (int i = 0; i < middle_array; i++) {
            left_array[i] = array[i];
        }

        // То же самое с правым массивом
        for (int i = middle_array; i < length_array; i++) {
            right_array[i - middle_array] = array[i];
        }

        // Снова делим массивы, пока не останется по 1 элементу в массиве
        toSeparate(left_array);
        toSeparate(right_array);

        // Применяем функцию "склейки" массивов обратно
        toMerge(array, left_array, right_array);
    }

    private static void toMerge(int [] array, int [] left_array, int [] right_array) {
        // Длины левого и правого массивов
        int left_arr_length = left_array.length;
        int right_arr_length = right_array.length;

        // Индексы элементов из левого и правого и основного массивов
        int array_index = 0;
        int left_index = 0;
        int right_index = 0;

        // Пока не достигли конца массивов, сравниваем элемменты из левого и правого массивов
        // Меньший элемент записываем в результирующий массив, увеличиваем индексы
        while (left_index < left_arr_length && right_index < right_arr_length) {

            if (left_array[left_index] < right_array[right_index]) {
                array[array_index] = left_array[left_index];
                left_index++;
            } else {
                array[array_index] = right_array[right_index];
                right_index++;
            }
            array_index++;
        }

        // Если осталась часть левого или правого массива, то добавляем ее в основной массив
        for(int left_post_idx = left_index; left_post_idx < left_arr_length; left_post_idx++) {
            array[array_index++] = left_array[left_post_idx];
        }

        for(int right_post_idx = right_index; right_post_idx < right_arr_length; right_post_idx++) {
            array[array_index++] = right_array[right_post_idx];
        }
    }
}
