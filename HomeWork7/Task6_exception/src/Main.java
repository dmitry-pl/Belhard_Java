import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern FIO_PATTERN = Pattern.compile("^[a-zA-Zа-яА-ЯёЁ\\s]+$");

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
        int age = Integer.parseInt(ageStr);

        // Извлекаем ФИО
        StringBuilder fioBuilder = new StringBuilder();
        for (int i = 0; i < strArray.length - 1; i++) {
            fioBuilder.append(strArray[i]);
            if (i < strArray.length - 2) {
                fioBuilder.append(" ");
            }
        }
        String fio = fioBuilder.toString();

        // Валидация ФИО - должно состоять ТОЛЬКО из букв и пробелов
        if (!FIO_PATTERN.matcher(fio).matches()) {
            throw new IncorrectInfoException("ФИО может содержать только буквы и пробелы (без цифр и знаков пунктуации)", input, age);
        }

        // Валидация длины ФИО
        if (fio.length() > 200) {
            throw new IncorrectInfoException("ФИО не может быть длиннее 200 символов", fio, age);
        }

        // Валидация возраста
        if (age < 0 || age > 100) {
            throw new IncorrectInfoException("Возраст должен быть в диапазоне от 0 до 100 лет", fio, age);
        }

        public static void testFio () {
            String[] testCases = {
                    "Иванов Иван Иванович 25",
                    "Петров Петр Петрович 150",
                    "Сидоров Сидор Сидорович -5",
                    "А".repeat(201) + " 30",
                    "Иванов, Иван! Иванович? 25",
                    "John Doe Smith 80",
                    "Иванов Иван 25",
                    "Иванов Иван Иванович abc"
            };

            for (String testCase : testCases) {
                System.out.println("\n--- Тест: " + testCase + " ---");
                try {
                    checkInput(testCase);
                } catch (IncorrectInfoException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    e.printStackTrace();
                } catch (Exception e) {
                    System.err.println("Неожиданная ошибка: " + e.getMessage());
                }
            }
        }
    }
}