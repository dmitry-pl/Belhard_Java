import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Двумерный массив. Рандомное наполнение и печать каждой строки
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк массива:");
        int rowN = sc.nextInt();
        System.out.println("Введите количество колонок массива:");
        int colN = sc.nextInt();
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
        //Class Person
/*        Scanner scanner = new Scanner(System.in);
        Person man = new Person();
        System.out.println("Поиграем в Бога, создадим нового человека.\nВведите имя: ");
        man.name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        man.surname = scanner.nextLine();
        System.out.println("Введите профессию:");
        man.profession = scanner.nextLine();
        System.out.println("Введите возраст:");
        man.age = scanner.nextInt();
        System.out.println("Возраст нашего человека - " + man.getAge());*/
        //

        //Расширенный класс
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиграем в Бога, создадим нового человека.\nВведите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите профессию:");
        String profession = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        Person man = new Person(name, surname, profession, age);

        System.out.println("ФИ - " + man.getFullName());
        man.printAgeGroup();
    }
}