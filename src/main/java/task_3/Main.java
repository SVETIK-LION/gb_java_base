package task_3;

import java.util.Scanner;

/**
 * Простой калькулятор
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();

        System.out.println("Введите оператор (+ | - | * | /): ");
        String operator = input.next();

        System.out.println("Введите второе число: ");
        float num2 = input.nextFloat();

        if (operator.equals("+")) {
            System.out.printf("Результат: %f", (num1 + num2));
        }

        if (operator.equals("-")) {
            System.out.printf("Результат: %f", (num1 - num2));
        }

        if (operator.equals("*")) {
            System.out.printf("Результат: %f", (num1 * num2));
        }

        if (operator.equals("/")) {
            System.out.printf("Результат: %f", (num1 / num2));
        }

        input.close();
    }
}
