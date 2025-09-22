import java.util.Random;
import java.util.Scanner;

/* Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
    Отсортировать массив любым алгоритмом. Вывести массив на экран, после чего ввести с клавиатуры число k,
    найти индекс этого числа в массиве сперва линейным поиском, потом двоичным и вывести на экран этот индекс,
    если число есть в массиве, и количество «шагов», которое каждый алгоритм потратил на выполнение задачи. Например:
    Введите размер массива
    9
    Введите нижний диапазон
    0
    Введите верхний диапазон
    10
    Массив: 1, 2, 2, 3, 5, 6, 7, 8, 8
    Введите искомое значение
    3
    Индекс элемента: 3
    Линейный поиск: 4 шаг(-а)(-ов)
    Двоичный поиск: 3 шаг(-а)(-ов)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int min;
        int max;

        while (true) {
            System.out.print("Введите размер массива (значение больше 0): ");
            size = sc.nextInt();
            if (size > 0) break;
        }

        int[] myArray = new int[size];
        while (true) {
            System.out.print("Введите нижний диапазон значений массива: ");
            min = sc.nextInt();
            System.out.print("Введите верхний диапазон значений массива: ");
            max = sc.nextInt();
            if (min >= max || min < 0 || max < 0) {
                System.out.println("Верхний диапазон должен быть больше нижнего, запрещен ввод отрицательных значений.");
            } else break;
        }

        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(max - min + 1) + min;
        }

        System.out.println("Массив до сортировки:");
        for (int a : myArray) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j + 1] < myArray[j]) {
                    int swap = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = swap;
                }
            }
        }
        System.out.println("\nМассив после сотрировки пузырьком: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nВведите искомое значение: ");
        int elem = sc.nextInt();

        int lineSearch = 0;
        for (int i = 0; i < myArray.length; i++) {
            lineSearch++;
            if (myArray[i] == elem) {
                System.out.println("Индекс элемента: " + i);
                break;
            }
        }

        int lowIndex = 0;
        int highIndex = myArray.length - 1;
        int binarySearch = 0;

        while (lowIndex <= highIndex) {
            binarySearch++;
            int midIndex = (lowIndex + highIndex) / 2;
            if (elem == myArray[midIndex]) {
                System.out.println("Индекс элемента: " + midIndex);
                break;
            } else if (elem < myArray[midIndex]) {
                highIndex = midIndex - 1;
            } else if (elem > myArray[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }
        System.out.println("Линейный поиск: " + lineSearch + " шаг(-а)(-ов)");
        System.out.println("Двоичный поиск: " + binarySearch + " шаг(-а)(-ов)");
    }
}