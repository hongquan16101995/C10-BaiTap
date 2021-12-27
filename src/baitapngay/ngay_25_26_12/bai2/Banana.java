package baitapngay.ngay_25_26_12.bai2;

public class Banana extends Fruit{
    public Banana(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Banana" + super.toString();
    }
}
