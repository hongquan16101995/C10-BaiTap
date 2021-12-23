package baitapthem.btvn2.model;

public class Book {
    private String name;
    private long price;
    private int quantity;
    private String dateCreated;

    public Book() {
    }

    public Book(String name, long price, int quantity, String dateCreated) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}
