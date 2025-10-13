import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4.	Дана строка 'ab abab abab abababab abea'. Напишите регулярное выражение,
    которое найдет строки по шаблону: строка 'ab' повторяется 1 или более раз.
 */
public class Main {
    public static void main(String[] args) {
        String forFind = "ab abab abab abababab abea";
        String regex = "(ab)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(forFind);
        while (matcher.find()) {
            System.out.println("Подстрока соответствует - " + matcher.group());
        }
    }
}