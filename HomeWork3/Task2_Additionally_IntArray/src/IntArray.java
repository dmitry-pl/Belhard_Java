import java.util.Random;

public class IntArray {
    private int[] numArray;

    IntArray() {
        numArray = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rnd.nextInt(100);
        }
        System.out.println("Вызван конструктор по умолчанию. Создан массив из 10 элементов, " +
                "заполнен случайными числами от 0 до 100");
    }
    IntArray(int size) {
        numArray = new int[size];
        System.out.println("Вызван конструктор, принимающий размер массива. Создан массив размером " + size);
    }
    IntArray(int[] numArray) {
        this.numArray = numArray;
        System.out.println("Вызван конструктор, принимающий массив. Массив инициализирован.");
    }

    public void PrintArray() {
        for (int number : numArray) {
            System.out.print(number + " ");
        }
    }

    static void PrintArray(int[] printArray) {
        for (int number : printArray) {
            System.out.print(number + " ");
        }
    }

    public void Sort(boolean isSortUp) {
        if(isSortUp) {
            SortArrayUp();
        } else SortArrayDown();
    }
    //Sort up
    private void SortArrayUp() {
        for (int i = 0; i < numArray.length - 1; i++) {
            for(int j = 0; j < numArray.length - i - 1; j++) {
                if(numArray[j + 1] < numArray[j]) {
                    int swap = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = swap;
                }
            }
        }
    }
    //Sort down
    private void SortArrayDown() {
        for (int i = 0; i < numArray.length - 1; i++) {
            for(int j = 0; j < numArray.length - i - 1; j++) {
                if(numArray[j + 1] > numArray[j]) {
                    int swap = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = swap;
                }
            }
        }
    }

    public int[] getNumArray() {
        return numArray;
    }

    public void setNumArray(int[] numArray) {
        this.numArray = numArray;
    }
}
