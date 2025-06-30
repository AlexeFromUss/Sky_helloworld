public class Main {

    public static void main(String[] args) {


        Author [] authors = new Author[2];
        authors[0] = new Author("Лондон", "Джек");
        authors[1] = new Author("Ферранте", "Элена");

        Book [] books = new Book[2];
        books[0] = new Book("Cтранник по звездам", authors[0], 1500);
        books[1] = new Book("Моя гениальная подруга", authors[1], 2500);

        //печатаю для самопроверки
        for (Book book : books) {
            System.out.println("books[i] = " + book.getAll());
        }

        /* В 6 пункте не понял "Создайте отдельный класс для запуска приложения и объявите метод main в нем."   Делаю здесь же... */
        System.out.println();
        books[1].setYearOfPublication(1895);
        System.out.println("books[1].getAll() = " + books[1].getAll());


    }
}