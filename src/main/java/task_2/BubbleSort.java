package task_2;


import java.io.IOException;
import java.util.logging.*;

/** Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 * numbers = {4, 2, 1, 5, 44, 14, 666, 0} */

public class BubbleSort {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] numbers = {4, 2, 1, 5, 44, 14, 666, 0};
        int storage = 0;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    storage = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = storage;
                    sorted = false;
                }
            }
            for (int elem : numbers) {
                logger.info(String.valueOf(elem));
            }
        }

        for (int elem : numbers) {
            System.out.println(elem);
        }

    }

        public static void logging (String[]args) throws IOException {
            Logger logger = Logger.getLogger(BubbleSort.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);

            logger.info("Записано в журнал");
        }
    }
