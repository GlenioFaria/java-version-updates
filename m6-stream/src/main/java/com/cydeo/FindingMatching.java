package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean dishMatch = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(dishMatch);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0, 100).parallel().findAny().getAsInt());
        System.out.println(IntStream.range(0, 100).parallel().findFirst().getAsInt());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        //Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        //Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("D")).findFirst();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("D")).findFirst();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //MIN AND MAX
        System.out.println("Min");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax =DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());


    }


}
