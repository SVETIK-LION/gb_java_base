package task_2;


import java.util.*;


/** Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */


public class GetRepetitionsNames {
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
        Map<Integer, String> sortedNamesRepetitions = sortingByCounterDesc(namesRepetitions);
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


    private static Map<Integer, String> sortingByCounterDesc(Map<String, Integer> namesRepetitions) {
        TreeMap<Integer, String> sortedNamesRepetitions = new TreeMap<>();

        for (Map.Entry<String, Integer> item : namesRepetitions.entrySet()) {
            sortedNamesRepetitions.put(item.getValue(), item.getKey());
        }
        System.out.printf("!!!Ключи одинаковые затираются: %s\n", sortedNamesRepetitions);
        return sortedNamesRepetitions.descendingMap();
    }

//    // Пробовала так: меняем ключи и значения местами из предыдущего словаря, чтобы отсортировать
    // Ключи затираются, поэтому нужно добавить список имен в значение ключа - счетчика
    //Добавляла вместо строки список, если словарь уже содержит такой ключ. Но Arrays.asList не может принисать только 1
    // значение, поставила туда еще пробел, но все равно не работает
//private static Map<Integer, List<String>> sortingByCounterDesc(Map<String, Integer> namesRepetitions) {
//    TreeMap<Integer, List<String>> sortedNamesRepetitions = new TreeMap<>();
//
//    for (Map.Entry<String, Integer> item : namesRepetitions.entrySet()) {
//        if (sortedNamesRepetitions.containsKey(item.getValue())){
//            List<String> names = new ArrayList<>();
//            names.add(item.getKey());
//            sortedNamesRepetitions.put(item.getValue(), names);
//        } else {
//            sortedNamesRepetitions.put(item.getValue(), Arrays.asList(item.getKey(), " "));
//
//        }
//    }
//    System.out.println(sortedNamesRepetitions);
//    return sortedNamesRepetitions.descendingMap();
//}

    private static void printSortedNamesByCount(Map<Integer, String> sortedNamesRepetitions) {
        Map<String, Integer> resultSortedNamesReps = new HashMap<>();

        for(Map.Entry<Integer, String> item : sortedNamesRepetitions.entrySet()) {
            resultSortedNamesReps.put(item.getValue(), item.getKey());
        }

        for(Map.Entry<String, Integer> pair : resultSortedNamesReps.entrySet()){
            System.out.println(pair);
        }
        }
    }
