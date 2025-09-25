import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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

    }
}