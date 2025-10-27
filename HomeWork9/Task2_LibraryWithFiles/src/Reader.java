import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reader implements Serializable {

    private String firstname;
    private String surname;
    private String lastname;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate birthDate;
    private String phoneNumber;
    private List<Book> books;
    private int countBook;

    // Константа для максимального количества книг
    private static final int MAX_BOOKS = 10;

    public Reader(String firstname, String surname, String lastname, int libraryCardNumber, String faculty
            , LocalDate birthDate, String phoneNumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.lastname = lastname;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.books = new ArrayList<Book>();
        this.countBook = 0;
    }

    // Получаем всю информацию по читателю
    public String GetUserFullInfo() {
        return firstname + " " + surname + " " + lastname + " (" + getFIO() + ") карта читателя: " + libraryCardNumber
                + " факультет: " + faculty + " дата рождения: " + birthDate + " телефон: " + phoneNumber;
    }

    // Получение краткого ФИО
    public String getFIO() {
        return lastname + " " + firstname.charAt(0) + "" + surname.charAt(0) + ".";
    }

    // Получение полнорого ФИО
    private String getFullFIO() {
        return lastname + " " + firstname + " " + surname;
    }

    // Основной метод для получения книги
    public void takeBook(Book book) {
        if (countBook >= MAX_BOOKS) {
            System.out.println("Читатель " + getFIO() + " не может взять новую книгу, достигнут доступный лимит - " + MAX_BOOKS + " книг.");
            return;
        }

        // Проверяем, есть ли уже такая книга у читателя
        for (Book existingBook : books) {
            if (existingBook.getName().equals(book.getName())) {
                System.out.println("У читателя " + getFIO() + " уже есть книга " + book.getName());
                return;
            }
        }

        books.add(book); // Добавляем книгу в список
        countBook++;
        System.out.println(getFIO() + " взял книгу " + book.getName());
    }

    // Перегруженный метод для получения книги
    public void takeBook(String name, String authorName) {
        takeBook(new Book(name, authorName));
    }

    // Основной метод returnBook
    public void returnBook(String name) {
        // Ищем книгу для возврата
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getName().equals(name)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove); // Удаляем книгу из списка
            countBook--;
            System.out.println("Читатель " + getFIO() + " вернул книгу " + name);
        } else {
            System.out.println("У читателя " + getFIO() + " нет книги " + name);
        }
    }

    // Перегруженный метод returnBook
    public void returnBook(Book book) {
        returnBook(book.getName());
    }

    // Основной метод printStatus
    public void printStatus() {
        if (countBook == 0) {
            System.out.println("У читателя " + getFIO() + " нет ни одной книги.");
            return;
        }

        StringBuilder status = new StringBuilder(getFIO() + " взял " + countBook + getDeclension());
        for (int i = 0; i < books.size(); i++) {
            status.append(": ").append(books.get(i).getName());
            if (i < books.size() - 1) {
                status.append(", ");
            }
        }

        System.out.println(status.toString());
    }

    // Перегруженный метод printStatus с детализацией информации
    public void printStatus(String format) {
        System.out.println("\nПерегруженный метод printStatus\n");
        switch (format.toLowerCase()) {
            case "short":
                System.out.println(getFIO() + " взял " + countBook + getDeclension());
                break;

            case "full":
                System.out.println("=== ЧИТАТЕЛЬ: " + getFullFIO() + " ===");
                System.out.println("Билет: " + libraryCardNumber);
                System.out.println("Факультет: " + faculty);
                System.out.println("Книг на руках: " + countBook);
                if (countBook > 0) {
                    System.out.println("Список книг:");
                    for (Book book : books) {
                        System.out.println("  - " + book.getName() + " (" + book.getAuthorName() + ")");
                    }
                }
                System.out.println("========================================");
                break;

            case "list":
                if (countBook == 0) {
                    System.out.println(getFIO() + " - нет книг");
                } else {
                    System.out.println(getFIO() + " - книги:");
                    for (Book book : books) {
                        System.out.println("  • " + book.getName());
                    }
                }
                break;

            default:
                printStatus();
                break;
        }
    }

    private String getDeclension() {
        return ((countBook == 1) ? " книгу " : (countBook >= 2 && countBook <= 4) ? " книги " : " книг ");
    }

    // Геттеры и сеттеры
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
        this.countBook = books.size();
    }

    public int getCountBook() {
        return countBook;
    }
}