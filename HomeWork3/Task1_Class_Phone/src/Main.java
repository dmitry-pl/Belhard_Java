public class Main {
    public static void main(String[] args) {
        //1.	Создайте класс Phone, который содержит переменные number, model и weight.
        //2.	Создайте три экземпляра этого класса.
        //3.	Выведите на консоль значения их переменных.
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.number = "+375293240567";
        phone1.model = "Nokia 3311";
        phone1.weight = 230.30;
        phone2.number = "+375331238745";
        phone2.model = "Samsung Galaxy";
        phone2.weight = 200.0;
        phone3.number = "+375257708097";
        phone3.model = "Xiaomi";
        phone3.weight = 180.05;
        System.out.println("Phone1 - model:" + phone1.model + " number:" + phone1.number + " weight:" + phone1.weight);
        System.out.println("Phone2 - model:" + phone2.model + " number:" + phone2.number + " weight:" + phone2.weight);
        System.out.println("Phone3 - model:" + phone3.model + " number:" + phone3.number + " weight:" + phone3.weight);

        //4.	Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        //      Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        //      Вызвать эти методы для каждого из объектов.
        phone1.receiveCall("Jack");
        phone2.receiveCall("Gloria");
        phone3.receiveCall("Just Bob");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        //5.	Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
        //      переменных класса - number, model и weight.
        //6.	Добавить конструктор, который принимает на вход два параметра для инициализации
        //      переменных класса - number, model.
        //7.	Добавить конструктор без параметров.
        //8.	Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Phone phone4 = new Phone("+375296903030", "Nokia 1100" , 350);
        System.out.println("Phone4 - model:" + phone4.model + " number:" + phone4.number + " weight:" + phone4.weight);

        //9.	Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
        phone4.receiveCall("Jon Yik");
        phone4.receiveCall("Vasiliy", "+375291234565");

        //10.	Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход
        //      номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов
        phone4.sendMessage("+375333140456", "+375296472456", "+375256789045");
    }
}