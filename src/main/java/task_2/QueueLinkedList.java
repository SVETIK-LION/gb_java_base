package task_2;

import java.util.LinkedList;
import java.util.Queue;


/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */


public class QueueLinkedList {
    public static void main(String[] args){
        Queue<Integer> Queue_lin_list = new LinkedList<>();
        // Добавляем элементы:
        enqueue(Queue_lin_list, 1);
        enqueue(Queue_lin_list, 2);
        enqueue(Queue_lin_list, 3);
        System.out.printf("Очередь после добавления элементов: %s\n", Queue_lin_list);

        // Возвращаем и удаляем первый элемент из очереди:
        System.out.printf("Элемент, который был удален: %s\n", dequeue(Queue_lin_list));
        System.out.printf("Очередь после удаления первого элемента: %s\n", Queue_lin_list);

        // Возращаем первый элемент из очереди не удаляя его:
        System.out.printf("Первый элемент в очереди: %s\n", first(Queue_lin_list));
}

    private static void enqueue(Queue<Integer> Queue_lin_list, int elem){
        Queue_lin_list.add(elem);

    }

    private static Integer dequeue(Queue<Integer> Queue_lin_list){
        return Queue_lin_list.poll();
    }

    private static Integer first(Queue<Integer> Queue_lin_list){
        return Queue_lin_list.peek();
    }
}
