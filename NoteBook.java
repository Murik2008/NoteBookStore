import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Object> noteBook;

    public NoteBook() {
        noteBook = new ArrayList<>();
    }

    public boolean add(Object itemObject) {
        if (!noteBook.contains(itemObject)) {
            noteBook.add(itemObject);
            return true; 
        }
        return false;
    }

    public void printNoteBook() {
        System.out.println(noteBook);
    }
}