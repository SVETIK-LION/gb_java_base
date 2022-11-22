package task_2;


import java.util.*;


/** Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */


public class GetRepetitionsNames {
    public static void main(String[] args) {
        // Создаем список имен сотрудников
        List<String> employees = new ArrayList<>(Arrays.asList("Светлана", "Сигизмунд", "Сигизмунд", "Сигизмунд", "Антонина",
                "Антонина", "Роман", "Роман"));
        // Проверила, что получился список
        System.out.printf("Исходный список: %s\n", employees);


        Map<String, Integer> namesRepetitions = new HashMap<>();
        for (String name: employees) {
            if (namesRepetitions.containsKey(name)){
                namesRepetitions.put(name, namesRepetitions.get(name) + 1);
            } else {
                namesRepetitions.put(name, 1);
            }
        }

        TreeMap<Integer, List<String>> sortedRepetitionsNames = new TreeMap<>();
        for (Map.Entry<String, Integer> item : namesRepetitions.entrySet()) {
            if (sortedRepetitionsNames.containsKey(item.getValue())) {
                sortedRepetitionsNames.get(item.getValue()).add(item.getKey());
            } else {
                ArrayList<String> names = new ArrayList<>();
                names.add(item.getKey());
                sortedRepetitionsNames.put(item.getValue(), names);
                sortedRepetitionsNames.descendingMap();
            }
        }

        for(Map.Entry<Integer, List<String>> elem : sortedRepetitionsNames.descendingMap().entrySet()){
            System.out.printf("Имя %s повторяется %d раз(а)\n", elem.getValue(), elem.getKey());
        }
    }
}
