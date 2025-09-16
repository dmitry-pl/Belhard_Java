import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] myArray = new int[5];
        int[] myArray = {1,2,3,4,5};
        for (int j : myArray) {
            System.out.println(j);
        }
        char[] charArray = {'H','e','l','l','o','!'};
        String str = new String(charArray);
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str);
        char[] charArr = str.toCharArray();
        for(char i: charArr){
            System.out.println(i);
        }
        String str2 = "Hello!";
        System.out.println(str.equals(str2));

        Random random = new Random();
        int rNum1 = random.nextInt();
        System.out.println(rNum1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number (0 - exit):");
        while (true) {
            int inputNum = scanner.nextInt();
            if(inputNum == 0) return;
            System.out.println("Введенное значение - " + inputNum);
        }
    }
}