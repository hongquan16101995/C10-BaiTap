package minitest.ngay_09_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tạo mảng n sản phẩm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số sản phẩm muốn tạo: ");
        int size = scanner.nextInt();
        Product[] products = new Product[size];

        //nhập vào n sản phẩm
        createProductArray(scanner, products);

//        //tìm sản phẩm theo tên
//        System.out.println("Nhập vào tên sản phẩm muốn tìm kiếm: ");
//        String searchName = scanner.nextLine();
//        searchProduct(products, searchName);
//        System.out.println("------------------");
//
//        //tìm tất cả các sản phẩm có tên như trên
//        Product[] products1 = searchProduct1(products, searchName);
//        for (Product p : products1) {
//            System.out.println(p);
//        }
//
//        //tính tổng giá sản phẩm
//        double sumPrice = 0;
//        for (Product p : products) {
//            sumPrice += p.getPrice();
//        }
//        System.out.println("Tổng giá các sản phẩm là: " + sumPrice);

        //sửa sản phẩm theo id
        System.out.println("Nhập vào id muốn muốn sửa: ");
        int editId = scanner.nextInt();
        editProducts(products, scanner, editId);
        for (Product p : products) {
            System.out.println(p);
        }

        //xóa sản phẩm theo id
        System.out.println("Nhập vào id muốn xóa: ");
        int deleteId = scanner.nextInt();
        Product[] products2 = deleteProduct(products, scanner, deleteId);
        for (Product p : products2) {
            System.out.println(p);
        }
    }

    public static Product[] deleteProduct(Product[] products, Scanner scanner, int id) {
        scanner.nextLine();
        int count = 0;
        for (Product p : products) {
            if (p.getId() == id) {
                count++;
            }
        }
        Product[] newProducts = new Product[products.length - count];
        int index = 0;
        for (Product product : products) {
            if (!(product.getId() == id)) {
                newProducts[index] = product;
                index++;
            }
        }
        return newProducts;
    }

    public static void editProducts(Product[] products, Scanner scanner, int id) {
        scanner.nextLine();
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("Nhập vào tên mới: ");
                String name = scanner.nextLine();
                p.setName(name);
                System.out.println("Nhập vào loại mới: ");
                String type = scanner.nextLine();
                p.setType(type);
                System.out.println("Nhập vào giá mới: ");
                double price = scanner.nextDouble();
                p.setPrice(price);
            }
        }
    }

    public static void searchProduct(Product[] products, String searchName) {
        boolean check = false;
        for (Product p : products) {
            if (p.getName().equals(searchName)) {
                System.out.println(p);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm nào có tên như trên!!!");
        }
    }

    public static Product[] searchProduct1(Product[] products, String searchName) {
        int count = 0;
        for (Product p : products) {
            if (p.getName().equals(searchName)) {
                count++;
            }
        }
        Product[] newProducts = new Product[count];
        int size = 0;
        for (Product p : products) {
            if (p.getName().equals(searchName)) {
                newProducts[size] = p;
                size++;
            }
        }
        return newProducts;
    }

    public static void createProductArray(Scanner scanner, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1));
            products[i] = createProduct(scanner);
        }
    }

    public static Product createProduct(Scanner scanner) {
        System.out.println("Nhập vào mã sản phẩm: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào loại sản phẩm: ");
        String type = scanner.nextLine();
        Product product = new Product(id, name, price, type);
        return product;
    }
}
