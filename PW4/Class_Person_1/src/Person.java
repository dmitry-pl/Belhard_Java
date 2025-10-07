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
    public void printAgeGroup() {
        if (age <= 0) {
            System.out.println("Ещё не родился?)))");
            return;
        }
        String ageGroup;
        if(age <= 12) {
            ageGroup = "Детство";
        } else if(age <= 17) {
            ageGroup = "Юность";
        } else if (age <= 44) {
            ageGroup = "Молодость";
        } else if (age <= 59) {
            ageGroup = "Зрелость";
        } else if (age <= 74) {
            ageGroup = "Пожилой возраст";
        } else if (age <= 90) {
            ageGroup = "Старость";
        } else {
            ageGroup = "Долгожительство";
        }
        System.out.println(ageGroup);
    }

    //Перегруженный метод
    public void printAgeGroup(int age) {
        if (age <= 0) {
            System.out.println("Ещё не родился?)))");
            return;
        }
        String ageGroup;
        if(age <= 12) {
            ageGroup = "Детство";
        } else if(age <= 17) {
            ageGroup = "Юность";
        } else if (age <= 44) {
            ageGroup = "Молодость";
        } else if (age <= 59) {
            ageGroup = "Зрелость";
        } else if (age <= 74) {
            ageGroup = "Пожилой возраст";
        } else if (age <= 90) {
            ageGroup = "Старость";
        } else {
            ageGroup = "Долгожительство";
        }
        System.out.println(ageGroup);
    }
}
