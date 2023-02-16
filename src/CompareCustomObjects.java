import java.util.Objects;

public class CompareCustomObjects {
    public static void main(String[] args) {
        Book bookOne = new Book("OCA", 350);
        Book bookTwo = new Book("OCA", 350);

        // How do you compare these two objects?
        // 1. Do it manually for each property
        if (bookOne.title.equals(bookTwo.title) && bookOne.pages == bookTwo.pages) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // 2. By overriding equals method
        if (bookOne.equals(bookTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

class Book {
    public String title;
    public int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }
}