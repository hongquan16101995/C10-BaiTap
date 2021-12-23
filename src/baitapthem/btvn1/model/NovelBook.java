package baitapthem.btvn1.model;

public class NovelBook extends Book{
    private String author;

    public NovelBook(String name, long price, int quantity, String dateCreated, String author) {
        super(name, price, quantity, dateCreated);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NovelBook{" + super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}
