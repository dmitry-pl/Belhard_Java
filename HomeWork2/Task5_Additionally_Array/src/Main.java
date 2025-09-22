import java.util.Random;
import java.util.Scanner;

/* Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры число n и найти, есть ли оно в массиве,
    и, если есть, вывести его индекс на экран. Использовать линейный поиск*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Создание массива. Вывод массива:");
        int[] myArray = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(100);
        }
        for(int i:myArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nВведите число: ");
        int elem = sc.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == elem){
                System.out.println("Найдено совпадение, индекс = " + i);
            }
        }
    }
}
