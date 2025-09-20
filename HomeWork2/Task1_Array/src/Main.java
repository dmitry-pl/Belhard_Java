import java.util.Random;

public class Main {
    /*1.Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью*/
    public static void main(String[] args) {
        int[] myArray = new int[4];
        int min = 10;
        int max = 99;
        boolean flag = true;

        Random rnd = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = rnd.nextInt(max - min + 1) + min;
        }
        //Выводим массив в строку и определяем возрастающая ли это последовательность
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
            if(flag && i != 0 && myArray[i] < myArray[i - 1]){
                flag = false;
            }
        }
        System.out.println("\nПолученный массив " + (flag? "": "НЕ ") + "является строго возрастающей последовательностью чисел.");
    }
}