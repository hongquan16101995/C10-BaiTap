package minitest.ngay_23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Search student by id");
            System.out.println("5. Sort by average point");
            System.out.println("6. Find students by max average point");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManager.creatStudent();
                    if (studentManager.addStudent(student)) {
                        System.out.println("Add successfully!");
                    } else {
                        System.out.println("Add failed!");
                    }
                    break;
                case 2:
                    System.out.println("Input id your want change: ");
                    int editId = scanner.nextInt();
                    Student studentEdit = studentManager.updateStudent(editId);
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
                    System.out.println("Input id your want search: ");
                    int searchId = scanner.nextInt();
                    Student studentSearch = studentManager.searchById(searchId);
                    if (studentSearch != null) {
                        System.out.println(studentSearch);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    ArrayList<Student> students = studentManager.sortByAvgPoint();
                    students.forEach(System.out::println);
                    break;
                case 6:
                    ArrayList<Student> studentMax = studentManager.getStudentsByMaxPoint();
                    studentMax.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
