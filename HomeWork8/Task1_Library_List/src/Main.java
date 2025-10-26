import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Reader reader1 = new Reader("Ivan", "Ivanovich", "Ivanov", 11101
                , "IEF", LocalDate.of(2002, 10, 27), "+375291309876");

        Reader reader2 = new Reader("Petr", "Petrovich", "Petrov", 11102
                , "FIT", LocalDate.of(2001, 5, 15), "+375291112233");

        library.addReader(reader1);
        library.addReader(reader2);

        System.out.println("Добавлен читатель:\n" + reader1.GetUserFullInfo());

        reader1.takeBook("Война и Мир", "Л.Н.Толстой");
        reader1.takeBook("Война и Мир", "Л.Н.Толстой"); // Дубликат
        reader1.returnBook(new Book("Раскраска для малышей", "Феодот Пынченко")); // Нет такой
        reader1.returnBook("Война и Мир"); // Возврат
        reader1.returnBook("Война и Мир"); // Повторный возврат

        reader1.printStatus();
        reader1.printStatus("short");

        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book2 = new Book("Собачье сердце", "Михаил Булгаков");
        reader1.takeBook(book1);
        reader1.takeBook(book2);

        reader1.printStatus();
        reader1.printStatus("list");

        Book book3 = new Book("Война и Мир", "Лев Толстой");
        Book book4 = new Book("Анна Каренина", "Лев Толстой");
        Book book5 = new Book("Преступление и наказание", "Федор Достоевский");

        reader1.returnBook(book1);
        reader1.printStatus();

        reader1.takeBook(book3);
        reader1.takeBook(book4);
        reader1.takeBook(book5);

        reader1.printStatus();
        reader1.printStatus("full");

        library.printAllReaders();

        reader2.takeBook("Гарри Поттер", "Дж.К.Роулинг");
        reader2.takeBook("Властелин Колец", "Дж.Р.Р.Толкин");
        reader2.printStatus("full");
    }
}