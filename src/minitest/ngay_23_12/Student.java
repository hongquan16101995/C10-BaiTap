package minitest.ngay_23_12;

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

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public void setPointPhy(double pointPhy) {
        this.pointPhy = pointPhy;
    }

    public void setPointChe(double pointChe) {
        this.pointChe = pointChe;
    }

    public double getAvgPoint() {
        return (pointMath + pointPhy + pointChe) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "pointMath=" + pointMath +
                ", pointPhy=" + pointPhy +
                ", pointChe=" + pointChe +
                '}';
    }
}
