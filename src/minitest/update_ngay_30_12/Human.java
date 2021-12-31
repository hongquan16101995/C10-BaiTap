package minitest.update_ngay_30_12;

public class Human {
    public static int VALUE;
    private int code;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.code = ++VALUE;
        this.name = name;
        this.age = age;
    }

    public Human(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public int getCode() {
        return code;
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

    @Override
    public String toString() {
        return "Human{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
