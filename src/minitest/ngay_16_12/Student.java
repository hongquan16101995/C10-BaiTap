package minitest.ngay_16_12;

public class Student extends Human {
    private double averagePoint;

    public Student(String name, int age, double averagePoint) {
        super(name, age);
        this.averagePoint = averagePoint;
    }

    public Student() {
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                " averagePoint=" + averagePoint +
                '}';
    }
}
