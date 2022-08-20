package com.cydeo;

import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);

        System.out.println(Currency.PENNY);

        System.out.println("How to get all  constant");
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies ) {
            System.out.println(currency);
        }


        System.out.println("How to use switch case with enums");

        Currency myCurrency = Currency.QUARTER;
        switch (myCurrency){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;

        }

        System.out.println("Operation Task");

        calculate(4,6,Operation.PLUS);

        System.out.println("How to retrieve the constant value ");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());// give the index number of this constant in enum

    }

    private static void calculate(double x, double y, Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;

        }

    }
}
