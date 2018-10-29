package com.gmail.tsikalenko.nikita.model;

import com.gmail.tsikalenko.nikita.view.View;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Model {

    public Model() {
    }

    public void callTruckMethod() {
        Truck truck = new Truck("Volvo", 8, 500, 10);
        Class<?> classTruck = truck.getClass();

        Method[] methods = classTruck.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                m.setAccessible(true);
                try {
                    m.invoke(truck);
                } catch (InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
