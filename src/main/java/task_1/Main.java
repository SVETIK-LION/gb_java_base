package com.svetik_lion;

import java.util.Scanner;

/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки. Разберите строку, используя String.split.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class Main {
    public static void main(String[] args) {
        // Запрашиваем строку с параметрами у пользователя
        Scanner input = new Scanner(System.in);
        System.out.print("Введите параметры для фильтрации: ");
        String parameters = input.nextLine();
        String [] s = parameters.split(", ");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length - 1; i++) {
            String [] s_result = s[i].split(":");
            result.append(String.join(" ", s_result));

        }
        String result_string = result.toString();
        result_string = result_string.replace("\" \"", "' = '");
        result_string = result_string.replace("\"\"", "' AND '");
        result_string = result_string.replace("\"", "'");
        result_string = result_string.replace("{", "");


        System.out.println(result_string);
        input.close();

    }
}
