package com.company.details;

public class Engine {
    private int power; //Мощность
    private String manufacturer; //Производитель

    //Конструкторы
    public Engine() {}

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "\n\tEngine" +
                "\n\t\t{" +
                "\n\t\tpower=" + power +
                "\n\t\t, manufacturer='" + manufacturer + '\'' +
                "\n\t\t}";
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
