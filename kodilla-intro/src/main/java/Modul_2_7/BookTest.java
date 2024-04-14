package Modul_2_7;

public class BookTest {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        Book book1 = Book.of("Andrzej Sapkowski", "Krew Elfów");
        Book book2 = new Book("Andrzej Sapkowski", "Krew Elfów");

        book.getAuthor();
        book.getTitle();
        book1.getAuthor();
        book1.getTitle();
        book2.getAuthor();
        book2.getTitle();
    }
}
