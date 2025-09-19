public class Person {
    String name;
    String surname;
    String profession;
    int age;

    Person (){}

    Person (String name, String surname, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
    }
    //Получение возраста
    public int getAge(){
        return age;
    }
    //Получение ФИ
    public String getFullName(){
        return surname + " " + name;
    }
    //Определение возрастной группы
    public void printAgeGroup(){
        if(age > 0 &&age <= 12) {
            System.out.println("Детство");
        } else if(age >=13 && age <= 17) {
            System.out.println("Юность");
        } else if (age >= 18 && age <= 44) {
            System.out.println("Молодость");
        } else if (age >=45 && age <= 59) {
            System.out.println("Зрелость");
        } else if (age >= 60 && age <= 74) {
            System.out.println("Пожилой возраст");
        } else if (age >= 75 && age <= 90) {
            System.out.println("Старость");
        } else if (age >= 91) {
            System.out.println("Долгожительство");
        } else {
            System.out.println("Ещё не родился?)))");
        }
    }
}
