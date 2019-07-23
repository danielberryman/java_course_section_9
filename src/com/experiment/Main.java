package com.experiment;

public class Main {

    public static void main(String[] args) {
        Num number = new Num("one", 1);
        add(number);
    }

    public static void add(IAbleToAdd num) {
        System.out.println(num.add());
    }
}
