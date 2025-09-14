public class Main {
    public static void main(String[] args) {
        //Обязательная задача 1
        System.out.println("""
                1.	Создать программу, проверяющую и сообщающую на экран, является ли целое число, 
                \tзаписанное в переменную n, чётным либо нечётным""");
        int n = 5;
        if(n % 2 == 0){
            System.out.println("Число " + n + " четное.");
        } else {
            System.out.println("Число " + n + " не четное.");
        }

        //Обязательная задача 2
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

        //Обязательная задача 3
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

        System.out.println("Вариант 2, хитрый))");
        // Находим сумму всех трех чисел
        int totalSum = a + b + c;

        // Находим минимальное число
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        // Сумма двух наибольших = общая сумма - минимальное, хе-хе
        sum = totalSum - min;

        System.out.println("Сумма двух наибольших чисел: " + sum);

        //Обязательная задача 4
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

        //Дополнительная задача 5
        System.out.println("Дополнительная практика:");
        System.out.println("""
                5.	Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение, 
                \t4 — деление. Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0). 
                \tВыполнить над числами указанное действие и вывести результат.""");
        int operationKind = 4;
        double aNum = 3.5;
        double bNum = 7.3;

        switch (operationKind){
            case 1:
                System.out.println("Операция сложения aNum + bNum = " + (aNum + bNum));
                break;
            case 2:
                System.out.println("Операция вычитания aNum - bNum = " + (aNum - bNum));
                break;
            case 3:
                System.out.println("Операция умножения aNum * bNum = " + (aNum * bNum));
                break;
            case 4:
                System.out.println("Операция деления aNum / bNum = " + (aNum / bNum));
                break;
            default:
                System.out.println("Нет такого вида операции.");
        }

        //Дополнительная задача 6
        System.out.println("""
                6.	Дано целое число, лежащее в диапазоне 0–999. Вывести строку-описание этого числа. 
                \tСтроку-описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.""");

        int inputNumber = 987;

        // Проверяем четность и выводим соответствующее слово без переноса, чтобы сформировать строку
        if (inputNumber == 0) {
            System.out.print("нулевое ");
        } else if (inputNumber % 2 == 0) {
            System.out.print("четное ");
        } else {
            System.out.print("нечетное ");
        }

        // Определяем количество цифр и выводим соответствующее слово
        if (inputNumber == 0) {
            System.out.print("число");
        } else if (inputNumber < 10 && inputNumber > 0) {
            System.out.print("однозначное число");
        } else if (inputNumber < 10 && inputNumber > 0) {
            System.out.print("двузначное число");
        } else if (inputNumber < 1000 && inputNumber > 0){
            System.out.print("трехзначное число");
        } else {
            System.out.println("Но-но-но, договаривались же от 0 до 999.");
        }

        //Дополнительная задача 7
        System.out.println("""
                7.	Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака, 
                \tсоответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5), 
                \t«Близнецы» (21.5–21.6), (22.6-22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), 
                \t«Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).""");
        int dayOfMonth = 23;
        int monthNumber = 12;
        if ((dayOfMonth >= 20 && monthNumber == 1) || (dayOfMonth <= 18 && monthNumber == 2)) {
            System.out.println("Водолей");
        } else if ((dayOfMonth >= 19 && monthNumber == 2) || (dayOfMonth <= 20 && monthNumber == 3)) {
            System.out.println("Рыбы");
        } else if ((dayOfMonth >= 21 && monthNumber == 3) || (dayOfMonth <= 19 && monthNumber == 4)) {
            System.out.println("Овен");
        } else if ((dayOfMonth >= 20 && monthNumber == 4) || (dayOfMonth <= 20 && monthNumber == 5)){
            System.out.println("Телец");
        } else if ((dayOfMonth >= 21 && monthNumber == 5) || (dayOfMonth <= 22 && monthNumber == 6)) {
            System.out.println("Близнецы");
        } else if ((dayOfMonth >= 22 && monthNumber == 6) || (dayOfMonth <= 22 && monthNumber == 7)) {
            System.out.println("Рак");
        } else if ((dayOfMonth >= 23 && monthNumber == 7) || (dayOfMonth <= 22 && monthNumber == 8)){
            System.out.println("Лев");
        } else if ((dayOfMonth >= 23 && monthNumber == 8) || (dayOfMonth <= 22 && monthNumber == 9)) {
            System.out.println("Дева");
        } else if ((dayOfMonth >= 23 && monthNumber == 9) || (dayOfMonth <= 22 && monthNumber == 10)) {
            System.out.println("Весы");
        } else if ((dayOfMonth >= 23 && monthNumber == 10) || (dayOfMonth <= 22 && monthNumber == 11)) {
            System.out.println("Скорпион");
        } else if ((dayOfMonth >= 23 && monthNumber == 11) || (dayOfMonth <= 21 && monthNumber == 12)) {
            System.out.println("Стрелец");
        } else if ((dayOfMonth >= 22 && monthNumber == 12) || (dayOfMonth <= 19 && monthNumber == 1)) {
            System.out.println("Козерог");
        } else {
            System.out.println("Это, похоже, кто-то с Альфа-Центавры...");
        }

        //Дополнительная задача 8
        System.out.println("""
                8.	Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы. 
                \tДостоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. 
                \tДаны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). 
                \tВывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.""");
        int cardSuit = 4;
        int cardValue = 12;

        switch (cardValue){
            case 6:
                System.out.print("шестерка ");
                break;
            case 7:
                System.out.print("семерка ");
                break;
            case 8:
                System.out.print("восьмерка ");
                break;
            case 9:
                System.out.print("девятка ");
                break;
            case 10:
                System.out.print("десятка ");
                break;
            case 11:
                System.out.print("валет ");
                break;
            case 12:
                System.out.print("дама ");
                break;
            case 13:
                System.out.print("король ");
                break;
            case 14:
                System.out.print("туз ");
                break;
            default:
                System.out.print("Джокер ");
        }

        switch (cardSuit){
            case 1:
                System.out.print("пики");
                break;
            case 2:
                System.out.print("треф");
                break;
            case 3:
                System.out.print("бубна");
                break;
            case 4:
                System.out.print("червей");
                break;
            default:
                System.out.print("по ходу :)");
        }

        System.out.println("ЦИКЛЫ.");
        //Обязательная задача 2.1
        System.out.println("""
                1.	Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while""");
        int counterWhile = 1;
        while (counterWhile < 7){
            System.out.println("Task" + counterWhile);
            counterWhile++;
        }

        //Обязательная задача 2.2
        System.out.println("""
                2.	Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.""");
        int counterDoWhile = 1;
        do {
            if(counterDoWhile % 5 == 0){
                System.out.println(counterDoWhile);
            }
            counterDoWhile++;
        } while (counterDoWhile <= 100);

        //Обязательная задача 2.3
        System.out.println("""
                3.	Реализовать подсчет факториала используя цикл for. Результат вывести на экран""");
        int numberForFactorial = 4;
        int resultFactorial = 1;
        for (int i = 1; i <= numberForFactorial; i++){
            resultFactorial *= i;
        }
        if (numberForFactorial < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            System.out.println("Факторил числа " + numberForFactorial + " равен " + resultFactorial);
        }

        //Обязательная задача 2.4
        System.out.println("""
                4.	Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа, 
                \tрасположенные между A и B (не включая числа A и B), а также количество N этих чисел.""");
        int aNumber = 3;
        int bNumber = 9;
        int countDigits = 0;
        if (aNumber >= bNumber) {
            System.out.println("Перечитайте внимательно условия задачи! :)");
        } else {
            for(int i = bNumber - 1; i > aNumber; i--) {
                System.out.println(i);
                countDigits++;
            }
            System.out.println("Общее количество чисел между " + aNumber + " и " + bNumber + " = " + countDigits);
        }

        //Дополнительная задача 2.5
        System.out.println("""
                5.	Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество 
                \tотрезков длины B (без наложений). Не используя операции умножения и деления, 
                \tнайти длину незанятой части отрезка A.""");
        aNumber = 7;
        bNumber = 3;
        if (aNumber <= bNumber) {
            System.out.println("Перечитайте внимательно условия задачи! :)");
        } else {
            do {
                aNumber -= bNumber;
            } while (aNumber >= bNumber);
            System.out.println("Длина незанятой части отрезка А равна " + aNumber);
        }

        //Дополнительная задача 2.6
        System.out.println("""
                6.	Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено максимально 
                \tвозможное количество квадратов со стороной C (без наложений). Найти количество квадратов, 
                \tразмещенных на прямоугольнике.""");

        double A = 10.5;
        double B = 8.2;
        double C = 2.1;
        int squares = 0;

        if (A <= 0 || B <= 0 || C <= 0) {
            System.out.println("Все числа должны быть положительными!");
        } else if (C > A || C > B) {
            System.out.println("Квадрат не помещается в прямоугольник!");
        } else {
            for (int i = 0; i * C < B; i++) {
                for (int j = 0; j * C < A; j++) {
                    squares++;
                }
            }
            System.out.println("Влазит квадратов: " + squares);
        }

        //Дополнительная задача 2.7
        System.out.println("""
                7.	Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления: определить 
                \tимеется ли в записи числа N цифра «2»; найти число, полученное при прочтении числа N справа налево; 
                \tнайти количество и сумму его цифр. Использовать можно любое количество циклов, но чем меньше, тем лучше""");
        int N = 123;

        boolean hasTwo = false;
        int reversed = 0;
        int count = 0;
        int sumDigits = 0;
        int tempN = N;

        while (tempN > 0) {
            int digit = tempN % 10;

            if (digit == 2) {
                hasTwo = true;
            }
            reversed = reversed * 10 + digit;
            count++;
            sumDigits += digit;
            tempN = tempN / 10;
        }

        System.out.println("Исходное число: " + N);
        if (hasTwo) {
            System.out.println("Число " + N + " содержит цифру '2': ");
        }
        System.out.println("Перевернутое число: " + reversed);
        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + sumDigits);

        //Дополнительная задача 2.8
        System.out.println("""
                8.	Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов от 
                \tимеющейся суммы (P — вещественное число, 0<P< 25). По данному P определить, через сколько месяцев размер 
                \tвклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S 
                \t(вещественное число).""");
        double P = 3.0;
        double initialDeposit = 1000.0;
        double targetAmount = 1100.0;

        int K = 0;
        double S = initialDeposit;

        while (S <= targetAmount) {
            K++;
            S = S + S * (P / 100);
        }
        System.out.println("Количество месяцев K: " + K);
        System.out.println("Итоговый размер вклада S: " + S);
    }
}