package baitapthem.btvn2.manager;

import baitapthem.btvn2.model.Book;
import baitapthem.btvn2.model.NovelBook;
import baitapthem.btvn2.model.ScienceBook;

import java.util.Scanner;

public class BookManager {
    private Book[] books;
    private static int index = 0;

    public BookManager() {
    }

    public BookManager(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Scanner scanner, int choice, String name, long price, int quantity, String date) {
        if (choice == 1) {
            Book book = new Book(name, price, quantity, date);
            books[index] = book;
            index++;
        } else if (choice == 2) {
            System.out.println("Nhập vào thể loại của sách: ");
            String type = scanner.nextLine();
            ScienceBook scienceBook = new ScienceBook(name, price, quantity, date, type);
            books[index] = scienceBook;
            index++;
        } else if (choice == 3){
            System.out.println("Nhập vào tác giả của sách: ");
            String author = scanner.nextLine();
            NovelBook novelBook = new NovelBook(name, price, quantity, date, author);
            books[index] = novelBook;
            index++;
        }
    }

    public void displayScienceBook() {
        boolean check = false;
        System.out.println("Các quyển sách khoa học là: ");
        for (Book book : books) {
            if (book instanceof ScienceBook) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có quyển sách khoa học nào!!!");
        }
        System.out.println("---------------");
    }

    public void displayNovelBook() {
        boolean check = false;
        System.out.println("Các quyển sách tiểu thuyết là: ");
        for (Book book : books) {
            if (book instanceof NovelBook) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có quyển sách tiểu thuyết nào!!!");
        }
        System.out.println("---------------");
    }

    public void rangePrice(long minPrice, long maxPrice) {
        boolean check = false;
        System.out.println("Các quyển sách trong khoảng giá là: ");
        for (Book book : books) {
            boolean betweenTwoPrice = book.getPrice() >= minPrice && book.getPrice() <= maxPrice;
            if (betweenTwoPrice) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có sách nào có thể loại đó!!!");
        }
        System.out.println("---------------");
    }

    public void searchByPrice(long price) {
        boolean check = false;
        System.out.println("Các quyển sách có giá như trên là: ");
        for (Book book : books) {
            boolean comparePrice = book.getPrice() == price;
            if (comparePrice) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có sách nào có thể loại đó!!!");
        }
        System.out.println("---------------");
    }

    public void displayAllBook() {
        System.out.println("Tất cả sách là: ");
        for (Book book : books) {
            boolean compareNull = book != null;
            if (compareNull) {
                System.out.println(book);
            }
        }
        System.out.println("---------------");
    }

    public void sumPrice() {
        long sumPrice = 0;
        for (Book book : books) {
            sumPrice += (book.getPrice() * book.getQuantity());
        }
        System.out.println("Tổng giá của tất cả sách là: ");
        System.out.println(sumPrice);
        System.out.println("---------------");
    }

    public void maxPrice() {
        long maxPrice = books[0].getPrice();
        for (Book book : books) {
            boolean comparePrice = book.getPrice() > maxPrice;
            if (comparePrice) {
                maxPrice = book.getPrice();
            }
        }
        System.out.println("Những quyển sách có giá cao nhất là: ");
        for (Book book : books) {
            if (book.getPrice() == maxPrice) {
                System.out.println(book);
            }
        }
        System.out.println("---------------");
    }

    public void minPrice() {
        long minPrice = books[0].getPrice();
        for (Book book : books) {
            if (book.getPrice() < minPrice) {
                minPrice = book.getPrice();
            }
        }
        System.out.println("Những quyển sách có giá thấp nhất là: ");
        for (Book book : books) {
            if (book.getPrice() == minPrice) {
                System.out.println(book);
            }
        }
        System.out.println("---------------");
    }

    public void searchByType(String searchType) {
        boolean check = false;
        for (Book book : books) {
            if (book instanceof ScienceBook) {
                if (((ScienceBook) book).getType().equals(searchType)) {
                    check = true;
                    System.out.println(book);
                }
            }
        }
        if (!check) {
            System.out.println("Không có sách nào có thể loại đó!!!");
        }
        System.out.println("---------------");
    }

    public void searchByAuthor(String searchAuthor) {
        boolean check = false;
        for (Book book : books) {
            if (book instanceof NovelBook) {
                if (((NovelBook) book).getAuthor().equals(searchAuthor)) {
                    check = true;
                    System.out.println(book);
                }
            }
        }
        if (!check) {
            System.out.println("Không có sách của tác giả đó!!!");
        }
        System.out.println("---------------");
    }

    public void averagePriceOfScienceBook() {
        long average = 0;
        int count = 0;
        for (Book book : books) {
            if (book instanceof ScienceBook) {
                average += book.getPrice();
                count++;
            }
        }
        System.out.println("Trung bình đơn giá của sách khoa học là: ");
        System.out.println(average / count);
        System.out.println("---------------");
    }
}
