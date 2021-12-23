package baitapngay.ngay_20_12.model;

import baitapngay.ngay_20_12.my_interface.AnimalMethod;

public class Cat extends Animal implements AnimalMethod {
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Cat() {
    }

    @Override
    public int run() {
        return 40;
    }

    @Override
    public String makeSound() {
        return "Meo meo";
    }

    public void catchMouse() {
        System.out.println("Mèo biết bắt chuột!");
    }

    public void display() {
        System.out.printf("%-20s", "Cat");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
