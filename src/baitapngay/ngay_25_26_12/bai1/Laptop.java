package baitapngay.ngay_25_26_12.bai1;

public class Laptop {
    private static int VALUE = 0;
    private int id;
    private String brand;
    private String color;
    private double price;
    private int quantity;

    public Laptop(String name, String color, double price, int quantity) {
        this.id = ++VALUE;
        this.brand = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
