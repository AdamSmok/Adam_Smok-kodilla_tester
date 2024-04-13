package Modul_2_7;

public class Book {
    private String author;
    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    static Book of() {
        return new Book("Isaac Asimov", "The Galaxy");
    }

    public void getTitle() {
        System.out.println("Title: " + title);
    }

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

}
