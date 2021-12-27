package thuchanhtonghop.bai2.manager;

import thuchanhtonghop.bai2.model.Bill;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Manager {
    HashMap<Integer, Bill> bills;
    Scanner scanner = new Scanner(System.in);

    public Manager(String path) throws IOException, ClassNotFoundException{
        bills = readBillFromFile(path);
    }

    public HashMap<Integer, Bill> getBills() {
        return bills;
    }

    public boolean addBill() {
        System.out.println("Nhập vào tên chủ hộ:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào số nhà:");
        int homeNumber = scanner.nextInt();
        System.out.println("Nhập vào mã số công tơ:");
        int idElectric = scanner.nextInt();
        System.out.println("Nhập vào chỉ số cũ:");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập vào chỉ số mới:");
        int newIndex = scanner.nextInt();
        scanner.nextLine();
        if (oldIndex <= newIndex) {
            Bill bill = new Bill(name, homeNumber, idElectric, oldIndex, newIndex);
            return checkIdElectricOfBill(bill);
        }
        return false;
    }

    private boolean checkIdElectricOfBill(Bill bill) {
        HashSet<Integer> integers = new HashSet<>(bills.keySet());
        if (integers.add(bill.getIdElectric())) {
            bills.put(bill.getIdElectric(), bill);
            return true;
        } else {
            return false;
        }
    }

    public void displayAll() {
        for (Bill bill : bills.values()) {
            System.out.println(bill);
        }
    }

    public void getElectricBillByIdElectric(int idElectric) {
        Bill bill = null;
        for (Bill bill1 : bills.values()) {
            if (bill1.getIdElectric() == idElectric) {
                bill = bill1;
            }
        }
        if (bill == null) {
            System.err.println("Không tìm thấy!");
        } else {
            System.out.println("Gia đình ông/bà " + bill.getName() + " phải thanh toán:");
            System.out.println(bill.getElectricBill());
        }
    }

    public void writeBillToFile(HashMap<Integer, Bill> bills, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(bills);
        objectOutputStream.close();
        System.out.println("Write successfully!");
    }

    public HashMap<Integer, Bill> readBillFromFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        return (HashMap<Integer, Bill>) objectInputStream.readObject();
    }
}
