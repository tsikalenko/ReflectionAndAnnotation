package com.gmail.tsikalenko.nikita.model;


import com.gmail.tsikalenko.nikita.util.Util;
import com.gmail.tsikalenko.nikita.view.View;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Truck extends Car implements ITruck {
    private double loadCapacity;
    @MyAnnotation
    private double freeSpace;

    public Truck() {
        super();
    }

    public Truck(String model, int numberCilindrs, int horsePowers, double loadCapacity) {
        super(model, numberCilindrs, horsePowers);
        this.loadCapacity = loadCapacity;
        freeSpace = loadCapacity;
    }

    @Override
    @MyAnnotation
    public void loading() {
        double load = inputLoadSize();
        if (load > loadCapacity) {
            if (freeSpace == 0) {
                View.showMesege(Util.TRUCK_IS_FULL);
            }
            View.showMesege(Util.SIZE_LOAD_IS_LARGE);
            return;
        }
        freeSpace -= load;
        View.showMesege(Util.FREE_SPACE);
        View.showDouble(freeSpace);
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "loadCapacity=" + loadCapacity +
                '}';
    }


    @Override
    @MyAnnotation
    public void unloading() {
        freeSpace = loadCapacity;
        View.showMesege(Util.TRUCK_IS_FREE);
    }

    private double inputLoadSize() {
        Scanner sc = new Scanner(System.in);
        View.showMesege(Util.MAX_LOAD);
        View.showDouble(loadCapacity);
        View.showMesege(Util.INPUT_LOAD_SIZE);
        while (!sc.hasNextDouble()) {
            View.showMesege(Util.INCORRECT_INPUT);
            sc.next();
        }

        return sc.nextDouble();
    }
}
