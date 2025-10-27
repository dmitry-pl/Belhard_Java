import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАПУСК БИБЛИОТЕЧНОЙ СИСТЕМЫ ===");

        // Создаем библиотеку
        Library library = new Library();

        // Если читателей нет, создаем тестовых
        if (library.getReaders().isEmpty()) {
            System.out.println("Создаем тестовых читателей...");
            createTestReaders(library);
        }

        // Работа с библиотекой
        demonstrateLibraryWork(library);

        // Сохраняем данные перед завершением программы
        System.out.println("\n=== СОХРАНЕНИЕ ДАННЫХ ===");
        library.saveData();

        System.out.println("Программа завершена. Данные сохранены.");
    }

    private static void createTestReaders(Library library) {
        Reader reader1 = new Reader("Ivan", "Ivanovich", "Ivanov", 11101,
                "IEF", LocalDate.of(2002, 10, 27), "+375291309876");

        Reader reader2 = new Reader("Petr", "Petrovich", "Petrov", 11102,
                "FIT", LocalDate.of(2001, 5, 15), "+375291112233");

        Reader reader3 = new Reader("Anna", "Sergeevna", "Sidorova", 11103,
                "FIT", LocalDate.of(2000, 3, 8), "+375292223344");

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);

        // Добавляем книги
        reader1.takeBook("Война и Мир", "Л.Н.Толстой");
        reader1.takeBook("Мастер и Маргарита", "Михаил Булгаков");
        reader2.takeBook("Преступление и наказание", "Федор Достоевский");
    }

    private static void demonstrateLibraryWork(Library library) {
        System.out.println("\n=== РАБОТА С БИБЛИОТЕКОЙ ===");

        // Показываем всех читателей
        library.printAllReaders();

        // Работа с конкретными читателями
        Reader reader = library.findReader(11101);
        if (reader != null) {
            System.out.println("Работа с читателем: " + reader.getFIO());
            reader.printStatus("full");

            // Читатель берет еще одну книгу
            reader.takeBook("Анна Каренина", "Лев Толстой");
            reader.printStatus();

            // Возвращает книгу
            reader.returnBook("Война и Мир");
            reader.printStatus();
        }

        // Добавляем нового читателя
        System.out.println("\n--- Добавляем нового читателя ---");
        Reader newReader = new Reader("Maria", "Alexandrovna", "Kuznetsova", 11104,
                "IEF", LocalDate.of(1999, 12, 1), "+375293334455");
        library.addReader(newReader);
        newReader.takeBook("Евгений Онегин", "Александр Пушкин");

        library.printAllReaders();
    }
}