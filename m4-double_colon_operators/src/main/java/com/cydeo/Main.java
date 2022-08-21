package com.cydeo;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> pred = p -> p % 2 == 0 ? true : false;

        Calculate sum = (x,y)-> System.out.println(x+y);

        Calculate sum1 = (x,y)-> Calculator.findSum(x,y);

        // Reference toa Static Method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(15,44);

        //Reference to an instance method
        Calculator calc = new Calculator();
        Calculate mult1 = calc::findMultiply;

        Calculate mult2 = new Calculator()::findMultiply;

        BiFunction<String,Integer,String> func = (str, i)-> str.substring(i);
        BiFunction<String,Integer,String> func1 =  String::substring;

        Function<Integer,Double> b= new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

    }
}
