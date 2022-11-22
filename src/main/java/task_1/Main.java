package task_1;
import java.util.*;


/**
 *Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 * Например:
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */


public class Main
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        Notebook hp = new Notebook("Hp elite dragonfly g2 3C8C7EA", 13.3f,
                "Intel Core i5 1135G7", 8, 256, "Windows 10", "grey");
        Notebook dell = new Notebook("DELL Alienware 15 A15-2075", 15f,
                "Core i7 7700HQ", 8, 128, "Windows 11", "green");
        Notebook lenovo = new Notebook("Lenovo ThinkPad X1 Extreme Gen 3", 15.6f,
                "Intel Core i7-10750H", 16, 1024, "Windows 10", "black");
        Notebook macbook = new Notebook("Macbook Pro", 15,
                "M1", 32, 1024, "Monterey 12", "silver");

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(hp, dell, lenovo, macbook));

        getMenu();
        int numberMenu = in.nextInt();

        while (numberMenu != 0) {

            List<Notebook> filterNotebooks = selectMenuItem(numberMenu, notebooks);

            printFilterNotebooks(filterNotebooks);

            getMenu();
            numberMenu = in.nextInt();
        }

    }

    private static void getMenu() {
        System.out.println("\nВведите критерий фильтрации ноутбуков");
        System.out.println("""
                1. ОЗУ
                2. Объем HDD
                3. Операционная система
                4. Цвет
                5. Минимальный критерий по ОЗУ
                6. Минимальный критерий по HDD
                7. Минимальный критерий по ОС
                0. Выход
                """);

    }

    private static List<Notebook> selectMenuItem(int numberMenu,
                                                 List<Notebook> notebooks) {
        Scanner inputFilter = new Scanner(System.in);

        return switch (numberMenu) {
            case 1 -> getFilterRam(inputFilter, notebooks);
            case 2 -> getFilterHdd(inputFilter, notebooks);
            case 3 -> getFilterOs(inputFilter, notebooks);
            case 4 -> getFilterColor(inputFilter, notebooks);
            case 5 -> getMinCriteriesRAM(inputFilter, notebooks);
            case 6 -> getMinCriteriesHDD(inputFilter, notebooks);
            case 7 -> getMinCriteriesOS(inputFilter, notebooks);
            default -> new ArrayList<>();
        };
    }

    private static List<Notebook> getFilterRam(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookRam = new ArrayList<>();
        System.out.println("Введите ОЗУ по которому будет производиться фильтрация");
        int ram = inputFilter.nextInt();

        for (Notebook notebook : notebooks) {
            if (notebook.getRam() == ram){
                filterNotebookRam.add(notebook);
            }
        }
        return filterNotebookRam;
    }

    private static List<Notebook> getFilterHdd(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookHdd = new ArrayList<>();
        System.out.println("Введите объем HDD по которому будет производиться фильтрация");
        int spaceHdd = inputFilter.nextInt();

        for (Notebook notebook : notebooks) {
            if (notebook.getHardDiskSpace() == spaceHdd) {
                filterNotebookHdd.add(notebook);
            }
        }
        return filterNotebookHdd;
    }

    private static List<Notebook> getFilterOs(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookOs = new ArrayList<>();
        System.out.println("Введите ОС по которому будет производиться фильтрация:");
        String spaceOs = inputFilter.nextLine();

        for (Notebook notebook : notebooks) {
            if (notebook.getOs().equals(spaceOs)) {
                filterNotebookOs.add(notebook);
            }
        }
        return filterNotebookOs;
    }

    private static List<Notebook> getFilterColor(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookColor = new ArrayList<>();
        System.out.println("Введите цвет по которому будет производиться фильтрация:");
        String spaceOs = inputFilter.next();

        for (Notebook notebook : notebooks) {
            if (notebook.getColor().equals(spaceOs)) {
                filterNotebookColor.add(notebook);
            }
        }
        return filterNotebookColor;
    }

    private static List<Notebook> getMinCriteriesRAM(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookColor = new ArrayList<>();
        System.out.println("Введите минимальный объем ОЗУ по которому будет производиться фильтрация:");
        int ram = inputFilter.nextInt();

        for (Notebook notebook : notebooks) {
            if (notebook.getRam()>=ram) {
                filterNotebookColor.add(notebook);
            }
        }

        return filterNotebookColor;
    }

    private static List<Notebook> getMinCriteriesHDD(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookColor = new ArrayList<>();
        System.out.println("Введите минимальный объем HDD по которому будет производиться фильтрация:");
        int hdd = inputFilter.nextInt();

        for (Notebook notebook : notebooks) {
            if (notebook.getHardDiskSpace()>= hdd) {
                filterNotebookColor.add(notebook);
            }
        }

        return filterNotebookColor;
    }

    private static List<Notebook> getMinCriteriesOS(Scanner inputFilter, List<Notebook> notebooks) {
        List<Notebook> filterNotebookColor = new ArrayList<>();
        System.out.println("Введите минимальный название ОС и версию через пробел по" +
                "которому будет производиться фильтрация:");

        String[] osFilters = inputFilter.nextLine().split(" ");

        for (Notebook notebook : notebooks) {
            String nameOs = notebook.getOs().split(" ")[0];
            int osVersion = Integer.parseInt(notebook.getOs().split(" ")[1]);
            if (nameOs.equals(osFilters[0]) && osVersion >= Integer.parseInt(osFilters[1])) {
                filterNotebookColor.add(notebook);
            }
        }

        return filterNotebookColor;
    }

    private static void printFilterNotebooks(List<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }
}
