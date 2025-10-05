package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private double loadCapacity; //Грузоподъемность в тоннах

    public Lorry() {}

    public Lorry(String carBrand, String carClass, double weight, Driver driver
            , Engine engine, double loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + loadCapacity + " тонн";
    }
}
