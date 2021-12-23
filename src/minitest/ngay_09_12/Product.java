package minitest.ngay_09_12;

public class Product {
    private int id;
    private String name;
    private double price;
    private String type;
    private String unit = "USD";

    public Product(int id, String name, double price, String type, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.unit = unit;
    }

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
