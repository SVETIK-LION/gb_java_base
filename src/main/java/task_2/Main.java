package task_2;


public class Main {
    public static void main(String [] args){
        QueueLinkedList Queue_lin_list = new QueueLinkedList();

        //Добавим в очередь несколько элементов:
        Queue_lin_list.enqueue(1);
        Queue_lin_list.enqueue(2);
        Queue_lin_list.enqueue(3);

        // Возвращаем и удаляем первый элемент из очереди:
        Queue_lin_list.dequeue();

        // Возращаем первый элемент из очереди не удаляя его:
        Queue_lin_list.first();

        //Размер очереди:
        Queue_lin_list.size();

    }
}
