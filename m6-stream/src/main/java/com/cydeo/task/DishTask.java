package com.cydeo.task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                //.map(i->i.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        // Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish :: getName)
                //.map(i->i.length())
                .map(String :: length)
                .forEach(System.out::println);

        //Print three high caloric dish name(>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
