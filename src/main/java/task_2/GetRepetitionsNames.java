package task_2;


import com.sun.source.tree.Tree;

import java.util.*;


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
        System.out.printf("Исходный список: %s\n", employees);
        repetitions(employees);


    }

    public static void repetitions(List <String> employees){
        // Создаем словарь, в котором будут храниться имена сотрудников и количество повторений
        Map<String, Integer> namesRepetitions = new HashMap<>();

        // Перебираем список и смотрим, есть ли такой сотрудник в словаре.
        // Если да, то прибавляем счетчик и записываем новые данные в значение словаря с данным иенем
        // Иначе: добавляем ключ - имя с нулевым значением
        for(String employee : employees) {
            Integer Count = 1;
            if(namesRepetitions.containsKey(employee)){
                Count = namesRepetitions.get(employee);
                namesRepetitions.put(employee, Count + 1);
            } else {
                namesRepetitions.put(employee, Count);
            }
        }
        System.out.printf("Словарь с именами и количеством: %s\n", namesRepetitions);


        SortedSet<Integer> values = new TreeSet<Integer>(namesRepetitions.values());
        System.out.println(values);

        List<Integer> mapValues = new ArrayList<Integer>(namesRepetitions.values());
        Collections.sort(mapValues);
        System.out.println(mapValues);

        SortedSet<String> keys = new TreeSet<String>(namesRepetitions.keySet());
        System.out.println(keys);


    }
}
