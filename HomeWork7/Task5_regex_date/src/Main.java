/*
5.	Выбрать существующие даты между 1000 и 2012 годом. Секунды могут быть опущены. В каждом месяце 30 дней.
    То есть дата в определённом формате вводится с клавиатуры, после чего, с помощью регулярного выражения,
    определяется, существует такая дата, или нет. Пример:
    2012/09/18 12:10 – существует
    2012/24/18 12:10 – не существует
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Простой валидатор дат ===");
        System.out.println("Формат: ГГГГ/ММ/ДД ЧЧ:ММ (1000-2012 гг., все месяцы по 30 дней)");
        System.out.println("Пример: 2012/09/18 12:10");
        System.out.println("Для выхода из программы напишите exit");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("\nВведите дату: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

            if (isValidCustomDate(input)) {
                System.out.println("Дата " + input + " – существует");
            } else {
                System.out.println("Дата " + input + " – не существует");
            }
        }

        scanner.close();
    }

    public static boolean isValidCustomDate(String dateString) {
        String regex = "^(\\d{4})/(\\d{2})/(\\d{2}) (\\d{2}):(\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);

        if (!matcher.find()) {
            return false;
        }

            int year = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int day = Integer.parseInt(matcher.group(3));
            int hour = Integer.parseInt(matcher.group(4));
            int minute = Integer.parseInt(matcher.group(5));

            return year >= 1000 && year <= 2012 &&
                    month >= 1 && month <= 12 &&
                    day >= 1 && day <= 30 &&
                    hour >= 0 && hour <= 23 &&
                    minute >= 0 && minute <= 59;

    }
}