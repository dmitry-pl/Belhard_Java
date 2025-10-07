import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String text = "IvanovVI@mail.ru";
        System.out.println("Проверка 1: " + Pattern.matches(regex, text));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любой адрес email:");
        text = sc.nextLine();
        System.out.println("Проверка 2: " + Pattern.matches(regex, text));
    }
}