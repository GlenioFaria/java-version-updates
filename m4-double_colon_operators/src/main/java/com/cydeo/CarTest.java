package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        System.out.println("Zero Argument Constructor");

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());// get() is a Supplier abstract method that return<T>

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        System.out.println("One Argument Constructor");

        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car :: new;
        System.out.println(f2.apply(1).getModel());

        System.out.println("Two argument Constructor");

        BiFunction<String,Integer,Car> b1 = (make,model) -> new Car();
        BiFunction<String,Integer,Car> b2 = Car :: new;
        Car ford = b2.apply("Ford",250);
        System.out.println(ford.getModel()+" "+ford.getMake());









    }
}
