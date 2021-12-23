package baitapthem.baitaptonghop;

public class Main {
//    public static class Animal {
//        public void eat() {
//            System.out.println("eating...");
//        }
//    }
//
//    public static class Cat extends Animal {
//        @Override
//        public void eat() {
//            System.out.println("eat meat...");
//        }

//        public void meow() {
//            System.out.println("meowing...");
//        }
//    }


    public static void main(String[] args) {

       Animal animal = new Animal() {
           @Override
           public void run() {
               super.run();
           }
       };

//        Cat cat = new Cat();
//        Animal animal1 = cat; // Chuyển kiểu không tường minh
//        Animal animal2 = (Animal) cat; // Chuyển kiểu tường minh
//
//        cat.eat();
//        cat.meow();
//        animal1.eat();
//        animal2.eat();
//        animal1.meow();
        // animal2.meow(); // Không thể gọi phương thức meow()

//        Animal animal = new Cat();
//        Cat cat1 = (Cat) animal; // downcasting
////         animal.meow();
//        cat1.meow();
//        cat1.eat();
        //có thể sinh ra 1 exception: ClassCastException
    }
}
