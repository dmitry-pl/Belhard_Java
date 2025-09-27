import java.time.LocalDate;
import java.util.Date;

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
}
