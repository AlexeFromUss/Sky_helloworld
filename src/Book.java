import java.util.Objects;

public class Book {
    private String titleBook;
    private Author authorBook;
    private int yearOfPublication;

    public Book(String titleBook, Author authorBook, int yearOfPublication) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }

    public String getAll() {
        return (titleBook + ", " + authorBook.getAuthorLastName() + " " + authorBook.getAuthorName() + " " + yearOfPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(titleBook, book.titleBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, authorBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", authorBook=" + authorBook.toString() +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
