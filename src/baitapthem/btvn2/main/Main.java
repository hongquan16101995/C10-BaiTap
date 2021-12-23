package baitapthem.btvn2.main;

import baitapthem.btvn2.manager.BookManager;
import baitapthem.btvn2.model.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sách cần tạo: ");
        int size = scanner.nextInt();
        Book[] books = new Book[size];
        BookManager bookManager = new BookManager(books);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Thêm sách");
            System.out.println("2.Hiển thị tất cả sách");
            System.out.println("3.Hiển thị sách khoa học");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1.Thêm sách thường");
                        System.out.println("2.Thêm sách khoa học");
                        System.out.println("3.Thêm sách tiểu thuyết");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        scanner.nextLine();
                        if (choice1 != 0) {
                            System.out.println("Nhập vào tên sách: ");
                            String name = scanner.nextLine();
                            System.out.println("Nhập vào đơn giá của sách: ");
                            long price = scanner.nextLong();
                            System.out.println("Nhập vào số lượng sách: ");
                            int quantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập vào ngày tạo sách: ");
                            String date = scanner.nextLine();
                            bookManager.addBook(scanner, choice1, name, price, quantity, date);
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    bookManager.displayAllBook();
                    break;
                case 3:
                    bookManager.displayScienceBook();
                    break;
            }
        } while (choice != 0);


//        books[0] = new Book("A", 10000, 10, "13/12/2021");
//        books[1] = new Book("B", 90000, 20, "13/12/2021");
//        books[2] = new Book("C", 30000, 30, "13/12/2021");
//        books[3] = new ScienceBook("D", 10000, 40, "13/12/2021", "Java");
//        books[4] = new ScienceBook("E", 50000, 50, "13/12/2021", "PHP");
//        books[5] = new ScienceBook("F", 60000, 60, "13/12/2021", "PHP");
//        books[6] = new NovelBook("G", 70000, 70, "13/12/2021", "Dương");
//        books[7] = new NovelBook("H", 80000, 80, "13/12/2021", "Dương");
//        books[8] = new NovelBook("J", 90000, 90, "13/12/2021", "Hiếu");

//        bookManager.displayAllBook();
//        bookManager.sumPrice(books);
//        bookManager.maxPrice(books);
//        bookManager.minPrice(books);
//        System.out.println("Nhập vào thể loại muốn tìm: ");
//        String type = scanner.nextLine();
//        bookManager.searchByType(books, type);
//        System.out.println("Nhập vào tác giả muốn tìm: ");
//        String author = scanner.nextLine();
//        bookManager.searchByAuthor(books, author);
//        bookManager.averagePriceOfScienceBook(books);
        System.out.println("---------------------Nâng cao--------------------");
//        bookManager.displayNovelBook(books);
//        bookManager.displayScienceBook(books);
//        System.out.println("Nhập vào giá muốn tìm");
//        long price = scanner.nextLong();
//        bookManager.searchByPrice(books, price);
//        System.out.println("Nhập vào khoảng giá muốn tìm: ");
//        System.out.println("Giá trên: ");
//        long maxPrice = scanner.nextLong();
//        System.out.println("Giá dưới: ");
//        long minPrice = scanner.nextLong();
//        bookManager.rangePrice(books, minPrice, maxPrice);
    }


}
