import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

/*
Автомобили
1.	Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
2.	Класс Driver содержит поля - ФИО, стаж вождения.
3.	Класс Engine содержит поля - мощность, производитель.
4.	Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
5.	Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
6.	Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью

 */
public class Main {
    public static void main(String[] args) {
        // Создаем водителей
        Driver truckDriver = new Driver("Иванов Петр Сидорович", 15);
        Driver sportDriver = new Driver("Петров Алексей Владимирович", 8);

        // Создаем двигатели
        Engine truckEngine = new Engine(450, "Cummins");
        Engine sportEngine = new Engine(650, "Ferrari");

        // Создаем грузовик
        Lorry truck = new Lorry("Volvo", "Грузовой", 8000, truckDriver,
                truckEngine, 20.5);

        // Создаем спортивный автомобиль
        SportCar sportCar = new SportCar("Ferrari", "Спортивный", 1500,
                sportDriver, sportEngine, 320);

        // Демонстрация работы методов
        System.out.println("=== ГРУЗОВИК ===");
        System.out.println(truck.toString());
        truck.start();
        truck.turnRight();
        truck.turnLeft();
        truck.stop();

        System.out.println("\n=== СПОРТИВНЫЙ АВТОМОБИЛЬ ===");
        System.out.println(sportCar.toString());
        sportCar.start();
        sportCar.turnLeft();
        sportCar.stop();
    }
}