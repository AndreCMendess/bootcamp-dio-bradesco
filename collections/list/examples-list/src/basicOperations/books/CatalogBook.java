package basicOperations.books;

import java.util.ArrayList;
import java.util.List;

public class CatalogBook {

    List<Book> listBook;
    
    public CatalogBook() {
        this.listBook = new ArrayList<>();
    }

    public void addBook(String title, String author, int agePublication) {
        Book newBook = new Book(title, author, agePublication);
        this.listBook.add(newBook);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if(!this.listBook.isEmpty()) {
            for(Book b: listBook) {
                if(b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }

        return booksByAuthor;
    }

    public List<Book> searchByYearRange(int yearInitial , int yearFinal) {
        List<Book> booksByRange = new ArrayList<>();
        if(!this.listBook.isEmpty()) {
            for(Book b: listBook) {
                if(b.getYearPublication() >= yearInitial && b.getYearPublication() <= yearFinal) {
                    booksByRange.add(b);
                }
            }
        }

        return booksByRange;
    }

    public Book searchByTitle(String title) {
        Book bookFound = null;
        if(!this.listBook.isEmpty()) {
            for(Book b: listBook) {
                if(b.getTitle().equalsIgnoreCase(title)) {
                    bookFound = b;
                    break;
                }
            }
        }
        return bookFound;
    }

}