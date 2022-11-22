package task_3;


import java.util.Arrays;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

public class HeapSort {
    private static int LEFT(int i) {
        return 2 * i + 1;
    }

    private static int RIGHT(int i) {
        return 2 * i + 2;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void heap(int[] array, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);

        int large = i;

        if (left < size && array[left] > array[i]) {
            large = left;
        }

        if (right < size && array[right] > array[large]) {
            large = right;
        }

        if (large != i)
        {
            swap(array, i, large);
            heap(array, large, size);
        }
    }

    private static int pop(int[] array, int size) {
        if (size <= 0) {
            return -1;
        }

        int top = array[0];

        array[0] = array[size-1];

        heap(array, 0, size - 1);

        return top;
    }

    private static void heapSort(int[] array) {
        int n = array.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            heap(array, i--, n);
        }

        while (n > 0)
        {
            array[n - 1] = pop(array, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 0, 7, -4, 4, 444, 4, 11, -10, 16, 25};

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
