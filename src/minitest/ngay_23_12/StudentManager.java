package minitest.ngay_23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student creatStudent() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        System.out.println("Input pointMath: ");
        double math = scanner.nextDouble();
        System.out.println("Input pointPhy: ");
        double phy = scanner.nextDouble();
        System.out.println("Input pointChe: ");
        double che = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, math, phy, che);
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public Student updateStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println("Input new name: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Input new age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Input new pointMath: ");
            double math = scanner.nextDouble();
            student.setPointMath(math);
            System.out.println("Input new pointPhy: ");
            double phy = scanner.nextDouble();
            student.setPointPhy(phy);
            System.out.println("Input new pointChe: ");
            double che = scanner.nextDouble();
            student.setPointChe(che);
            scanner.nextLine();
            students.set(index, student);
        }
        return student;
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
        }
        return student;
    }

    public Student searchById(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        return student;
    }

    public ArrayList<Student> getStudentsByMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double avg = students.get(0).getAvgPoint();
        for (Student s : students) {
            if (s.getAvgPoint() > avg) {
                avg = s.getAvgPoint();
            }
        }
        for (Student s : students) {
            if (s.getAvgPoint() == avg) {
                studentsMax.add(s);
            }
        }
        return studentsMax;
    }

    public ArrayList<Student> sortByAvgPoint() {
        students.sort((o1, o2) -> Double.compare(o2.getAvgPoint(), o1.getAvgPoint()));
        return students;
    }
}
