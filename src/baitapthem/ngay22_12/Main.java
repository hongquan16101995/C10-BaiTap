package baitapthem.ngay22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả người");
            System.out.println("2. Hiển thị tất cả nam");
            System.out.println("3. Hiển thị tất cả nữ");
            System.out.println("4. Hiển thị tất cả người dưới 20 tuổi");
            System.out.println("5. Thêm 1 người");
            System.out.println("6. Xóa 1 người theo tên ( nếu trùng xóa tên ng đầu");
            System.out.println("7. Sửa 1 người theo tên ( nếu trùng sửa tên ng đầu");
            System.out.println("8. Hiển thị tất cả người theo tên nhập vào");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    humanManager.displayAll();
                    break;
                case 2:
                    System.out.println(humanManager.displayHumanByGender("Nam"));
                    break;
                case 3:
                    System.out.println(humanManager.displayHumanByGender("Nữ"));
                    break;
                case 4:
                    System.out.println(humanManager.displayByAgeUnder20());
                    break;
                case 5:
                    Human human = humanManager.creatHuman();
                    humanManager.addHuman(human);
                    break;
                case 6:
                    System.out.println("Nhập tên người muốn xóa : ");
                    String name6 = scanner.nextLine();
                    System.out.println(humanManager.deleteHumanByName(name6));
                    break;
                case 7:
                    System.out.println("Nhập tên người muốn sửa( không trùng): ");
                    String name7 = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(humanManager.editHuman(name7));
                    break;
                case 8:
                    System.out.println("Nhập tên người muốn hiển thị : ");
                    String name = scanner.nextLine();
                    ArrayList<Human> arrayList = humanManager.displayHumanByName(name);
                    System.out.println(arrayList);
                    break;
            }
        } while (choice != 0);
    }
}
