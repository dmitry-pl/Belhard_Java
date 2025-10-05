/*
Интерфейс Инструмент
1.	Создать интерфейс Instrument и реализующие его классы Guiter, Drum и Tuba.
2.	Интерфейс Instrument содержит метод play() и переменную String KEY ="До мажор".
3.	Guiter содержит переменные класса количество струн, Drum - размер, Tuba - диаметр.
4.	Создать массив типа Instrument, содержащий инструменты разного типа.
5.	В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".
 */
public class Main {
    public static void main(String[] args) {
        Instrument [] instruments = {new Guiter(7)
                , new Drum(10), new Tuba(2)};

        for (Instrument instrument:instruments) {
            instrument.play();
        }
    }
}