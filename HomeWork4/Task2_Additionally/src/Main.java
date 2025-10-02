import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int countReaders = 0;
    private static Reader[] readers = new Reader[10]; //По умолчанию на 10 читателей

    public static void main(String[] args) {
        int action;

        initializeTestData();

        System.out.println("🏛️  Добро пожаловать в систему управления библиотекой!");
        System.out.println("==============================================");
        do {
            printMenu();
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    addNewReader();
                    break;
                case 2:
                    takeBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    printReaderStatus();
                    break;
                case 5:
                    printAllReadersStatus();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Нет такой команды. Проверьте корректность ввода.");
            }
        } while (action != 0);
        scanner.close();
    }

    //Основное меню
    private static void printMenu() {
        System.out.println("\n📋 МЕНЮ:");
        System.out.println("1 - Добавить нового читателя");
        System.out.println("2 - Читатель хочет взять книгу");
        System.out.println("3 - Читатель хочет вернуть книгу");
        System.out.println("4 - Вывести статус читателя");
        System.out.println("5 - Вывести статусы всех читателей");
        System.out.println("0 - Выйти из программы");
    }

    private static void addNewReader() {
        System.out.println("\n👤 ДОБАВЛЕНИЕ НОВОГО ЧИТАТЕЛЯ");

        System.out.print("Введите Имя читателя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите Отчество читателя: ");
        String surName = scanner.nextLine();

        System.out.print("Введите Фамилию читателя: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите номер читательского билета: ");
        String ticketNumber = scanner.nextLine();

        // Проверяем, нет ли уже читателя с таким билетом
        if (findReaderByCard(ticketNumber) != null) {
            System.out.println("❌ Читатель с таким номером билета уже существует!");
            return;
        }

        System.out.print("Введите факультет: ");
        String faculty = scanner.nextLine();

        System.out.print("Введите дату рождения (гггг-мм-дд): ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate;
        birthDate = LocalDate.parse(birthDateStr);


        System.out.print("Введите телефон: ");
        String phone = scanner.nextLine();

        Reader newReader = new Reader(firstName, surName, lastName, ticketNumber, faculty, birthDate, phone);
        readers[countReaders] = newReader;
        countReaders++;

        System.out.println("✅ Читатель " + newReader.getFullFIO() + " успешно добавлен!");
    }

    private static void takeBook() {
        System.out.println("\n📖 ВЗЯТИЕ КНИГИ");

        System.out.print("Введите название книги: ");
        String bookName = scanner.nextLine();

        System.out.print("Введите автора книги: ");
        String authorName = scanner.nextLine();

        Book book = new Book(bookName, authorName);

        System.out.print("Введите номер читательского билета: ");
        String ticketNumber = scanner.nextLine();

        Reader reader = findReaderByCard(ticketNumber);
        if (reader == null) {
            System.out.println("❌ Читатель с номером билета '" + ticketNumber + "' не найден!");
            return;
        }
        reader.takeBook(book);
    }

    private static void returnBook() {
        System.out.println("\n📚 ВОЗВРАТ КНИГИ");

        System.out.print("Введите название возвращаемой книги: ");
        String bookName = scanner.nextLine();

        System.out.print("Введите номер читательского билета: ");
        String ticketNumber = scanner.nextLine();

        Reader reader = findReaderByCard(ticketNumber);
        if (reader == null) {
            System.out.println("❌ Читатель с номером билета '" + ticketNumber + "' не найден!");
            return;
        }
        reader.returnBook(bookName);
    }

    private static void printReaderStatus() {
        System.out.println("\n👤 СТАТУС ЧИТАТЕЛЯ");

        System.out.print("Введите номер читательского билета: ");
        String ticketNumber = scanner.nextLine();

        Reader reader = findReaderByCard(ticketNumber);
        if (reader == null) {
            System.out.println("❌ Читатель с номером билета '" + ticketNumber + "' не найден!");
            return;
        }
        reader.printStatus();
    }

    private static void printAllReadersStatus() {
        System.out.println("\n👥 СТАТУСЫ ВСЕХ ЧИТАТЕЛЕЙ");

        if (countReaders == 0) {
            System.out.println("📭 В системе нет зарегистрированных читателей.");
            return;
        }

        System.out.println("Всего читателей: " + countReaders);
        System.out.println("-".repeat(50));

        for (int i = 0; i < countReaders; i++) {
            readers[i].printStatus();
        }
    }

    private static Reader findReaderByCard(String libraryCardNumber) {
        if (countReaders == 0) {
            System.out.println("📭 В системе нет зарегистрированных читателей.");
            return null;
        } else {
            for (int i = 0; i < countReaders; i++) {
                if (readers[i].getLibraryCardNumber().equals(libraryCardNumber)) {
                    return readers[i];
                }
            }
        }
        return null;
    }

    private static void initializeTestData() {
        // Добавляем тестовых читателей для демонстрации
        readers[0] = new Reader("Петр", "Иванович", "Козлов", "001",
                "Филологический", LocalDate.of(1995, 3, 15), "+79990000001");
        readers[1] = new Reader("Анна", "Владимировна", "Сидорова", "002",
                "Математический", LocalDate.of(1998, 7, 22), "+79990000002");
        readers[2] = new Reader("Дмитрий", "Иванович", "Козлов", "003",
                "Исторический", LocalDate.of(1993, 11, 5), "+79990000003");
        countReaders = 3;

        // Добавляем тестовые книги некоторым читателям
        readers[0].takeBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        readers[0].takeBook(new Book("Преступление и наказание", "Федор Достоевский"));
        readers[1].takeBook(new Book("Война и мир", "Лев Толстой"));

        System.out.println("✅ Загружены тестовые данные: 3 читателя");
    }

}