package com.cydeo;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE; // each constant is a object (new) of Operation

    private Operation() { // Constructor private by default can not change
        System.out.println("Constructor");
    }
}
