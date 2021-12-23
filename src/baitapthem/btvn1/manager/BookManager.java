package baitapthem.btvn1.manager;

import baitapthem.btvn1.model.Book;
import baitapthem.btvn1.model.NovelBook;
import baitapthem.btvn1.model.ScienceBook;

import java.util.Scanner;

public class BookManager {
    public Book[] createListBook(Scanner scanner) {
        System.out.println("Nhập vào số lượng sách cần tạo: ");
        int size = scanner.nextInt();
        return new Book[size];
    }

    public void displayScienceBook(Book[] books) {
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

    public void displayNovelBook(Book[] books) {
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

    public void rangePrice(Book[] books, long minPrice, long maxPrice) {
        boolean check = false;
        System.out.println("Các quyển sách trong khoảng giá là: ");
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có sách nào có thể loại đó!!!");
        }
        System.out.println("---------------");
    }

    public void searchByPrice(Book[] books, long price) {
        boolean check = false;
        System.out.println("Các quyển sách có giá như trên là: ");
        for (Book book : books) {
            if (book.getPrice() == price) {
                check = true;
                System.out.println(book);
            }
        }
        if (!check) {
            System.out.println("Không có sách nào có thể loại đó!!!");
        }
        System.out.println("---------------");
    }

    public void displayAllBook(Book[] books) {
        System.out.println("Tất cả sách là: ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------");
    }

    public void sumPrice(Book[] books) {
        long sumPrice = 0;
        for (Book book : books) {
            sumPrice += (book.getPrice() * book.getQuantity());
        }
        System.out.println("Tổng giá của tất cả sách là: ");
        System.out.println(sumPrice);
        System.out.println("---------------");
    }

    public void maxPrice(Book[] books) {
        long maxPrice = books[0].getPrice();
        for (Book book : books) {
            if (book.getPrice() > maxPrice) {
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

    public void minPrice(Book[] books) {
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

    public void searchByType(Book[] books, String searchType) {
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

    public void searchByAuthor(Book[] books, String searchAuthor) {
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

    public void averagePriceOfScienceBook(Book[] books) {
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
