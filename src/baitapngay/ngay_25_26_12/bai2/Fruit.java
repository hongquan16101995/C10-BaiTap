package baitapngay.ngay_25_26_12.bai2;

public class Fruit {
    private double weight;
    private String taste;
    private String color;
    private double price;

    public Fruit() {
    }

    public Fruit(double weight, String taste, String color, double price) {
        this.weight = weight;
        this.taste = taste;
        this.color = color;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
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

    @Override
    public String toString() {
        return "Fruit{" +
                ", weight=" + weight +
                ", taste='" + taste +
                ", color='" + color +
                ", price=" + price +
                '}';
    }
}
