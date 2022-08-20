package com.cydeo;

public enum Currency { // Final Class

    PENNY(1), NICKLE(5), DIME (10), QUARTER(25) ;// static final by default ;

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
