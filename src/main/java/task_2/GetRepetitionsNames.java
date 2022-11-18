package task_2;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


/** Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */


public class GetRepetitionsNames {
    public static void main(String[] args){
        // Создаем список имен сотрудников
        List<String> employees = new ArrayList<>();
        employees.add("Иван");
        employees.add("Петр");
        employees.add("Антон");
        employees.add("Иван");
        employees.add("Сигизмунд");
        employees.add("Петр");

        // Проверила, что получился список
        System.out.println(employees);

    }

    public static void repetitions(List <String> employees){
        // Создаем словарь, в котором будут храниться имена сотрудников и количество повторений
        Map<String, Integer> namesRepetitions = new HashMap<>();

        // Перебираем список и смотрим, есть ли такой сотрудник в словаре.
        // Если да, то прибавляем счетчик и записываем новые данные в значение словаря с данным иенем
        for(int i = 0; i < employees.size(); i++){
            if (namesRepetitions.containsKey(employees.get(i)) != employees.get(i)) {


            }

            else if(namesRepetitions.containsKey(employees.get(i)) == employees.get(i)){
                namesRepetitions.put(employees.get(i), );
            }

        }

    }


    }
}
