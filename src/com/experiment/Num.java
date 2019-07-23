package com.experiment;

public class Num implements IAbleToAdd {
    private String name;
    private int value;

    public Num(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int add() {
        return this.value + 10;
    }

    @Override
    public void read(int total) {
        System.out.println("The total was: " + total);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
