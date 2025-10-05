package com.company.professions;

public class Driver {
    private String driverFio; //ФИО
    private int drivingExperience; //Стаж вождения

    //Конструкторы
    public Driver() {}

    public Driver(String driverFio, int drivingExperience) {
        this.driverFio = driverFio;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "\n\tDriver" +
                "\n\t\t{" +
                "\n\t\tdriverFio='" + driverFio + '\'' +
                "\n\t\t, drivingExperience=" + drivingExperience +
                "\n\t\t}";
    }

    public String getDriverFio() {
        return driverFio;
    }

    public void setDriverFio(String driverFio) {
        this.driverFio = driverFio;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
