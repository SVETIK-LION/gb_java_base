package task_3;


import java.util.Scanner;

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
        // Запрашиваем строку json у пользователя
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String jsonString = input.nextLine();
        String [] massive = jsonString.split(", ");

        for (int i = 0; i < massive.length - 1; i++) {
            massive[i] = massive[i].

        }
    }
}
