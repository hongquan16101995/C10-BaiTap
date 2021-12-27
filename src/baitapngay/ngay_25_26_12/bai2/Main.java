package baitapngay.ngay_25_26_12.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Hiển thị tất cả các loại quả");
            System.out.println("2. Hiển thị tất cả quả táo");
            System.out.println("3. Hiển thị tất cả quả chuối");
            System.out.println("4. Hiển thị tất cả quả chanh");
            System.out.println("5. Hiển thị quả có giá cao nhất");
            System.out.println("6. Với 100000 bạn có thể mua được nhiều nhất");
            System.out.println("7. Thêm quả");
            System.out.println("8. Xóa quả theo giá");
            System.out.println("9. Ghi vào file CSV");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fruitManager.displayAll();
                    break;
                case 2:
                    fruitManager.displayApple();
                    break;
                case 3:
                    fruitManager.displayBanana();
                    break;
                case 4:
                    fruitManager.displayLemon();
                    break;
                case 5:
                    fruitManager.displayByMaxPrice();
                    break;
                case 6:
                    fruitManager.displayByMinPrice();
                    break;
                case 7:
                    menu(scanner, fruitManager);
                    break;
                case 8:
                    System.out.println("Nhập giá muốn xóa: ");
                    double price = scanner.nextDouble();
                    ArrayList<Fruit> fruitDelete = fruitManager.deleteByPrice(price);
                    fruitDelete.forEach(System.out::println);
                    break;
                case 9:
                    fruitManager.exportCsv();
                    break;
            }
        } while (choice != 0);
    }

    public static void menu(Scanner scanner, FruitManager fruitManager) {
        int choice1;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Thêm quả táo");
            System.out.println("2. Thêm quả chuối");
            System.out.println("3. Thêm quả chanh");
            System.out.println("0. Quay lại MENU");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    Apple apple = (Apple) fruitManager.createFruit(choice1);
                    fruitManager.addFruit(apple);
                    break;
                case 2:
                    Banana banana = (Banana) fruitManager.createFruit(choice1);
                    fruitManager.addFruit(banana);
                    break;
                case 3:
                    Lemon lemon = (Lemon) fruitManager.createFruit(choice1);
                    fruitManager.addFruit(lemon);
                    break;
            }
        } while (choice1 != 0);
    }
}
