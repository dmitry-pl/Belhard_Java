public class IncorrectInfoException extends Exception{
    private String firstName;
    private String surName;
    private String lastName;
    private int age;

    public IncorrectInfoException(String message, String firstName, String surName, String lastName, int age) {
        super(message);
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
