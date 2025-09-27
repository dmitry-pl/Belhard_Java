import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Новый читатель
        Reader reader1 = new Reader("Ivan", "Ivanovich", "Ivanov", 11101
                , "IEF", LocalDate.of(2002, 10, 27), "+375291309876");
        System.out.println("Добавлен читатель:\n" + reader1.GetUserFullInfo());
        //Добавление книги
        reader1.takeBook("Война и Мир", "Л.Н.Толстой");
        //Добавление идентичной книги
        reader1.takeBook("Война и Мир", "Л.Н.Толстой");
        //Попытка возврата книги, которой нет
        reader1.returnBook(new Book("Раскраска для малышей", "Феодот Пынченко"));
        //Возврат книги, которая есть
        reader1.returnBook("Война и Мир");
        //Попытка повторного возврата той же книги
        reader1.returnBook("Война и Мир");

        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book2 = new Book("Собачье сердце", "Михаил Булгаков");
        Book book3 = new Book("Война и Мир", "Лев Толстой");
        Book book4 = new Book("Анна Каренина", "Лев Толстой");
        Book book5 = new Book("Преступление и наказание", "Федор Достоевский");

    }
}