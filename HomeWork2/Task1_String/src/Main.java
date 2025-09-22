import java.util.Scanner;

/* Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
    После чего в консоль выводится количество вхождений символа в строку. Например, строка «Java 11», символ «a», результат: 2*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String myStr = sc.nextLine();
        System.out.println("Введите символ:");
        char elem = sc.next().charAt(0);
        char[] myArray = myStr.toCharArray();
        int counter = 0;

        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i] == elem) {
                counter++;
            }
        }

        System.out.println(elem + " встречается в строке " + myStr + " " + counter + " раз.");
    }
}