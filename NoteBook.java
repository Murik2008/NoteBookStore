import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private final List<Object> noteBook;

    public NoteBook() {
        noteBook = new ArrayList<>();
    }

    public void add(Object itemObject) {
        noteBook.add(itemObject);
    }

    public void printNoteBook() {
        System.out.println(noteBook);
    }
}