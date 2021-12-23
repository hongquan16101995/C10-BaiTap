package baitapngay.ngay_20_12.model;

import baitapngay.ngay_20_12.my_interface.AnimalMethod;

public class Mouse extends Animal implements AnimalMethod {
    public Mouse(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Mouse() {
    }

    @Override
    public int run() {
        return 20;
    }

    @Override
    public String makeSound() {
        return "Chít chít";
    }

    public void eatRice() {
        System.out.println("Chuột ăn gạo!");
    }

    public void display() {
        System.out.printf("%-20s", "Mouse");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
