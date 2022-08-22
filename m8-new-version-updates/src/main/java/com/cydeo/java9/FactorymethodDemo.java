package com.cydeo.java9;

import java.util.*;

public class FactorymethodDemo {

    public static void main(String[] args) {

        //Creating unmodifiable LIst before JAva9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
       // courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable LIst after JAva9
        List<String> myCourses = List.of("Java","Spring","Agile");

        //Creating unmodifiable Set after JAva9
        Set<String> myProduct = Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map after JAva9
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)

        );



    }
}
