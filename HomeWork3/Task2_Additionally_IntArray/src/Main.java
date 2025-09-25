public class Main {
    public static void main(String[] args) {
        // Определить класс IntArray, который будет в себе содержать в качестве поля массив чисел.
        // Создать для такого класса конструкторы, в которые можно передавать количество элементов массива,
        // уже готовый массив. Создать конструктор без параметров, который будет создавать массив из 10 элементов.
        // Добавить в класс метод сортировки sort (любой на выбор), который в себя принимает в качестве
        // параметра boolean значение, если оно положительное (true), то массив внутри объекта сортируется
        // по возрастанию, если отрицательное (false), то по убыванию. Добавить методы, с помощью которых
        // можно будет работать с внутренним массивом без прямого обращения к нему (геттеры, сеттеры и тд)
        IntArray intArray1 = new IntArray();
        intArray1.PrintArray();
        IntArray intArray2 = new IntArray(20);
        intArray2.PrintArray();
        int[] intArray = {1, 2, 3, 4, 5, 6, 999};
        IntArray intArray3 = new IntArray(intArray);
        intArray3.PrintArray();

        IntArray intArray5 = new IntArray();
        System.out.println("Массив до сортировки:");
        intArray5.PrintArray();
        intArray5.Sort(true);
        System.out.println("\nМассив после сортировки по возрастанию:");
        intArray5.PrintArray();
        intArray5.Sort(false);
        System.out.println("\nМассив после сортировки по убыванию:");
        intArray5.PrintArray();

        //Геттер и сеттер
        System.out.println("\nПроверяем работу set/get и static метода:");
        IntArray intArray6 = new IntArray(7);
        int[] setArray = {2, 1, 4, 2, 5, 2, 7};
        intArray6.setNumArray(setArray);
        IntArray.PrintArray(intArray6.getNumArray());
    }
}