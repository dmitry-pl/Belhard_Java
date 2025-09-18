import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerRow = new Scanner(System.in);
        Scanner scannerCol = new Scanner(System.in);
        System.out.println("Введите количество строк массива:");
        int rowN = scannerRow.nextInt();
        System.out.println("Введите количество колонок массива:");
        int colN = scannerCol.nextInt();
        int[][] myArray = new int[rowN][colN];

        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length; j++){
                myArray[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Массив:");
        for(int[] i: myArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); //Для переноса на новую строку
        }
    }
}