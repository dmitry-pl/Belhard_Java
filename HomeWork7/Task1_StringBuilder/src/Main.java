import java.util.Scanner;
/*
1.	Составляем строку с помощью класса StringBuilder
Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace()
 */

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Введите два целых числа, первое число");
        num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        num2 = sc.nextInt();

        StringBuilder res1 = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        StringBuilder res2 = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        StringBuilder res3 = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        System.out.println("Небольшой replace:");
        System.out.println(res1.replace(res1.indexOf("="), (res1.indexOf("=") + 1), "равно"));
        System.out.println(res2.replace(res2.indexOf("="), (res2.indexOf("=") + 1), "равно"));
        System.out.println(res3.replace(res3.indexOf("="), (res3.indexOf("=") + 1), "равно"));

        System.out.println("Время выполнения - " + (System.currentTimeMillis() - start));
    }
}