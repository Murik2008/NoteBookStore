import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criteries {
    private  List<String> criteries;

    public Criteries() {
        criteries = new ArrayList<>();
    }

    public boolean addCritery(String critery) {
        if (!criteries.contains(critery)) {
            criteries.add(critery);
            return true;
        }
        return false;
    }

    public void showCriteries() {
        int num = 1;
        System.out.println("Выберите один из пунктов: ");
        for (String critery : criteries) {
            System.out.println(num + " " + critery + ":" );
            num++;
        }
    }

    public String getCritery(String critery) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (criteries.contains(critery)) {
                return scanner.next();
            } else {
                return "Такого критерия нет!";
            }
        }
    }
}
