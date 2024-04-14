package Modul_2_7;

public class BookTest {
    public static void main(String[] args) {
        String author = "abc";
        String title = "def";
        Book book = Book.of(author,title);
        Book book1 = new Book(author,title);

        book.getAuthor();
        book.getTitle();
        book1.getAuthor();
        book1.getTitle();
    }
}
