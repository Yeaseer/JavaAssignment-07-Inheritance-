
import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Added item: " + item.getTitle());
    }

    public void removeItem(int itemID) {
        items.removeIf(item -> item.getItemID() == itemID);
        System.out.println("Removed item with ID: " + itemID);
    }

    public void displayAllItems() {
        System.out.println("Library Collection:");
        for (LibraryItem item : items) {
            item.display();
            System.out.println();
        }
    }
}
