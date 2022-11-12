package task_2;

import java.util.LinkedList;


/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */


public class QueueLinkedList {
    private int size = 0;
    private final LinkedList<Integer> queue = new LinkedList<Integer>();

    boolean empty() {    //проверяет пустая ли очередь
        return size == 0;
    }

    int size() {    // Посмотреть размер очереди
        System.out.println("Размер очереди: " + size);
        return size;
    }


    void enqueue(int elem){ // Добавить элемент в очередь
        queue.add(elem);
        size++;
        System.out.println("В очередь добавлен элемент: " + elem);
    }

    int dequeue(){     //посмотреть и удалить первый элемент очереди
        if (!empty()){
            System.out.println("Удален первый элемент: " + queue.poll());
            return queue.pollLast();
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    int first(){      // посмотреть первый элемент очереди
        int elem = queue.peekFirst();
        size--;
            System.out.println("Теперь первый элемент в очереди: " + elem);
        return elem;
    }
}
