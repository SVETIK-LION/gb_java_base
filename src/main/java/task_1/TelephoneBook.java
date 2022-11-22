package task_1;


import java.util.*;


/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 */
public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> telephonesByNames = new HashMap<>();
        telephonesByNames.put("Светлана", new ArrayList<>());
        telephonesByNames.get("Светлана").add("89126256565");
        telephonesByNames.get("Светлана").add("3430169");
        telephonesByNames.put("Роман", new ArrayList<>());
        telephonesByNames.get("Роман").add("89652376777");
        telephonesByNames.put("Виола", new ArrayList<>());
        telephonesByNames.get("Виола").add("89347478348");
        telephonesByNames.get("Роман").add("89367486137");

        System.out.printf("Вся телефонная книга: %s\n", telephonesByNames);

        // Поиск по имени
        System.out.println(telephonesByNames.get("Светлана"));
    }
}
