package minitest.ngay_16_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HumanManager implements Manager {
    private ArrayList<Human> humans;
    private final Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    @Override
    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    @Override
    public void addHuman(Human human) {
        humans.add(human);
    }

    @Override
    public Human searchById(int id) {
        for (Human human : humans) {
            if (human.getId() == id) {
                return human;
            }
        }
        return null;
    }

    @Override
    public Human deleteById(int id) {
        Human human = null;
        for (Human h : humans) {
            if (h.getId() == id) {
                human = h;
            }
        }
        humans.remove(human);
        return human;

        //c2: lambda expression
//        humans.removeIf(human -> human.getId() == id);
//        System.out.println("Xóa thành công!");
//        return null;
    }

    @Override
    public Human updateById(int id) {
        Human humanUpdate = null;
        Student studentUpdate = null;
        for (Human human : humans) {
            if (human.getId() == id && human instanceof Student) {
                studentUpdate = (Student) human;
            } else if (human.getId() == id) {
                humanUpdate = human;
            }
        }
        if (humanUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                humanUpdate.setName(humanUpdate.getName());
            } else {
                humanUpdate.setName(name);
            }
            System.out.println("Nhập tuổi mới: ");
            humanUpdate.setAge(scanner.nextInt());
            scanner.nextLine();
            return humanUpdate;
        } else if (studentUpdate != null) {
            System.out.println("Nhập tên mới: ");
            studentUpdate.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            studentUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập điểm mới: ");
            studentUpdate.setAveragePoint(scanner.nextDouble());
            scanner.nextLine();
            return studentUpdate;
        }
        return null;
    }

    @Override
    public void sortByAveragePoint() {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Human> humans1 = new ArrayList<>();
        for (Human human : humans) {
            if (human instanceof Student) {
                students.add((Student) human);
            } else {
                humans1.add(human);
            }
        }

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAveragePoint() < o2.getAveragePoint()) {
                    return 1;
                } else if (o1.getAveragePoint() > o2.getAveragePoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //c2: lambda expression
//        students.sort((o1, o2) -> {
//            if (o1.getAveragePoint() < o2.getAveragePoint()) {
//                return 1;
//            } else if (o1.getAveragePoint() > o2.getAveragePoint()) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });

        humans1.addAll(students);
        humans = humans1;
        System.out.println("Sắp xếp thành công!!!");
    }

    @Override
    public double totalAveragePoint() {
        double totalPoint = 0;
        for (Human human : humans) {
            if (human instanceof Student) {
                totalPoint += ((Student) human).getAveragePoint();
            }
        }
        return totalPoint;
    }

    public double totalAverage() {
        double totalPoint = 0;
        int count = 0;
        for (Human human : humans) {
            if (human instanceof Student) {
                totalPoint += ((Student) human).getAveragePoint();
                count++;
            }
        }
        return totalPoint / count;
    }

    public Human createHuman(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            return new Human(name, age);
        } else if (choice == 2) {
            System.out.println("Nhập vào điểm trung bình: ");
            double point = scanner.nextDouble();
            return new Student(name, age, point);
        }
        return null;
    }
}
