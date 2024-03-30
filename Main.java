import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> m1 = new HashMap<>(); // ОЗУ, ЖД
        Map<String, String> m2 = new HashMap<>(); // Операционная система, цвет
        Map<Map<Integer, Integer>, Map<String, String>> laptops = new HashMap<>();
        String[] criteries = new String[] {"ОЗУ", "Объём ЖД", "Операционная система", "Цвет", "Поиск", "Закрыть программму"};

        getItem(criteries, m1, m2, laptops);
    }


    static void getItem(String[] criteries, Map<Integer, Integer> m1, Map<String, String> m2, Map<Map<Integer, Integer>, Map<String, String>> laptops) {
        System.out.println("Выберите один из пунктов: ");
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        for (String item: criteries) {
            System.out.print(num  + " " + item + "\n");
            num ++;
        }
        int index = scanner.nextInt();
        if (true) {
            switch (index) {
                case 1:
                    System.out.println("Введите размер ОЗУ: ");
                    Integer RAM = scanner.nextInt();
                    m1.put(RAM, 0);
                    break;
                case 2:
                    System.out.println("Введите объём ЖД: ");
                    Integer HDD = scanner.nextInt();
                    if (m1.containsValue(0)) {
                        m1.replace(0, 0, HDD);
                    }
                    break;
                case 3:
                    System.out.println("Введите операционную систему: ");
                    String operatingSystem = scanner.next();
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    String colour = scanner.next();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Программа успешно закрыта!");
                    break;
                default:
                    System.out.println("Такого пункта нет!");
                    getItem(criteries, m1, m2, laptops);
            }
        }
    }
}
