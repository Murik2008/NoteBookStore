import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoteBookShop {
    private final Map<Object, NoteBook> noteBookShop;

    NoteBookShop() {
        noteBookShop = new HashMap<>();
    }

    boolean addNoteBookShop(NoteBook noteBook, Criteries criteries, String critery) {
        if (!noteBookShop.containsValue(noteBook)) {
            noteBookShop.put(criteries.getCritery(critery), noteBook);
            return true;
        } else {
            return false;
        }
    }

    void sortByCritery(NoteBook noteBook) {
        try (Scanner scanner = new Scanner(System.in)) {
            int index = 0;

            Criteries criteries = new Criteries();
            criteries.addCritery("ОЗУ");
            criteries.addCritery("Объём ЖД"); 
            criteries.addCritery("Оперативная система"); 
            criteries.addCritery("Цвет"); 
            criteries.addCritery("Закрыть фильтрацию");

            addNoteBookShop(noteBook, criteries, "ОЗУ");
            addNoteBookShop(noteBook, criteries, "Объём ЖД");
            addNoteBookShop(noteBook, criteries, "Оперативная система");
            addNoteBookShop(noteBook, criteries, "Цвет");

            while (index != 5) {
                criteries.showCriteries();
                index = scanner.nextInt();
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Напишите размер ОЗУ: ");
                        if (!noteBookShop.containsKey(scanner.nextInt())) {
                            System.out.println("Вот компьютер: " + "\n");
                            noteBook.printNoteBook();
                        } else {
                            System.err.println("Такого компьютера нет!");
                        }
                        break;
                    case 2:
                        System.out.println("Напишите объм ЖД: ");
                        if (!noteBookShop.containsKey(scanner.nextInt())) {
                            System.out.println("Вот компьютер: " + "\n");
                            noteBook.printNoteBook();
                        } else {
                            System.err.println("Такого компьютера нет!");
                        }
                        break;
                    case 3:
                        System.out.println("Напишите оперативную систему: ");
                        if (!noteBookShop.containsKey(scanner.next())) {
                            System.out.println("Вот компьютер: " + "\n");
                            noteBook.printNoteBook();
                        } else {
                            System.err.println("Такого компьютера нет!");
                        }
                        break;
                    case 4:
                        System.out.println("Напишите цвет: ");
                        if (!noteBookShop.containsKey(scanner.next())) {
                            System.out.println("Вот компьютер: " + "\n");
                            noteBook.printNoteBook();
                        } else {
                            System.err.println("Такого компьютера нет!");
                        }
                        break;
                    case 5:
                        System.out.println("Выход из фильтрации успешно совершён!");
                        index = 5;
                        break;       
                    default:
                        System.out.println("Такого пункта нет!");
                        sortByCritery(noteBook);
                }
            }
        }
    }
}