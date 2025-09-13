public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1.	Создать программу, проверяющую и сообщающую на экран, является ли целое число, 
                \tзаписанное в переменную n, чётным либо нечётным""");
        int n = 5;
        if(n % 2 == 0){
            System.out.println("Число " + n + " четное.");
        } else {
            System.out.println("Число " + n + " не четное.");
        }

        System.out.println("""
                2.	Создать программу, в которой проинициализировать переменную типа int, 
                \tпосле чего вывести на экран день недели, соответствующий этому числу (1 – понедельник, 3 – среда и тд), 
                \tесли такого дня нет, вывести надпись, что такого дня нет. 
                \tСделать реализацию через if-else и через switch""");
        int dayWeek = 3;
        System.out.println("Реализация через if-else");
        if (dayWeek == 1){
            System.out.println("Понедельник");
        } else if (dayWeek == 2) {
            System.out.println("Вторник");
        } else if (dayWeek == 3) {
            System.out.println("Среда");
        } else if (dayWeek == 4) {
            System.out.println("Четверг");
        } else if (dayWeek == 5) {
            System.out.println("Пятница");
        } else if (dayWeek == 6) {
            System.out.println("Суббота");
        } else if (dayWeek == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели нет.");
        }

        System.out.println("Реализация через switch");
        dayWeek = 8;
        switch (dayWeek){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существет");
        }

        System.out.println("""
                3.	Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них""");
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Вариант 1, сравнения.");
        int sum;

        if (a >= b) {
            if (b >= c) {
                sum = a + b; // a ≥ b ≥ c
            } else {
                sum = a + c; // a ≥ c > b
            }
        } else {
            if (a >= c) {
                sum = b + a; // b > a ≥ c
            } else {
                sum = b + c; // b > c > a
            }
        }
        System.out.println("Сумма двух наибольших чисел: " + sum);

        System.out.println("Вариант 1, хитрый))");
        // Находим сумму всех трех чисел
        int totalSum = a + b + c;

        // Находим минимальное число
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        // Сумма двух наибольших = общая сумма - минимальное, хе-хе
        sum = totalSum - min;

        System.out.println("Сумма двух наибольших чисел: " + sum);

        System.out.println("""
                4.	Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, 
                \tчто обычный год насчитывает 365 дней, а високосный — 366 дней. Високосным считается год, делящийся на 4, 
                \tза исключением тех годов, которые делятся на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 
                \tне являются високосными, а 1200 и 2000 — являются).""");
        int yearNumber = 2024;
        boolean flag = false;

        if (yearNumber % 4 == 0) {
            if (yearNumber % 100 == 0 && yearNumber % 400 != 0){
                flag = false;
            } else flag = true;
        } else flag = false;
        if (flag) {
            System.out.println("Год " + yearNumber + " является высокосным.");
        } else System.out.println("Год " + yearNumber + " не является высокосным.");
    }

}