import java.util.Random;
import java.util.Scanner;

/* Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
    Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком» и выведите уже отсортированный массив
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

        System.out.println("Массив до сотрировки: ");
        for (int i:myArray){
            System.out.print(i + " ");
        }

        for (int i = 0; i < myArray.length - 1; i++) {
            for(int j = 0; j < myArray.length - i - 1; j++) {
                if(myArray[j + 1] < myArray[j]) {
                    int swap = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = swap;
                }
            }
        }
        System.out.println("\nМассив после сотрировки пузырьком: ");
        for (int i:myArray){
            System.out.print(i + " ");
        }
    }
}