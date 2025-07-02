public class Main {

    public static void main(String[] args) {


        Author[] authors = new Author[3];
        authors[0] = new Author("Лондон", "Джек");
        authors[1] = new Author("Ферранте", "Элена");
        authors[2] = new Author("Лондон", "Кирил");

        Book[] books = new Book[2];
        books[0] = new Book("Cтранник по звездам", authors[0], 1500);
        books[1] = new Book("Моя гениальная подруга", authors[1], 2500);

        //печатаю для самопроверки
        for (Book book : books) {
            System.out.println("books[i] = " + book.getAll());
        }


        System.out.println();
        books[1].setYearOfPublication(1895);
        System.out.println("books[1].getAll() = " + books[1].getAll());

        System.out.println();
        //написал методы класса самостоятельно
        System.out.println("authors[1].equals(authors[2]) = " + authors[1].equals(authors[0]));
        System.out.println("authors[0].hashCode() = " + authors[0].hashCode());
        //сгенерированы IDEA
        System.out.println("books[0].toString() = " + books[0].toString());  //IDEA выдаёт предупреждение Unnecessary 'toString()' call - расскажите, пожалуйста, почему
        System.out.println("books[0].equals(books[1]) = " + books[0].equals(books[1]));
        System.out.println("books[0].hashCode() = " + books[0].hashCode());


    }
}