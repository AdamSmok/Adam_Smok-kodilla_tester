package com.kodilla.jacoco;

public class Year {
    private int value;

    public Year(int value) {
        this.value = value;
    }

    public boolean isLeap() {
        return (this.value % 4 == 0) && ((this.value % 100 != 0) || (this.value % 400 == 0));
    }
}