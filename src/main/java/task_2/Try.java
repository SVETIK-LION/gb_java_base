package task_2;

import java.util.*;

public class Try {
    public static void main(String[] args) {
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
        Map<String, Integer> namesRepetitions = getRepetitionsNames(employees);
        System.out.printf("Список имен с кол-вом повторений: %s\n", namesRepetitions);
        Map<Integer, List<String>> sortedNamesRepetitions = sortingByCounterDesc(namesRepetitions);
        System.out.println("Список имен с количеством повторений, отсортированный по убыванию популярности: ");
        printSortedNamesByCount(sortedNamesRepetitions);


    }

    // Считает имена и записывает в словарь {имя: счетчик}
    private static Map<String, Integer> getRepetitionsNames(List<String> employees) {
        Map<String, Integer> namesRepetitions = new HashMap<>();

        for (String employee : employees) {
            if (namesRepetitions.containsKey(employee)) {
                int count = namesRepetitions.get(employee);
                namesRepetitions.put(employee, count + 1);
            } else {
                namesRepetitions.put(employee, 1);
            }
        }
        return namesRepetitions;
    }


    private static Map<Integer, List<String>> sortingByCounterDesc(Map<String, Integer> namesRepetitions) {
        TreeMap<Integer, List<String>> sortedNamesRepetitions = new TreeMap<>();

        for (Map.Entry<String, Integer> item : namesRepetitions.entrySet()) {
            if (sortedNamesRepetitions.containsKey(item.getValue())){
                sortedNamesRepetitions.put(item.getValue(), sortedNamesRepetitions.get(item.getKey()).add(item.getKey()));
            } else {
                List <String> names = new ArrayList<>();
                names.add(item.getKey());
                sortedNamesRepetitions.put(item.getValue(), names);

            }
        }
        System.out.println(sortedNamesRepetitions);
        return sortedNamesRepetitions.descendingMap();
    }

    private static void printSortedNamesByCount(Map<Integer, List<String>> sortedNamesRepetitions) {
        Map<String, Integer> resultSortedNamesReps = new HashMap<>();

        for(Map.Entry<Integer, List<String>> pair : sortedNamesRepetitions.entrySet()) {
            resultSortedNamesReps.put(pair.getValue().toString(), pair.getKey());
        }

        for(Map.Entry<String, Integer> pair : resultSortedNamesReps.entrySet()){
            System.out.println(pair);
        }
    }
}
