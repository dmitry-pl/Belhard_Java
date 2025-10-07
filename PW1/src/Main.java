
public class Main {
    public static void main(String[] args) {
        int count = 7;

        System.out.println("Использование for:");
        for (int i = 7; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("Использование do while:");
        do {
            System.out.println("count = " + count);
            count--;
        } while (count >= 0);

        System.out.println("Использование while(true):");
        count = 7;
        while (true) {
            System.out.println("count = " + count);
            if (count == 0) break;
            count--;
        }
    }
}