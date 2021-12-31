package minitest.ngay_30_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Sort great");
            System.out.println("5. Sort less");
            System.out.println("6. Find students by max average point");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Input id your want change: ");
                    int editId = scanner.nextInt();
                    Student studentEdit = studentManager.editStudent(editId);
                    if (studentEdit != null) {
                        System.out.println("Edit successfully!");
                        System.out.println(studentEdit);
                    } else {
                        System.out.println("Edit failed!");
                    }
                    break;
                case 3:
                    System.out.println("Input id your want delete: ");
                    int deleteId = scanner.nextInt();
                    Student studentDelete = studentManager.deleteStudent(deleteId);
                    if (studentDelete != null) {
                        System.out.println("Delete successfully!");
                        System.out.println(studentDelete);
                    } else {
                        System.out.println("Delete failed!");
                    }
                    break;
                case 4:
                    ArrayList<Student> studentsGreate = studentManager.sortGreatestStudent();
                    studentsGreate.forEach(System.out::println);
                    break;
                case 5:
                    ArrayList<Student> studentsLess = studentManager.sortLessStudent();
                    studentsLess.forEach(System.out::println);
                    break;
                case 6:
                    ArrayList<Student> studentMax = studentManager.maxPointStudents();
                    studentMax.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
