package task_1;


/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки. Разберите строку, используя String.split.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class Main {
    public static void main(String[] args) {
        // Исходная строка
        String parameters = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] parameters_massive = parameters.replaceAll("[{}\"]", "").split(",");

        StringBuilder result = new StringBuilder("SELECT * FROM students WHERE (");

        for (int i = 0; i < parameters_massive.length - 1; i++) {
            int index_value = parameters_massive[i].indexOf(":");

            String substring = parameters_massive[i].substring(index_value + 1);
            if (substring.equals("null")) {
                continue;
            }
            else {
                parameters_massive[i] = parameters_massive[i].replace(substring, "'" + substring + "'");
            }

            int result_length = result.length();
            if (result_length % 2 != 0) {
                result.append(" AND ");
            }

            result.append(parameters_massive[i].replace(":", " = "));

        }
        result.append(");");
        System.out.println(result);
    }
}
