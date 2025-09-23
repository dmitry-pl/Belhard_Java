public class Person {
    private String name;
    private String surname;
    private String profession;
    private int age;

    public Person () {}

    public Person (String name, String surname, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
    }

    //Определение возрастной группы
    static void printAgeGroup(int age) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
