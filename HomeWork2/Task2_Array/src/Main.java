import java.util.Random;
import java.util.Scanner;

/*  Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний диапазон значений и верхний.
    После чего создать массив размером, который ввел пользователь и заполнить его случайными числами из диапазона,
    введенного пользователем. Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница
    диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать старое значение новым.
    Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int min;
        int max;

        while (true){
            System.out.print("Введите размер массива (значение больше 0): ");
            size = sc.nextInt();
            if(size > 0) break;
        }

        int[] myArray = new int[size];
        while (true) {
            System.out.print("Введите нижний диапазон значений массива: ");
            min = sc.nextInt();
            System.out.print("Введите верхний диапазон значений массива: ");
            max = sc.nextInt();
            if(min >= max || min < 0 || max < 0) {
                System.out.println("Верхний диапазон должен быть больше нижнего, запрещен ввод отрицательных значений.");
            } else break;
        }

        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(max - min + 1) + min;
        }

        for (int a:myArray){
            System.out.print(a + " ");
            }
        }
}