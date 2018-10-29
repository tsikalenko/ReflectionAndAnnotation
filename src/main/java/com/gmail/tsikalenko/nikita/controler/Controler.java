package com.gmail.tsikalenko.nikita.controler;

import com.gmail.tsikalenko.nikita.model.Model;
import com.gmail.tsikalenko.nikita.model.Truck;

public class Controler {

    Model model = new Model();

    public void userMethod() {
//        model.callTruckMethod();
        model.showClassInfo(Truck.class);
    }
}
