package baitapngay.ngay_20_12.model;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal() {
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.printf("%-20s", "Animal");
        System.out.printf("%-20S", name);
        System.out.printf("%-20s", age);
        System.out.printf("%s", weight);
        System.out.println();
    }
}
