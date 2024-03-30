import java.util.List;

public class NoteBook {
    private final List<Object> noteBook;

    public NoteBook(List<Object> noteBook) {
        this.noteBook = noteBook;
    }

    public void add(Object itemObject) {
        noteBook.add(itemObject);
    }

    public void printNoteBook() {
        System.out.println(noteBook);
    }
}