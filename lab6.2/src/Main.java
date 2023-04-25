public class Main {
    public static void main(String[] args) {
        // Створюємо кілька книг
        Book book1 = new Book("Тисяча пам'ятних поцілунків", "Тіллі Коул ", 2022, 384);
        Book book2 = new Book("Керуй своєю підсвідомістю", "Джо Диспенза", 2020, 368);
        Book book3 = new Book("Яблука Єви", "Христина Коціра", 2022, 224 );
        Book book4 = new Book("Керрі", "Стівен Кінг", 2018, 224 );


        // Створюємо бібліотеку та додаємо до неї книги
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Виводимо кількість книг у бібліотеці
        System.out.println("Кількість книг у бібліотеці: " + library.getBooks());


        // Створюємо користувача бібліотеки
        User user = new User("John", "Doe");
    }
}