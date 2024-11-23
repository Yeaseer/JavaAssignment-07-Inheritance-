
import java.time.LocalDate;

public class Journal extends LibraryItem {
    private int volume;
    private LocalDate publicationDate;

    public Journal(String title, String author, int itemID, int volume, LocalDate publicationDate) {
        super(title, author, itemID);
        this.volume = volume;
        this.publicationDate = publicationDate;
    }

    public int getVolume() {
        return volume;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Volume: " + volume + ", Publication Date: " + publicationDate);
    }
}
