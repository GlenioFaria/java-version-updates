package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(500, Color.RED));

        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        Comparator<Apple> sortApple2 = comparing(Apple :: getWeight);
        inventory.sort(comparing(Apple :: getWeight));
        System.out.println(inventory);

    }
}
