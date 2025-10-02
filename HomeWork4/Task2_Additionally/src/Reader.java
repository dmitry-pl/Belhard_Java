import java.time.LocalDate;

public class Reader {
    private String firstname;
    private String surname;
    private  String lastname;
    private String libraryCardNumber;
    private String faculty;
    private LocalDate birthDate;
    private String phoneNumber;
    private Book[] books;
    private int countBook;

    // Константа для максимального количества книг
    private static final int MAX_BOOKS = 10;

    public Reader(String firstname, String surname, String lastname, String libraryCardNumber, String faculty
            , LocalDate birthDate, String phoneNumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.lastname = lastname;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.countBook = 0;
        this.books = new Book[MAX_BOOKS];
    }
    //Получаем всю информацию по читателю
    public String GetUserFullInfo() {
        return firstname + " " + surname + " " + lastname + " (" + getFIO() + ") карта читателя: " + libraryCardNumber
                + " факультет: " + faculty + " дата рождения: " + birthDate + " телефон: " + phoneNumber;
    }

    //Получение краткого ФИО
    private String getFIO() {
        return lastname + " " + firstname.charAt(0) + "" + surname.charAt(0) + ".";
    }

    //Получение полнорого ФИО
    public String getFullFIO() {
        return lastname + " " + firstname + " " + surname;
    }

    //Основной метод для получения книги
    public void takeBook(Book book) {
        if (countBook >= MAX_BOOKS) {
            System.out.println("Читатель " + getFIO() + " не может взять новую книгу, достигнут доступный лимит - " + MAX_BOOKS + " книг.");
            return;
        }
        for(int i = 0; i < countBook; i++){
            if(books[i].getName().equals(book.getName())){
                System.out.println("У читателя " + getFIO() + " уже есть книга " + book.getName());
                return;
            }
        }
        books[countBook] = book;
        countBook++;
        System.out.println(getFIO() + " взял книгу " + book.getName());
    }

    //Перегруженный метод для получения книги
    public void takeBook(String name, String authorName) {
        takeBook(new Book(name, authorName));
    }

    //Основной метод returnBook
    public void returnBook(String name) {
        for(int i = 0; i < countBook; i++){
            if(books[i].getName().equals(name)){
                books[i] = null;
                for(int j = i; j < countBook; j++){
                    books[j] = books[j + 1];
                }
                System.out.println("Читатель " + getFIO() + " вернул книгу " + name);
                countBook--;
                return;
            }
        }
        System.out.println("У читателя " + getFIO() + " нет книги " + name);
    }

    //Перегруженный метод returnBook
    public void returnBook(Book book) {
        returnBook(book.getName());
    }

    //Основной метод printStatus
    public void printStatus() {
        if (countBook == 0) {
            System.out.println("У читателя " + getFIO() + " нет ни одной книги.");
            return;
        }
        String status = getFIO() + " взял " + countBook + getDeclension();
        for (int i = 0; i < countBook; i++) {
            status = status + ": " + books[i].getName() + ((i < countBook - 1)? ", ": "");
        }

        System.out.println(status);
    }

    //Перегруженный метод printStatus с детализацией информации - вывод в разных форматах
    public void printStatus(String format) {
        System.out.println("\nПерегруженный метод printStatus\n");
        switch (format.toLowerCase()) {
            case "short":
                System.out.println(getFIO() + "взял " + countBook + getDeclension());
                break;

            case "full":
                System.out.println("=== ЧИТАТЕЛЬ: " + getFullFIO() + " ===");
                System.out.println("Билет: " + libraryCardNumber);
                System.out.println("Факультет: " + faculty);
                System.out.println("Книг на руках: " + countBook);
                if (countBook > 0) {
                    System.out.println("Список книг:");
                    for (int i = 0; i < countBook; i++) {
                        System.out.println("  - " + books[i].getName());
                    }
                }
                System.out.println("========================================");
                break;

            case "list":
                if (countBook == 0) {
                    System.out.println(getFIO() + " - нет книг");
                } else {
                    System.out.println(getFIO() + " - книги:");
                    for (int i = 0; i < countBook; i++) {
                        System.out.println("  • " + books[i].getName());
                    }
                }
                break;

            default:
                printStatus();
                break;
        }
    }

    private String getDeclension() {
        return ((countBook ==1)? " книгу ":(countBook >=2 && countBook <= 4)? " книги ":" книг ");
    }

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

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
