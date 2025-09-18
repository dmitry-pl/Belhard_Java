import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        int tempNum;

        System.out.println("Массив до реверса:");
        for(int i:myArray){
            System.out.print(i + " ");
        }

        for(int i = 0; i < myArray.length / 2.0; i++){
            tempNum = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = tempNum;
            //System.out.print(i + " ");
        }

        System.out.println("\nМассив после реверса:");
        for(int i:myArray){
            System.out.print(i + " ");
        }
    }
}