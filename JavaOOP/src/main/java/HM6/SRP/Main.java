package HM6.SRP;

import HM6.SRP.Book;
import HM6.SRP.BookPrinter;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Туман", "Стивен Кинг", 208, "Ужасы");

        BookPrinter printer = new BookPrinter(book);

        printer.printTitle();
        printer.printAuthor();
        printer.printPageCount();
        printer.printGenre();
    }
}
