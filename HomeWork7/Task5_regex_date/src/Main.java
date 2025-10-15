/*
5.	Выбрать существующие даты между 1000 и 2012 годом. Секунды могут быть опущены. В каждом месяце 30 дней.
    То есть дата в определённом формате вводится с клавиатуры, после чего, с помощью регулярного выражения,
    определяется, существует такая дата, или нет. Пример:
    2012/09/18 12:10 – существует
    2012/24/18 12:10 – не существует
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final String DATE_REGEX =
            "^(" +
                    "(1[0-9]{3})|" +
                    "(200[0-9])|" +
                    "(201[0-2])" +
                    ")/" +
                    "(0[1-9]|1[0-2])/" +
                    "(0[1-9]|[12][0-9]|30)" +
                    " " +
                    "([01][0-9]|2[0-3]):" +
                    "([0-5][0-9])" +
                    "$";

    private static final Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);

    public static void main(String[] args) {
        // Для теста
        testDate();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Простой валидатор дат ===");
        System.out.println("Формат: ГГГГ/ММ/ДД ЧЧ:ММ (1000-2012 гг., все месяцы по 30 дней)");
        System.out.println("Для выхода введите exit");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("\nВведите дату: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            if (isValidDate(input)) {
                System.out.println("Дата " + input + " – существует");
            } else {
                System.out.println("Дата " + input + " – не существует");
            }
        }

        scanner.close();
    }

    public static boolean isValidDate(String dateString) {
        return DATE_PATTERN.matcher(dateString).matches();
    }

    public static void testDate() {
        String[] testDates = {
                "2012/09/18 12:10",
                "2012/24/18 12:10",
                "1000/01/01 00:00",
                "2013/05/20 10:30",
                "2012/09/31 12:10",
                "999/05/20 10:30",
                "2012/09/18 24:10",
                "2012/09/18 12:60"
        };

        for (String date : testDates) {
            boolean isValid = isValidDate(date);
            System.out.println((isValid ? "Y" : "N") + " " + date);
        }
    }
}