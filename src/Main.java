
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", 101, 500, "Tech Press");
        library.addItem(book1);

        Journal journal1 = new Journal("Science Today", "Jane Smith", 102, 12, LocalDate.of(2023, 5, 1));
        library.addItem(journal1);

        library.displayAllItems();

        library.removeItem(101);
        library.displayAllItems();
    }
}
