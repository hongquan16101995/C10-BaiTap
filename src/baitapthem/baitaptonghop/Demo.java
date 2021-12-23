package baitapthem.baitaptonghop;

public class Demo {
    static {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
//        MyAnimal animal1 = new MyAnimal();
//        System.out.println(MyAnimal.age);
//        System.out.println(animal1.age);
//        MyAnimal.say();
//        animal1.say();

        int a = MyAnimal.age;
        MyAnimal.age = 100;
        int b = MyAnimal.age;
        System.out.println(a);
        System.out.println(b);
    }
}
