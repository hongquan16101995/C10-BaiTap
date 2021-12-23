package baitapthem.baitaptonghop;

public abstract class MyAnimal {
    public static int age = 20;
    public int a;

    public MyAnimal() {
    }

    public static void say() {
        System.out.println("meo meo");
    }

    public abstract void run();
}
