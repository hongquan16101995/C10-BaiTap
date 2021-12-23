package baitapthem.btvn3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số sinh viên muốn tạo: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManager studentManager = new StudentManager(students);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả");
            System.out.println("2. Hiển thị điểm cao nhất");
            System.out.println("3. Hiển thị điểm thấp nhất");
            System.out.println("4. Hiển thị thoe giới tính");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Thêm 1 sinh viên");
            System.out.println("7. Xóa 1 sinh viên theo tên");
            System.out.println("8. Sắp xếp theo điểm");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.displayStudent();
                    break;
                case 2:
                    studentManager.displayMaxPoint();
                    break;
                case 3:
                    studentManager.displayMinPoint();
                    break;
                case 4:
                    int choice1;
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Nam");
                        System.out.println("2. Nữ");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:
                                studentManager.displayByGender("Nam");
                                break;
                            case 2:
                                studentManager.displayByGender("Nữ");
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 5:
                    System.out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    studentManager.searchByName(name);
                    break;
                case 6:
                    Student student = createStudent(scanner);
                    studentManager.addStudent(student);
                    break;
                case 7:
                    System.out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String nameDel = scanner.nextLine();
                    studentManager.deleteStudent(nameDel);
                    break;
                case 8:
                    studentManager.sortByAvgPoint();
                    break;
            }
        }while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập giới tính");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm TB");
        double point = scanner.nextDouble();
        return new Student(name1, age, gender, address, point);
    }
}
