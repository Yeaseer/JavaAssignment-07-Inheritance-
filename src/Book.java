
public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    public Book(String title, String author, int itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Pages: " + numberOfPages + ", Publisher: " + publisher);
    }
}
