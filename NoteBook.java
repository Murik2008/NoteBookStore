import java.util.*;

public class NoteBook {
    public static void main(String[] args) {
        Map<Integer, Integer> m1 = new HashMap<>(); // ОЗУ, ЖД
        Map<String, String> m2 = new HashMap<>(); // Операционная система, цвет
        Map<Map<Integer, Integer>, Map<String, String>> laptops = new HashMap<>();
    }


    static void getItem() {
        System.out.println("Выберите один из пунктов: ");
        String[] criteries = new String[] {"ОЗУ", "Объём ЖД", "Операционная система", "Цвет", "поиск"};
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        for (String item: criteries) {
            System.out.print(num + item + ":");
            num ++;
        }
        while (scanner.nextInt() < criteries.length ) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите размер ОЗУ: ");
                    Integer RAM = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Введите объём ЖД: ");
                    Integer HDD = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Введите операционную систему: ");
                    String operatingSystem = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    String colour = scanner.nextLine();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Такого пункта нет!");
                    getItem();
            }
        }
    }
}
