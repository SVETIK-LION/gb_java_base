package task_1;

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
        String [] parameters_massive = parameters.split(" ");

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < parameters_massive.length; i++) {

            // Делаем преобразования строки в нужную форму для SQL
            parameters_massive[i] = parameters_massive[i].replace("{", "");
            parameters_massive[i] = parameters_massive[i].replace("}", "");
            parameters_massive[i] = parameters_massive[i].replace("\"", "'");
            parameters_massive[i] = parameters_massive[i].replace(":", " = ");
            parameters_massive[i] = parameters_massive[i].replace(",", " AND ");


            // Если не содержит null, то добавляем в конечный результат
            if (!parameters_massive[i].contains("null")) {
                result.append(parameters_massive[i]);
            }
        }

        System.out.println(result);

        input.close();
    }
}
