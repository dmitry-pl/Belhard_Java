import java.time.LocalDate;

public class Reader {
    private String firstname;
    private String surname;
    private  String lastname;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate birthDate;
    private String phoneNumber;
    private Book[] books;
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
        this.countBook = 0;
        this.books = new Book[MAX_BOOKS];
    }
    //Получаем всю информацию по читателю
    public String GetUserFullInfo() {
        return firstname + " " + surname + " " + lastname + " (" + getFIO() + ") карта читателя: " + libraryCardNumber
                + " факультет: " + faculty + " дата рождения: " + birthDate + " телефон: " + phoneNumber;
    }

    //Получение ФИО
    public String getFIO() {
        return lastname + " " + firstname.charAt(0) + "." + surname.charAt(0) + ".";
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

    //Перегруженный метод printStatus с детализацией информации

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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
