package baitapthem.btvn1.main;

import baitapthem.btvn1.manager.BookManager;
import baitapthem.btvn1.model.Book;
import baitapthem.btvn1.model.NovelBook;
import baitapthem.btvn1.model.ScienceBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[9];

        books[0] = new Book("A", 10000, 10, "13/12/2021");
        books[1] = new Book("B", 90000, 20, "13/12/2021");
        books[2] = new Book("C", 30000, 30, "13/12/2021");
        books[3] = new ScienceBook("D", 10000, 40, "13/12/2021", "Java");
        books[4] = new ScienceBook("E", 50000, 50, "13/12/2021", "PHP");
        books[5] = new ScienceBook("F", 60000, 60, "13/12/2021", "PHP");
        books[6] = new NovelBook("G", 70000, 70, "13/12/2021", "Dương");
        books[7] = new NovelBook("H", 80000, 80, "13/12/2021", "Dương");
        books[8] = new NovelBook("J", 90000, 90, "13/12/2021", "Hiếu");

        BookManager bookManager = new BookManager();
//        bookManager.displayAllBook(books);
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
        bookManager.displayNovelBook(books);
        bookManager.displayScienceBook(books);
        System.out.println("Nhập vào giá muốn tìm");
        long price = scanner.nextLong();
        bookManager.searchByPrice(books, price);
        System.out.println("Nhập vào khoảng giá muốn tìm: ");
        System.out.println("Giá trên: ");
        long maxPrice = scanner.nextLong();
        System.out.println("Giá dưới: ");
        long minPrice = scanner.nextLong();
        bookManager.rangePrice(books, minPrice, maxPrice);
    }
}
