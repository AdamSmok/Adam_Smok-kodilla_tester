package Modul_2_7;

public class Book {
    private final String author;
    private final String title;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public void getTitle() {
        System.out.println("Title: " + title);
    }

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

}

