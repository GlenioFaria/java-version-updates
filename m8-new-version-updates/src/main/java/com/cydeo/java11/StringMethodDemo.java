package com.cydeo.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        var str = "Mike \n Diana \n Tom \n Emmy";

        str.lines().forEach(System.out::println);

    }
}
