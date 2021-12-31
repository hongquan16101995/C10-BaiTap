package minitest.ngay_30_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/minitest/ngay_30_12/students.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFile(PATH_NAME);
    }

    public void addStudent() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán:");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Lý:");
        double phy = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa:");
        double che = scanner.nextDouble();
        students.add(new Student(name, age, math, phy, che));
    }

    public Student editStudent(int code) {
        Student student = null;
        for (Student s : students) {
            if (s.getCode() == code) {
                student = s;
            }
        }
        if (student != null) {
            int i = students.indexOf(student);
            System.out.println("Nhập tên mới:");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Nhập tuổi mới:");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhập điểm Toán mới:");
            double math = scanner.nextDouble();
            student.setPointMath(math);
            System.out.println("Nhập điểm Lý mới:");
            double phy = scanner.nextDouble();
            student.setPointPhy(phy);
            System.out.println("Nhập điểm Hóa mới:");
            double che = scanner.nextDouble();
            student.setPointChe(che);
            students.set(i, student);
        }
        return student;
    }

    public Student deleteStudent(int code) {
        Student student = null;
        for (Student s : students) {
            if (s.getCode() == code) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
        }
        return student;
    }

    public ArrayList<Student> sortGreatestStudent() {
        students.sort((o1, o2) -> Double.compare(o1.getAverage(), o2.getAverage()));
        return students;
    }

    public ArrayList<Student> sortLessStudent() {
        students.sort((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage()));
        return students;
    }

    public ArrayList<Student> maxPointStudents() {
        ArrayList<Student> student = new ArrayList<>();
        double point = students.get(0).getAverage();
        for (Student s : students) {
            if (s.getAverage() > point) {
                point = s.getAverage();
            }
        }
        for (Student s : students) {
            if (s.getAverage() == point) {
                student.add(s);
            }
        }
        return student;
    }

    public void writeFile(ArrayList<Student> students, String pathName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
            for (Student student : students) {
                bufferedWriter.write(student.getCode() + "," + student.getName() + "," + student.getAge()
                        + "," + student.getPointMath() + "," + student.getPointPhy() + "," + student.getPointChe() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String pathName) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[1], Integer.parseInt(strings[2]),
                        Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), Double.parseDouble(strings[5])));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }
}
