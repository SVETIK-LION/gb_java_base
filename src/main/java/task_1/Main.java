package com.svetik_lion;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */
public class Main {
    public static void main(String[] args) {
        // Запрашиваем конечное число у пользователя
        Scanner in = new Scanner(System.in);
        System.out.print("Введите конечное число n: ");
        int num = in.nextInt();

        int result_triangle = num * (num + 1) / 2;

        int result_factorial = 1;
        for (int i = 1; i <= num; i++) {
            result_factorial = result_factorial * i;

        }
        System.out.printf("Треугольное число числа %d = %d\n", num, result_triangle);
        System.out.printf("Факториал числа %d = %d\n", num, result_factorial);

        in.close();
    }
}