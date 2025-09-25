public class Phone {
    String model;
    String number;
    double weight;

    Phone() {}

    Phone(String model, String number, double weight) {
        this(number, model); // Вызываем конструктор с двумя параметрами
        this.model = model;
        System.out.println("Вызван конструктор с 3 параметрами.");
    }

    Phone(String model, String number) {
        this.model = model;
        this.number = number;
        System.out.println("Вызван конструктор с 2 параметрами.");
    }

    public void receiveCall(String callerName){
        System.out.println("Звонит {" + callerName + "}");
    }

    //Перегруженный метод
    public void receiveCall(String callerName, String callerNumber){
        System.out.println("Звонит {" + callerName + "} номер {" + callerNumber + "}");
    }

    //Метод с переменным количеством параметров
    public void sendMessage(String ... numbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (String num:numbers) {
            System.out.println(" - " + num);
        }
    }

    public String getNumber() {
        return number;
    }
}
