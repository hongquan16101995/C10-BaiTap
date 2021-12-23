package baitapthem.btvn1.model;

public class ScienceBook extends Book{
    private String type;

    public ScienceBook(String name, long price, int quantity, String dateCreated, String type) {
        super(name, price, quantity, dateCreated);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
