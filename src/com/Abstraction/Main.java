package com.Abstraction;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Lab");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Bob");
        penguin.eat();
        penguin.fly();
    }
}
