
public class LibraryItem {
    private String title;
    private String author;
    private int itemID;

    public LibraryItem(String title, String author, int itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemID() {
        return itemID;
    }

    public void display() {
        System.out.println("ID: " + itemID + ", Title: " + title + ", Author: " + author);
    }
}
