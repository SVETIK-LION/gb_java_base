package task_2;

import java.util.LinkedList;


/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */


public class Queue {
    public static void main(String[] args){
        LinkedList<String> Queue_lin_list = new LinkedList<>();
        // Добавляем элементы:
        enqueue(Queue_lin_list, "some_string");
        enqueue(Queue_lin_list, "other_some_string");
        enqueue(Queue_lin_list, "third_some_string");
        System.out.printf("Очередь после добавления элементов: %s\n", Queue_lin_list);

        // Возвращаем и удаляем первый элемент из очереди:
        System.out.printf("Элемент, который был удален: %s\n", dequeue(Queue_lin_list));
        System.out.printf("Очередь после удаления первого элемента: %s\n", Queue_lin_list);

        // Возращаем первый элемент из очереди не удаляя его:
        System.out.printf("Первый элемент в очереди: %s\n", first(Queue_lin_list));
}

    private static void enqueue(LinkedList<String> Queue_lin_list, String elem){
        Queue_lin_list.addFirst(elem);

    }

    private static String dequeue(LinkedList<String> Queue_lin_list){
        return Queue_lin_list.pollLast();
    }

    private static String first(LinkedList<String> Queue_lin_list){
        return Queue_lin_list.peekLast();
    }
}
