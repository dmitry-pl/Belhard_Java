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

    public void receiveCall(String caller){
        System.out.println("Звонит {" + caller + "}");
    }

    public String getNumber() {
        return number;
    }
}
