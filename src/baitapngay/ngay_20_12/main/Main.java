package baitapngay.ngay_20_12.main;

import baitapngay.ngay_20_12.manager.AnimalManager;
import baitapngay.ngay_20_12.model.Animal;
import baitapngay.ngay_20_12.model.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 animal");
            System.out.println("2. Xóa 1 animal theo tên");
            System.out.println("3. Sửa 1 animal theo tên");
            System.out.println("4. Hiển thị 1 animal theo tên");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("6. Hiển thị tất cả Dog");
            System.out.println("7. Hiển thị theo khoảng cân nặng");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("Nhập lựa chọn con vật muốn tạo: ");
                        System.out.println("1. Animal");
                        System.out.println("2. Dog");
                        System.out.println("3. Cat");
                        System.out.println("4. Mouse");
                        System.out.println("0. Exit");
                        choice1 = scanner.nextInt();
                        if (choice1 != 0 && !animalManager.addAnimal(choice1)) {
                            System.out.printf("%S","Tên bị trùng, mời nhập lại!");
                            System.out.println();
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    System.out.println("Nhập vào tên muốn xóa: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    Animal animal = animalManager.deleteAnimal(name);
                    if (animal == null) {
                        System.out.println("Xóa không thành công!");
                    } else {
                        animal.display();
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào tên muốn sửa: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    Animal animalEdit = animalManager.updateAnimal(editName);
                    if (animalEdit == null) {
                        System.out.println("Sửa không thành công!");
                    } else {
                        animalEdit.display();
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào tên muốn hiển thị: ");
                    scanner.nextLine();
                    String displayName = scanner.nextLine();
                    animalManager.displayAnimal(displayName);
                    break;
                case 5:
                    System.out.println("Hiển thị tất cả: ");
                    System.out.printf("%-20S%-20S%-20S%S", "Loại", "Tên", "Tuổi", "Cân nặng");
                    System.out.println();
                    animalManager.displayAllAnimal();
                    break;
                case 6:
                    System.out.println("Tất cả Dog trong tập hợp: ");
                    System.out.printf("%-20S%-20S%-20S%S", "Loại", "Tên", "Tuổi", "Cân nặng");
                    System.out.println();
                    ArrayList<Dog> dogs = animalManager.displayAllDog();
                    for (Dog dog : dogs) {
                        dog.display();
                        dog.makeSound();
                    }
                    break;
                case 7:
                    System.out.println("Nhập vào khoảng giá dưới: ");
                    int priceDown = scanner.nextInt();
                    System.out.println("Nhập vào khoảng giá trên: ");
                    int priceUp = scanner.nextInt();
                    ArrayList<Animal> animals = animalManager.listAnimalByWeight(priceDown, priceUp);
                    System.out.println("Hiển thị tất cả theo khoảng giá: ");
                    System.out.printf("%-20S%-20S%-20S%S", "Loại", "Tên", "Tuổi", "Cân nặng");
                    System.out.println();
                    for (Animal ani : animals) {
                        ani.display();
                    }
                    break;
            }
        } while (choice != 0);
    }
}
