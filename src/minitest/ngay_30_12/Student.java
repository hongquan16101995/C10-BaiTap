package minitest.ngay_30_12;

public class Student extends Human {
    private double pointMath;
    private double pointPhy;
    private double pointChe;

    public Student(String name, int age, double pointMath, double pointPhy, double pointChe) {
        super(name, age);
        this.pointMath = pointMath;
        this.pointPhy = pointPhy;
        this.pointChe = pointChe;
    }

    public Student() {
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointPhy() {
        return pointPhy;
    }

    public void setPointPhy(double pointPhy) {
        this.pointPhy = pointPhy;
    }

    public double getPointChe() {
        return pointChe;
    }

    public void setPointChe(double pointChe) {
        this.pointChe = pointChe;
    }

    public double getAverage() {
        return (pointMath + pointPhy + pointChe) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + super.getCode() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "pointMath=" + pointMath +
                ", pointPhy=" + pointPhy +
                ", pointChe=" + pointChe +
                '}';
    }
}
