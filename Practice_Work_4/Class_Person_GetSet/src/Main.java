import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиграем в Бога, создадим нового человека.\nВведите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите профессию:");
        String profession = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        Person man = new Person();
        man.setName(name);
        man.setSurname(surname);
        man.setProfession(profession);
        man.setAge(age);

        System.out.println("ФИ - " + man.getName() + " " + man.getSurname());

        Person.printAgeGroup(age);
    }
}