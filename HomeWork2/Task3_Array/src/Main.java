import java.util.Random;
import java.util.Scanner;

/* Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
    Определите какой элемент является в этом массиве максимальным и сообщите его индекс */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        System.out.print("Введите нижний диапазон значений массива: ");
        int min = sc.nextInt();
        System.out.print("Введите верхний диапазон значений массива: ");
        int max = sc.nextInt();
        int[] myArray = new int[size];

        Random rnd = new Random();
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(max - min + 1) + min;
        }
        for(int i:myArray){
            System.out.print(i + " ");
        }
        int maxIndex = 0;
        int maxValue = myArray[0];
        for(int i = 0; i < myArray.length; i++) {
            if (i != 0 && myArray[i] > maxValue){
                maxIndex = i;
                maxValue = myArray[i];
            }
        }
        System.out.println("\nМаксимальное значение " + maxValue + ", индекс " + maxIndex);
    }
}