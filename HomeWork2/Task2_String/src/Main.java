import java.util.Scanner;

/* С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод.
    Далее с клавиатуры вводятся два символа (a и b), после чего нужно вывести строку, в которой все символы a нужно заменить на символы b.
    Пример: срока – «Java 11», символы «1» и «H», результат «Java HH» */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = new String();
        while (true) {
            System.out.println("Введите строку: ");
            myStr = sc.nextLine();
            if(myStr.isEmpty()) {
                System.out.println("Строка пустая.");
            } else break;
        }
        System.out.println("Введите символ, который необходимо заменить:");
        char elemForChange = sc.next().charAt(0);
        System.out.println("Введите символ для замены:");
        char elemChange = sc.next().charAt(0);
        char[] myArray = myStr.toCharArray();

        System.out.println("Строка до замены - " + myStr);

        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i] == elemForChange) {
                myArray[i] = elemChange;
            }
        }

        String strChange = new String(myArray);
        System.out.println("Строка после замены - " + strChange);
    }
}