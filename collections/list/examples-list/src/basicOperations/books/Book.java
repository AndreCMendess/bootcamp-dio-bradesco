package basicOperations.books;

public class Book {
    private String title;
    private String author;
    private int yearPublication;

    public Book(String title , String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    
    public int getYearPublication() {
        return yearPublication;
    }
}
