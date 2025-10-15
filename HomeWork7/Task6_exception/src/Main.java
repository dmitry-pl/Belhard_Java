import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern FIO_PATTERN = Pattern.compile("^[а-яА-Я]");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Проверка ФИО и возраста ====");
        System.out.println("Плешко Дмитрий Викторович 38");
        System.out.println("Для выхода введите exit");

        while (true) {
            System.out.println("Введите ФИО и возраст через пробел:");
            String input = scanner.nextLine().trim();
            if(input.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    //public static
}