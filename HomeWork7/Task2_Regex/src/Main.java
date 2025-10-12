import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
2.	Регулярное выражение, описывающее ссылку.
Создать программу, которая, используя регулярное выражение, умеет в тексте распознавать ссылку,
заканчивающуюся на .com. Текст можно вводить с клавиатуры
 */
public class Main {
    public static void main(String[] args) {
        String regex = "\\b(?:https?://)?(?:www\\.)?([a-zA-Z0-9](\\.)?[a-zA-Z0-9_-]?)+\\.com\\b";
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Введите строку для проверки:");
        String address = scanner.nextLine();
        Matcher matcher = pattern.matcher(address);
        int counter = 1;
        while (matcher.find()) {
            System.out.println("Найдена ссылка №" + counter + " - " + matcher.group());
            counter++;
        }
    }
}