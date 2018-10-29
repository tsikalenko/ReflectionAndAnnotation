package com.gmail.tsikalenko.nikita.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Car {
    private String model;
    private int numberCilindrs;
    private double horsePowers;

    public Car() {
    }

    public Car(String model, int numberCilindrs, int horsePowers) {
        this.model = model;
        this.numberCilindrs = numberCilindrs;
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", numberCilindrs=" + numberCilindrs +
                ", horsePowers=" + horsePowers;
    }
}
