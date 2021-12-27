package thuchanhtonghop.bai2.main;

import thuchanhtonghop.bai2.manager.Manager;
import thuchanhtonghop.bai2.model.Bill;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final String PATH_NAME = "src/thuchanhtonghop/bai2/bills";
    public static void main(String[] args) {
        Manager manager = null;
        try {
            manager = new Manager(PATH_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        if (manager != null) {
            int choice;
            do {
                System.out.println("MENU:");
                System.out.println("1. Add Customer");
                System.out.println("2. Display All");
                System.out.println("3. Display Electric Bill By IdElectric");
                System.out.println("4. Write Bill To File");
                System.out.println("5. Read Bill From File");
                System.out.println("0. Exit");
                System.out.println("Enter your choice");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        if (!manager.addBill()) {
                            System.out.println("IdElectric bị trùng hoặc nhập sai chỉ số, mời nhập lại!");
                        }
                        break;
                    case 2:
                        manager.displayAll();
                        break;
                    case 3:
                        System.out.println("Enter idElectric:");
                        int idSearch = scanner.nextInt();
                        manager.getElectricBillByIdElectric(idSearch);
                        break;
                    case 4:
                        try {
                            HashMap<Integer, Bill> billHashMap = manager.getBills();
                            manager.writeBillToFile(billHashMap, PATH_NAME);
                        } catch (IOException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            HashMap<Integer, Bill> billHashMap = manager.readBillFromFile(PATH_NAME);
                            billHashMap.values().forEach(System.out::println);
                        } catch (IOException | ClassNotFoundException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                }
            } while (choice != 0);
        }
    }
}
