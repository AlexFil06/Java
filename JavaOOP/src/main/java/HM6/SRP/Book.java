package HM6.SRP;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private String genre;

    public Book(String title, String author, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getGenre() {
        return genre;
    }
}

