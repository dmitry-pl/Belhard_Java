import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern FIO_PATTERN = Pattern.compile("^[a-zA-Zа-яА-ЯёЁ\\s]+\\d+$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Проверка ФИО и возраста ====");
        System.out.println("Пример ввода: Плешко Дмитрий Викторович 38");
        System.out.println("Для выхода введите exit");

        while (true) {
            System.out.println("Введите ФИО и возраст через пробел:");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                checkInput(input);
                System.out.println("Введенные данные корректны.");
            } catch (IncorrectInfoException e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
                System.err.println("Введенные данные - ФИО: '" + e.getFio() + "', Возраст: " + e.getAge());
                System.err.println("Трассировка стека:");
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("Произошла непредвиденная ошибка:");
                e.printStackTrace();
            }
        }
    }

    public static void checkInput(String input) throws IncorrectInfoException {
        String[] strArray = input.split("\\s+");
        if (strArray.length != 4) {
            throw new IncorrectInfoException("Не корректное количество параметров! Введите ФИО (3 части) и возраст.", input, 0);
        }

        // Проверяем, что возраст состоит ТОЛЬКО из цифр
        String ageStr = strArray[strArray.length - 1];
        if (!ageStr.matches("\\d+")) {
            throw new IncorrectInfoException("Возраст должен состоять только из цифр", input, 0);
        }

        // Валидация ФИО - должно состоять ТОЛЬКО из букв и пробелов
        if (!FIO_PATTERN.matcher(input).matches()) {
            throw new IncorrectInfoException(
                    "ФИО может содержать только буквы и пробелы (без цифр и знаков пунктуации)",
                    input,
                    age
            );
        }



    }
}