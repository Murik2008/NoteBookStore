import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBookShop noteBookShop = new NoteBookShop();
        NoteBook noteBook = new NoteBook();
        Criteries criteries = new Criteries();

        criteries.addCritery("ОЗУ");
        criteries.addCritery("Объём ЖД");
        criteries.addCritery("Оперативная система");
        criteries.addCritery("Цвет");
        criteries.addCritery("Поиск компютера");
        criteries.addCritery("Сохранить изменения");
        criteries.addCritery("Закрыть меню");


        mainMenu(criteries, noteBook, noteBookShop);
        
    }

    static void mainMenu(Criteries criteries, NoteBook noteBook, NoteBookShop noteBookShop) {
        try (Scanner scanner = new Scanner(System.in)) {
            int index = 0;

            while (index != 7) {
                criteries.showCriteries();
                index = scanner.nextInt();
                switch (index) {
                    case 1:
                        System.out.println("Напишите размер ОЗУ: ");
                        Integer RAM = scanner.nextInt();
                        noteBook.add(RAM);
                        break;
                    case 2:
                        System.out.println("Напишите объём ЖД: ");
                        Integer HDD = scanner.nextInt();
                        noteBook.add(HDD);
                        break;
                    case 3:
                        System.out.println("Напишите оперативную систему: ");
                        String operatingSystem = scanner.next();
                        noteBook.add(operatingSystem);
                        break;
                    case 4:
                        System.out.println("Напишите цвет: ");
                        String color = scanner.next();
                        noteBook.add(color);
                        break;
                    case 5:
                        noteBookShop.sortByCritery(noteBook);
                        break;
                    case 6:
                        noteBookShop.addNoteBookShop(noteBook, criteries, criteries.getCritery("ОЗУ"));
                        noteBookShop.addNoteBookShop(noteBook, criteries, criteries.getCritery("Объём ЖД"));
                        noteBookShop.addNoteBookShop(noteBook, criteries, criteries.getCritery("Оперативная система"));
                        noteBookShop.addNoteBookShop(noteBook, criteries, criteries.getCritery("Цвет"));
                        System.out.println("Сохранение успешно завершено!");
                        break;
                    case 7:
                        System.out.println("Меню успешно закрыто!");
                        index = 7;
                        break;
                    default:
                        System.out.println("Такого пунтка нет!");
                        mainMenu(criteries, noteBook, noteBookShop);
                }
            }
        }
    }
}