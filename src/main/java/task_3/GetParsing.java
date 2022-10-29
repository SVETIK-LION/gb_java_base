package task_3;


import java.util.Arrays;

/** Дана строка json:

 [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

 Написать метод, который распарсит json и, используя StringBuilder, создаст строки вида:

 Студент [фамилия] получил [оценка] по предмету [предмет]. Например:

 Студент Иванов получил 5 по предмету Математика.
 Студент Петрова получил 4 по предмету Информатика.
 Студент Краснов получил 5 по предмету Физика. */


public class GetParsing {
    public static void main(String[] args) {
        // Исходная строка
        String parameters = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                " {\"фамилия\":\"Петрова\",\"оценка\":\"5\",\"предмет\":\"Информатика\"}," +
                " {\"фамилия\":\"Краснов\",\"оценка\":\"3\",\"предмет\":\"Физика\"}";

        String[] parameters_massive = parameters.replaceAll("\"", "").split(", ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= parameters_massive.length - 1; i++) {
            parameters_massive[i] = parameters_massive[i].replace("фамилия", "Студент");
            parameters_massive[i] = parameters_massive[i].replace("оценка", "получил");
            parameters_massive[i] = parameters_massive[i].replace("предмет", "по предмету");
            parameters_massive[i] = parameters_massive[i].replace(":", " ");
            parameters_massive[i] = parameters_massive[i].replace(",", " ");
            parameters_massive[i] = parameters_massive[i].replace("{", "");
            parameters_massive[i] = parameters_massive[i].replace("}", ".\n");
            result.append(parameters_massive[i]);
        }

        System.out.println(result);

            }
        }
