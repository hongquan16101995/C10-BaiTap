package baitapthem.baitap_29_12;

public class Student extends Human{
    private double average;

    public Student(String name, int age, String gender, String address) {
        super(name, age, gender, address);
    }

    public Student(String name, int age, String gender, String address, double average) {
        super(name, age, gender, address);
        this.average = average;
    }

    public Student() {
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", average=" + average +
                '}';
    }
}
