import java.util.ArrayList;
import java.util.List;

public class Criteries {
    private final List<String> criteries;

    public Criteries() {
        criteries = new ArrayList<>();
    }

    public void addCritery(String critery) {
        criteries.add(critery);
    }

    public void showCriteries() {
        int num = 1;
        for (String critery : criteries) {
            System.out.println(num + " " + critery + ":" );
            num++;
        }
    }
}
