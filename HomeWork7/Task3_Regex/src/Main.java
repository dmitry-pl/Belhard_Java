import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3.	Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение,
    которое найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
 */
public class Main {
    public static void main(String[] args) {
        String exStr = "ahb acb aeb aeeb adcb axeb";
        String regex = "a.{1}b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(exStr);
        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }
}