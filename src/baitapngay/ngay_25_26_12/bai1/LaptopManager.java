package baitapngay.ngay_25_26_12.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    private final ArrayList<Laptop> laptops = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public LaptopManager() {
    }

    public Laptop createLaptop() {
        System.out.println("Nhập hãng:");
        String brand = scanner.nextLine();
        System.out.println("Nhập màu sắc:");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền:");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        return new Laptop(brand, color, price, quantity);
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Laptop editLaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }
        }
        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            System.out.println("Nhập hãng mới:");
            String brand = scanner.nextLine();
            laptop.setBrand(brand);
            System.out.println("Nhập màu sắc mới:");
            String color = scanner.nextLine();
            laptop.setColor(color);
            System.out.println("Nhập giá tiền mới:");
            double price = scanner.nextDouble();
            laptop.setPrice(price);
            System.out.println("Nhập số lượng mới:");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            laptop.setQuantity(quantity);
            laptops.set(index, laptop);
        }
        return laptop;
    }

    public Laptop deleteLaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }
        }
        if (laptop != null) {
            laptops.remove(laptop);
        }
        return laptop;
    }

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public ArrayList<Laptop> searchByPriceRange(double priceD, double priceU) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() >= priceD && laptop.getPrice() <= priceU) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<Laptop> searchByBrand(String brand) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(brand)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<Laptop> searchByColor(String color) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getColor().equals(color)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<String> listBrand() {
        ArrayList<String> strings = new ArrayList<>();
        for (Laptop laptop : laptops) {
            strings.add(laptop.getBrand());
        }
        return strings;
    }

    public void writeBrand(ArrayList<String> brandList, String pathName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
        for (String string : brandList) {
            bufferedWriter.write(string + "\n");
        }
        bufferedWriter.close();
    }

    public void readBrand(String pathName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
        }
    }
}
