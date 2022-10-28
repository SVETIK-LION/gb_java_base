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


//public class Main {
//    public static void main(String[] args) {
//        // Запрашиваем строку с параметрами у пользователя
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите параметры для фильтрации: ");
//        String parameters = input.nextLine();
//        String [] s = parameters.split(", ");
//
//        StringBuilder result = new StringBuilder();
//
//        for(int i = 0; i < s.length - 1; i++) {
//            String [] s_result = s[i].split(":");
//            result.append(String.join(" ", s_result));
//
//        }
//        String result_string = result.toString();
//        result_string = result_string.replace("\" \"", "' = '");
//        result_string = result_string.replace("\"\"", "' AND '");
//        result_string = result_string.replace("\"", "'");
//        result_string = result_string.replace("{", "");
//
//
//        System.out.println(result_string);
//        input.close();
//
//    }
//}


//    // Запрашиваем строку с параметрами у пользователя
//    Scanner input = new Scanner(System.in);
//        System.out.print("Введите параметры для фильтрации: ");
//                StringBuilder parameters = new StringBuilder(input.nextLine());
//                parameters.replaceAll(", ", " ");
//                System.out.println(parameters);
//                for(int i = 0; i < parameters.length - 1; i++) {
//        parameters[i] = parameters[i].Replace();
//        }


//        // Запрашиваем строку с параметрами у пользователя
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите параметры для фильтрации: ");
//        String parameters = input.nextLine();
//        parameters = parameters.replace(", ", " AND ");
//        parameters = parameters.replace(":", " = ");
//        parameters = parameters.replace("\"", "");
//        parameters = parameters.replace("{", "");
//        parameters = parameters.replace("}", "");
//
//        for (i = 0; i < parameters.length(); i++) {
//            if (parameters[i].contains("null") == false) {
//
//            }
//        }
//
//        System.out.println(parameters);
//    }
//    input.close();
//}



//        String [] s = parameters.split(", ");
//
//        StringBuilder result = new StringBuilder();
//
//        for(int i = 0; i < s.length - 1; i++) {
//            String [] s_result = s[i].split(":");
//            result.append(String.join(" ", s_result));
//            System.out.println(result);
//        }
//        input.close();
//    }
//}

//            if (s_result.contains("null") == false) {
//                result.append(String.join(" ", s_result));
//            }
