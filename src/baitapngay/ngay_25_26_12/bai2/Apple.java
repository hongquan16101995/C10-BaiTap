package baitapngay.ngay_25_26_12.bai2;

public class Apple extends Fruit{
    public Apple(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Apple:" + super.toString();
    }
}
