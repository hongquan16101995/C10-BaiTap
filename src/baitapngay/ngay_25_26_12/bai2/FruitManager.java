package baitapngay.ngay_25_26_12.bai2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FruitManager {
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public FruitManager() {
    }

    public void displayAll() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void displayApple() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                System.out.println(fruit);
            }
        }
    }

    public void displayBanana() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Banana) {
                System.out.println(fruit);
            }
        }
    }

    public void displayLemon() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Lemon) {
                System.out.println(fruit);
            }
        }
    }

    public Fruit createFruit(int choice) {
        System.out.println("Nhập cân nặng(kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập vị");
        scanner.nextLine();
        String taste = scanner.nextLine();
        System.out.println("Nhập màu sắc:");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        if (choice == 1) {
            return new Apple(weight, taste, color, price);
        } else if (choice == 2) {
            return new Banana(weight, taste, color, price);
        } else if (choice == 3) {
            return new Lemon(weight, taste, color, price);
        }
        return null;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public ArrayList<Fruit> deleteByPrice(double price) {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == price) {
                fruitArrayList.add(fruit);
            }
        }
        fruits.removeAll(fruitArrayList);
        return fruitArrayList;
    }

    public void displayByMaxPrice() {
        double maxPrice = fruits.get(0).getPrice();
        for (Fruit fruit : fruits) {
            if (fruit.getPrice() > maxPrice) {
                maxPrice = fruit.getPrice();
            }
        }

        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == maxPrice) {
                System.out.println(fruit);
            }
        }
    }

    public void displayByMinPrice() {
        double minPrice = fruits.get(0).getPrice();
        for (Fruit fruit : fruits) {
            if (fruit.getPrice() < minPrice) {
                minPrice = fruit.getPrice();
            }
        }

        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == minPrice) {
                System.out.println(fruit);
            }
        }
    }

    public void exportCsv() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(String.format("src/baitapngay/ngay_25_26_12/bai2/test_%s.csv", new Date().getTime())))) {

            StringBuilder sb = new StringBuilder();
            sb.append("CanNang,");
            sb.append("Vi,");
            sb.append("Mau,");
            sb.append("Gia");
            sb.append('\n');

            if (fruits.size() > 0) {
                for (Fruit fruit : fruits) {
                    sb.append(fruit.getWeight());
                    sb.append(',');
                    sb.append(fruit.getTaste());
                    sb.append(',');
                    sb.append(fruit.getColor());
                    sb.append(',');
                    sb.append(fruit.getPrice());
                    sb.append('\n');
                }

            }
            bufferedWriter.write(sb.toString());
            System.out.println("Write successfully!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
