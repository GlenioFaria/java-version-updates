package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,5,6,7);

        List<Integer> unmodifiableList = List.of(2,5,6,7);
        List<Integer> unmodifiableList2 = List.copyOf(unmodifiableList);

    }


}
