package task_1;

import java.util.Collections;
import java.util.LinkedList;


/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */


public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList <String> Fruits = new LinkedList<>();
        Fruits.add("banana");
        Fruits.add("kiwi");
        Fruits.add("pomegranate");
        Fruits.add("grapefruit");
        System.out.printf("Исходный список: %s\n", Fruits);
        Collections.reverse(Fruits);
        System.out.printf("Перевернутый список: %s", Fruits);
    }
}
