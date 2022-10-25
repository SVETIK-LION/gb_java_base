package task_2;

import java.util.Scanner;

/** Вывести все простые числа от 1 до 1000 */
public class Main {
    public static void main(String[] args) {
        // System.out.printf("Числа от 1 до 1000: ");
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean flag = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(i);
            else
                flag = true;
        }
    }
}
