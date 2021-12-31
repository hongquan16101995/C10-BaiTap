package minitest.update_ngay_30_12;

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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent() {
        Human.VALUE = setValue();
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
        scanner.nextLine();
        students.add(new Student(name, age, math, phy, che));
        writeFile(students, PATH_NAME);
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
            scanner.nextLine();
            student.setPointChe(che);
            students.set(i, student);
            writeFile(students, PATH_NAME);
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
            writeFile(students, PATH_NAME);
        }
        return student;
    }

    public ArrayList<Student> sortGreatestStudent() {
        students.sort((o1, o2) -> Double.compare(o1.getAverage(), o2.getAverage()));
        writeFile(students, PATH_NAME);
        return students;
    }

    public ArrayList<Student> sortLessStudent() {
        students.sort((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage()));
        writeFile(students, PATH_NAME);
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
            writeValue();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void writeValue() {
        try {
            String PATH_NAME = "src/minitest/ngay_30_12/hi.txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_NAME));
            bufferedWriter.write(Human.VALUE);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String pathName) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(pathName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] strings = line.split(",");
                    students.add(new Student(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]),
                            Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), Double.parseDouble(strings[5])));
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }

    public int setValue() {
        try {
            String PATH_NAME = "src/minitest/ngay_30_12/hi.txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_NAME));
            int i;
            if ((i =  bufferedReader.read()) != -1) {
                return i;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }
}
