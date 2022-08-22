package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        //toCollection(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        //toSet()  : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSett2 = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toSet());


        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //summingInt (ToIntFunction) : returns a Collector that produces the sum of a Integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting() : returns a Collectors that counts the numbers of the elements
        Long eventCount = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(eventCount);


    }
}
