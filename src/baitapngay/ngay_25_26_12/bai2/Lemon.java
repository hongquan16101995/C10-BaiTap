package baitapngay.ngay_25_26_12.bai2;

public class Lemon extends Fruit{
    public Lemon(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Lemon" + super.toString();
    }
}
