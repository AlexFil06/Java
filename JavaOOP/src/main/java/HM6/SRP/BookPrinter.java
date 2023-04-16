package HM6.SRP;

import HM6.SRP.Book;

public class BookPrinter {
    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public void printTitle() {
        System.out.println(book.getTitle());
    }

    public void printAuthor() {
        System.out.println(book.getAuthor());
    }

    public void printPageCount() {
        System.out.println(book.getPageCount());
    }

    public void printGenre() {
        System.out.println(book.getGenre());
    }
}
